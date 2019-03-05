package com.fate.jktest.mapper;

import com.fate.jktest.bean.Fund;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

//@Mapper
@Component
public interface FinanceMapper {

    @Select("select * from fund where id=#{id}")
    Fund queryByPId(Integer id);
}
