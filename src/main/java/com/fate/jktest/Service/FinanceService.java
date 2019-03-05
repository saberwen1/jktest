package com.fate.jktest.Service;

import com.fate.jktest.bean.Fund;
import com.fate.jktest.mapper.FinanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "fund")
public class FinanceService {
    @Autowired
    FinanceMapper financeMapper;

    @Caching(cacheable = {@Cacheable(key = "#id")}
            , put = @CachePut(key = "#result.fund"))
    public Fund queryByPId(Integer id) {
        return financeMapper.queryByPId(id);
    }
}
