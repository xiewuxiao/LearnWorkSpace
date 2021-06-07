package com.example.demo.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.shield.ShieldPlugin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class ElasticsearchConfig {
    @Value("${elasticsearch.host}")
    private String elasticSearchHost;
    @Value("${elasticsearch.port}")
    private String elasticSearchPort;
    @Value("${elasticsearch.username}")
    private String shieldUserName;
    @Value("${elasticsearch.password}")
    private String shieldPassword;

    @Bean
    public TransportClient transportClient() throws UnknownHostException {
        TransportClient client = TransportClient.builder()
                .addPlugin(ShieldPlugin.class)
                .settings(Settings.builder()
                .put("shield.user", shieldUserName+":"+shieldPassword)
                .build())
                .build()
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(elasticSearchHost), Integer.valueOf(elasticSearchPort)));

        return client;
    }
}
