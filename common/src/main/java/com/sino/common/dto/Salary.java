package com.sino.common.dto;

import java.math.BigDecimal;

/**
 * @author zhouchengliang
 * @description
 * @date
 **/
public class Salary {
    private String name;
    private BigDecimal money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Salary(String name, BigDecimal money) {
        this.name = name;
        this.money = money;
    }

    public Salary() {
    }
}
