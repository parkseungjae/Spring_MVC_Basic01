package com.care.root02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// STBean stBean = new STBean();
		STBean stBean = ctx.getBean("stb", STBean.class);
		//stBean.setName("홍길동");
		//stBean.setAge(201111);

		// stBean.setSt(new Student());
		//stBean.namePrint();
		//stBean.agePrint();
	}
}
