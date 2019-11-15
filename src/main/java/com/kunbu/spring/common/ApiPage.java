package com.kunbu.spring.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: spring-practice
 * @description: API分页模型
 * @author: kunbu
 * @create: 2019-08-03 15:16
 **/
public class ApiPage implements Serializable {

    private static final List EMPTY_LIST = new ArrayList();

    private long pageNum;
    private long pageSize;
    private long totalPage;
    private long totalCount;
    private Object list;

    private ApiPage() {
    }

    public static ApiPage empty(long pageNum, long pageSize) {
        ApiPage page = new ApiPage();
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);
        page.setTotalPage(0);
        page.setTotalCount(0);
        page.setList(EMPTY_LIST);
        return page;
    }

    public static ApiPage success(long pageNum, long pageSize, long totalPage, long totalCount, Object list) {
        ApiPage page = new ApiPage();
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);
        page.setTotalPage(totalPage);
        page.setTotalCount(totalCount);
        page.setList(list);
        return page;
    }

    public long getPageNum() {
        return pageNum;
    }

    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }
}
