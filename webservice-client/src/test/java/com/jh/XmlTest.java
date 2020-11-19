package com.jh;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;


public class XmlTest {
	
	@Test
	public void xmltest() throws Exception {
		String response="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ResponseInfo>\r\n" + 
				"<Date>20180720182403</Date>\r\n" + 
				"<IsSuccess>true</IsSuccess>\r\n" + 
				"<Message>处理成功,流水号是:110226198501272116-198202</Message><ResponseCode>0</ResponseCode>\r\n" + 
				"<SerialNo>110226198501272116-198202</SerialNo>\r\n" + 
				"<ValidCode></ValidCode>\r\n" + 
				"</ResponseInfo>";
		 Document doc = null;
         try {
             // 下面的是通过解析xml字符串的
             doc = DocumentHelper.parseText(response); // 将字符串转为XML
             //获取根节点元素对象  
             Element root = doc.getRootElement(); // 获取根节点
             //获取子节点
             String date = root.elementText("Date");//获取子节点
             String isSuccess = root.elementText("IsSuccess");//获取子节点
             String responseCode = root.elementText("ResponseCode");//获取子节点
             String errorsInfo = root.elementText("ErrorsInfo");//获取子节点
             String message = root.elementText("Message");//获取子节点
             String serialNo = root.elementText("SerialNo");//获取子节点

        } catch (DocumentException e) {
        }
	}
}
