package com.test.service;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
//import org.apache.commons.httpclient.methods.PostMethod;
public class callService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String soapRequestData = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
			    "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">" + 
			     "<soap12:Body>" +   
			    "<getCountryCityByIp xmlns=\"http://WebXml.com.cn/\">" +     
			 "<theIpAddress>219.137.167.157</theIpAddress>" +     
			"</getCountryCityByIp>" +   
			 "</soap12:Body>" +    
			"</soap12:Envelope>";	
		
		PostMethod postMethod = new PostMethod("http://www.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx");
		try {
		  byte[] b = soapRequestData.getBytes("utf-8");
		  InputStream is = new ByteArrayInputStream(b,0,b.length);
			RequestEntity re = new InputStreamRequestEntity(is,b.length,"application/soap+xml; charset=utf-8");
			postMethod.setRequestEntity(re);
			HttpClient httpClient = new HttpClient();
			int statusCode = httpClient.executeMethod(postMethod);
			 soapRequestData =  postMethod.getResponseBodyAsString();
			 System.out.println("20200228 test xml== " +soapRequestData);
		}catch(UnsupportedEncodingException e){
			//throws new e; 
		}catch( IOException ie) {
			
		}
		finally {
			
		}
		
		
	}

}
