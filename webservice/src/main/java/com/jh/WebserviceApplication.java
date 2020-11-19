package com.jh;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jh.service.impl.UserServiceImpi;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @package: com.xkcoding.mq.kafka
 * @description: 启动器
 * @author: yangkai.shen
 * @date: Created in 2019-01-07 14:43
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@SpringBootApplication
public class WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceApplication.class, args);
//        System.out.println("启动并发布webservice远程服务");
//        Endpoint.publish("http://127.0.0.1:11008/UserServiceImpi/dao?wsdl", new UserServiceImpi());
//        System.out.println("启动并发布webservice远程服务，服务发布成功....");
    }

}

