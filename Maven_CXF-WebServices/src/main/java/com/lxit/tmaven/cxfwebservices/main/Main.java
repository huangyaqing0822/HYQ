package com.lxit.tmaven.cxfwebservices.main;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.lxit.jax.webservice.Student;
import com.lxit.tmaven.cxfwebservices.service.StudentService;

public class Main {
	/*public static void main(String[] args) {
		JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		bean.setServiceClass(StudentService.class);
		bean.setAddress("http://localhost:8080/Maven_CXF-WebServices/services/getStu?wsdl");
		StudentService ss = (StudentService) bean.create();
		System.out.println(ss.getStu("hyqhhh..."));
	}*/
	
	
	// CXF 提供 JaxWsDynamicClientFactory 调用WebService接口的方法(调用自己的接口)
	/*public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client = clientFactory.createClient("http://localhost:8080/Maven_CXF-WebServices/services/getStu?wsdl");
		Object[] result = client.invoke("getStu", "KEVIN");  
	    System.out.println(result[0]);
	}*/
	
	
	// CXF 提供 JaxWsDynamicClientFactory 调用WebService接口的方法(调用别人的接口，只需要别人提供 “http://192.168.18.43:8080/CXFDome/services/getWeather?wsdl” 这个地址就可以了，点进去就可以看到wsdl详细信息，然后根据里面的类创一个)
	public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client = clientFactory.createClient("http://192.168.18.43:8080/CXFDome/services/getWeather?wsdl");
		Object[] result = client.invoke("get", "zml");  
	    System.out.println((Student)result[0]);  // 导的Student类包不一样（一个自己的，一个调用别人接口传的类）
		
	}
	
	
}
