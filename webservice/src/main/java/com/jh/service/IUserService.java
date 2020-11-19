package com.jh.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.jh.entity.User;

//@WebService(targetNamespace = "http://service.hjc.web.com/wsdl")
@WebService(name = "ServerServiceDemo", targetNamespace = "http://server.webservice.example.com")
public interface IUserService {
	@WebMethod
	User getUserInfo(@WebParam(name = "username")String username, @WebParam(name = "userpwd")String userpwd,@WebParam(name = "usertype")String usertype) throws Exception;


}
