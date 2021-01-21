package com.test.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceHello {
    
    public String getValue(String name){
        
        return "hello:"+name;
    }
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9098/service/ServiceHello", new ServiceHello());
        System.out.println("Publish Success!!! ");
    }

}