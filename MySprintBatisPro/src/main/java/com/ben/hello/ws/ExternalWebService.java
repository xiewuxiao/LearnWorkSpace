package com.ben.hello.ws;

import com.ben.hello.po.LotteryResult;
import com.ben.hello.service.LotteryResultService;
import com.ben.hello.setup.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/12/13.
 */
@Component
@WebService(serviceName = "ExternalWebService")
public class ExternalWebService {
    private Logger logger = LogManager.getLogger();
    @Autowired
    private LotteryResultService lotteryResultService;
    @WebMethod
    public List<LotteryResult> getLotteryResultList(String open_date_s,String open_date_e){
        Map<String,Object> map = new HashMap();
        Page page = new Page(1,20);
        map.put("page",page);
        map.put("open_date_s",open_date_s);
        map.put("open_date_e",open_date_e);
        logger.debug(map);
        return lotteryResultService.getLotteryResultList(map);
    }
}
