package com.ben.hello.dao;


import com.ben.hello.po.LotteryResult;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/10/21.
 */
public interface LotteryResultMapper {
    void bulkInsertLotteryResult(List<LotteryResult> list);
    @Select("SELECT  *  from t_lottery_result")
    List<LotteryResult> getAllLotteryResultByPaging(Map<String,Object> param);
}
