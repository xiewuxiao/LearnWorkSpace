package com.ben.client.test;

import com.ben.client.ExternalWebService;
import com.ben.client.ExternalWebService_Service;
import com.ben.client.LotteryResult;

import java.util.List;

/**
 * Created by hasee on 2017/12/13.
 */
public class WSClientTest {
    public static void main(String[] args) {
        ExternalWebService externalWebService = new ExternalWebService_Service().getExternalWebServicePort();
        List<LotteryResult> list = externalWebService.getLotteryResultList(null,"2003/12/30");
        for(LotteryResult lotteryResult : list ){
            System.out.println(lotteryResult.toString());
        }
    }
}
