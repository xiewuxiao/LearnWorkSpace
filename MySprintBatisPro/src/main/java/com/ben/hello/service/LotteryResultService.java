package com.ben.hello.service;

import com.ben.hello.dao.LotteryResultMapper;
import com.ben.hello.po.LotteryResult;
import org.aspectj.lang.annotation.AdviceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/12/6.
 */
@Service
public class LotteryResultService {
    @Autowired
    private LotteryResultMapper lotteryResultMapper;
    public List<LotteryResult> getLotteryResultList(Map<String,Object> parma){
        return lotteryResultMapper.getAllLotteryResultByPaging(parma);
    }
}
