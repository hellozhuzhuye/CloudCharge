package top.smartsoftware.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author xjx
 * @since 2023-11-29
 */
@TableName("t_order")
@ApiModel(value = "Order对象", description = "")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String orderNo;

    private LocalDateTime chargeBeginTime;

    private LocalDateTime chargeEndTime;

    private Integer chargeBeginSoc;

    private Integer chargeEndSoc;

    private BigDecimal chargeDegree;

    private BigDecimal serviceAmount;

    private BigDecimal electricityAmount;

    private BigDecimal totalAmount;

    private Long stationId;

    private Long equipmentId;

    private Long connectorId;

    private Long userId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDateTime getChargeBeginTime() {
        return chargeBeginTime;
    }

    public void setChargeBeginTime(LocalDateTime chargeBeginTime) {
        this.chargeBeginTime = chargeBeginTime;
    }

    public LocalDateTime getChargeEndTime() {
        return chargeEndTime;
    }

    public void setChargeEndTime(LocalDateTime chargeEndTime) {
        this.chargeEndTime = chargeEndTime;
    }

    public Integer getChargeBeginSoc() {
        return chargeBeginSoc;
    }

    public void setChargeBeginSoc(Integer chargeBeginSoc) {
        this.chargeBeginSoc = chargeBeginSoc;
    }

    public Integer getChargeEndSoc() {
        return chargeEndSoc;
    }

    public void setChargeEndSoc(Integer chargeEndSoc) {
        this.chargeEndSoc = chargeEndSoc;
    }

    public BigDecimal getChargeDegree() {
        return chargeDegree;
    }

    public void setChargeDegree(BigDecimal chargeDegree) {
        this.chargeDegree = chargeDegree;
    }

    public BigDecimal getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(BigDecimal serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public BigDecimal getElectricityAmount() {
        return electricityAmount;
    }

    public void setElectricityAmount(BigDecimal electricityAmount) {
        this.electricityAmount = electricityAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Long getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(Long connectorId) {
        this.connectorId = connectorId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id = " + id +
            ", orderNo = " + orderNo +
            ", chargeBeginTime = " + chargeBeginTime +
            ", chargeEndTime = " + chargeEndTime +
            ", chargeBeginSoc = " + chargeBeginSoc +
            ", chargeEndSoc = " + chargeEndSoc +
            ", chargeDegree = " + chargeDegree +
            ", serviceAmount = " + serviceAmount +
            ", electricityAmount = " + electricityAmount +
            ", totalAmount = " + totalAmount +
            ", stationId = " + stationId +
            ", equipmentId = " + equipmentId +
            ", connectorId = " + connectorId +
            ", userId = " + userId +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
