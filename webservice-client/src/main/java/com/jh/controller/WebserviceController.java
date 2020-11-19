package com.jh.controller;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("ws")
public class WebserviceController {

	
	@RequestMapping(value = "/getUserInfo", method = { RequestMethod.POST, RequestMethod.GET })
	public String getAudio(String username,String userpwd,String usertype) throws Exception {
		
		// 创建动态客户端
	    JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
	    Client client = dcf.createClient("http://localhost:8080/services/ws/api?wsdl");
	    // 需要密码的情况需要加上用户名和密码
	    // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
	    Object[] objects = new Object[0];
	    String result=null;
	    try {
	        // invoke("方法名",参数1,参数2,参数3....);
	        //这里注意如果是复杂参数的话，要保证复杂参数可以序列化
	        objects = client.invoke("getUserInfo", "qiaozy007","123456","1");
	        result=JSON.toJSONString(objects[0]);
	        System.out.println("返回数据:" + objects[0]);
	    } catch (java.lang.Exception e) {
	        e.printStackTrace();
	    }
		return result;
	}
	
}
