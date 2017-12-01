package com.ben.hello.dao;


import com.ben.hello.po.LotteryResult;

import java.util.List;

/**
 * Created by hasee on 2017/10/21.
 */
public interface LotteryResultMapper {
    void bulkInsertLotteryResult(List<LotteryResult> list);
    List<LotteryResult> getAllLotteryResult();
}
