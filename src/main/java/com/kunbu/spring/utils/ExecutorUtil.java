package com.kunbu.spring.utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.kunbu.spring.utils.log.LoggerUtil;
import org.slf4j.Logger;

import java.util.concurrent.*;

/**
 * @program: spring-practice
 * @description: 线程池
 * @author: kunbu
 * @create: 2019-08-07 10:51
 **/
public class ExecutorUtil {

    private static final Logger log = LoggerUtil.getExecutorLogger();

    private static int cpuSize = Runtime.getRuntime().availableProcessors();

    private static ExecutorService pool = new ThreadPoolExecutor(
            cpuSize,
            cpuSize * 2,
            0L,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<>(1024),
            new ThreadFactoryBuilder().setNameFormat("kunbu-pool-%d").build(),
            new ThreadPoolExecutor.AbortPolicy()) {

        @Override
        protected void afterExecute(Runnable r, Throwable t) {
            if (t instanceof RejectedExecutionException) {
                log.error(">>> ExecutorUtil reject task, r:{}, t:{}", r.toString(), t.getLocalizedMessage(), t);
            }
        }
    };

    public static void addTask(Runnable runnable) {
        pool.execute(runnable);
    }

}
