package com.ben.hello.dao;


import com.ben.hello.po.LotteryResult;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/10/21.
 */
public interface LotteryResultMapper {
    /**
     * 指插入LotteryResults对象
     * @param list
     */
    void bulkInsertLotteryResult(List<LotteryResult> list);

    /**
     * 根据条件查询表t_lottery_result，使用分页，分页的key值为page
     * @param param
     * @return LotteryResult 集合(list)
     */
    List<LotteryResult> getAllLotteryResultByPaging(Map<String,Object> param);
}
