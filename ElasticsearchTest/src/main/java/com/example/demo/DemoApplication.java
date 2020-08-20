
package com.example.demo;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

@SpringBootApplication
@RestController
public class DemoApplication {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    private Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("test")
    public String init(@RequestParam(value = "ip", defaultValue = "localhost") String ip,@RequestParam(value = "port", defaultValue = "9300") String port) throws Exception{
        TransportClient client = null;
        client = TransportClient
                .builder()
                .build()
                .addTransportAddress(
                        new InetSocketTransportAddress(InetAddress
                                .getByName(ip), Integer.parseInt(port)));
        logger.info("连接信息:节点名称：" + client.nodeName() + "连接成功");

        IndexResponse response = client
                .prepareIndex("msg", "tweet", "1")
                .setSource(
                        XContentFactory.jsonBuilder().startObject()
                                .field("userName", "张三")
                                .field("sendDate", new Date())
                                .field("msg", "你好李四").endObject()).get();

        return "索引名称:" + response.getIndex() + "\n类型:"
                + response.getType() + "\n文档ID:" + response.getId() + "\n是否新建："
                + response.isCreated();
//        return "连接信息:节点名称：" + client.nodeName() + "连接成功";

    }


    @GetMapping("test_v1")
    @ResponseBody
    public String create() {
        boolean flag = elasticsearchTemplate.indexExists("msg");
        if(flag) return "索引已存在";
        else {
            boolean createFlag = elasticsearchTemplate.createIndex("msg");
            return createFlag ? "创建成功" : "创建失败";
        }
    }

    @GetMapping("test_v2")
    @ResponseBody
    public String del() {
        boolean flag = elasticsearchTemplate.deleteIndex("msg");
        return flag? "删除成功":"删除失败";
    }



}
            