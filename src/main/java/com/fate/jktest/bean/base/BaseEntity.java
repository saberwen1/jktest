package com.fate.jktest.bean.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
    private Integer id;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date updateTime;
}
