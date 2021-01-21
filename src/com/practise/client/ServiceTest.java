package com.practise.client;

public class ServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();
        String name = hello.getValue("zl");
        System.out.println(name);
	}

}
