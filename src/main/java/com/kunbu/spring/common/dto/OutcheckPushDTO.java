package com.kunbu.spring.common.dto;

/**
 * @project: lunar
 * @author: kunbu
 * @create: 2019-08-30 09:32
 **/
public class OutcheckPushDTO extends BaseOutsidePushDTO {

    /** 产品型号 */
    private String productNumber;
    /** 产品编码 */
    private String productCode;
    /** 设备MAC */
    private String mac;
    /** 设备SN */
    private String sn;
    /** 操作人 */
    private String operatorName;
    /** 操作时间 */
    private String operateTime;
    /** 额外信息 */
    private String ext;

    /** 通信类型 */
    private String communicateType;
    /** 产品类型 */
    private String productType;

    public OutcheckPushDTO(String productNumber, String productCode, String mac, String sn, String operatorName, String operateTime, String ext, String communicateType, String productType) {
        this.productNumber = productNumber;
        this.productCode = productCode;
        this.mac = mac;
        this.sn = sn;
        this.operatorName = operatorName;
        this.operateTime = operateTime;
        this.ext = ext;
        this.communicateType = communicateType;
        this.productType = productType;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getCommunicateType() {
        return communicateType;
    }

    public void setCommunicateType(String communicateType) {
        this.communicateType = communicateType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "OutcheckPushDTO{" +
                "productNumber='" + productNumber + '\'' +
                ", productCode='" + productCode + '\'' +
                ", mac='" + mac + '\'' +
                ", sn='" + sn + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", ext='" + ext + '\'' +
                ", communicateType='" + communicateType + '\'' +
                ", productType='" + productType + '\'' +
                "} " + super.toString();
    }
}
