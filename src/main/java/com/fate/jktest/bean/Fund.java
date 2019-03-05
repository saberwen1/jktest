package com.fate.jktest.bean;

import com.fate.jktest.bean.base.BaseEntity;
import lombok.Data;

@Data
public class Fund extends BaseEntity {
    private String fund;
    private Integer lastCent;
    private Double increaseAmount;
}
