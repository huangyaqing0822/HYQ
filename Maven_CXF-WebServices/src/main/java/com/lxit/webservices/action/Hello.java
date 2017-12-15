package com.lxit.webservices.action;

import java.io.IOException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxit.tmaven.cxfwebservices.service.StudentService;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Controller
public class Hello {
	@RequestMapping("/hello")
	public String testOne(){
		// cxf 调用服务(自己的)
		JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		bean.setServiceClass(StudentService.class);
		bean.setAddress("http://192.168.18.118:8080/Maven_CXF-WebServices/services/getStu?wsdl");
		StudentService ss = (StudentService) bean.create();
		System.out.println(ss.getStu("hyqhhh..."));
		
		return "hello";
	}
	
	
	@RequestMapping("/cxf")
	public String CXF() throws Exception{
		
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client = clientFactory.createClient("http://localhost:8080/Maven_CXF-WebServices/services/getStu?wsdl");
		Object[] result = client.invoke("getStu", "KEVIN");  
	    System.out.println(result[0]);
		
	    return "hello";
	}
	
	
	
	@RequestMapping("/httpOK")
	public String httpOK(){
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/octet-stream");
		RequestBody body = RequestBody.create(mediaType, "<soap:Envelope\r\nxmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"\r\nsoap:encodingStyle=\"http://www.w3.org/2001/12/soap-encoding\">\r\n<soap:Body xmlns:m=\"http://impl.service.cxfwebservices.tmaven.lxit.com/\">\r\n\t<m:getStu>\r\n\t</m:getStu>\r\n</soap:Body>\r\n</soap:Envelope>");
		Request request = new Request.Builder()
		  .url("http://localhost:8080/Maven_CXF-WebServices/services/getStu?wsdl=")
		  .post(body)
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "d582ba46-c4c4-101f-afad-8ca6e7b4a178")
		  .build();

		try {
			Response response = client.newCall(request).execute();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "hello";
	}
	
}
