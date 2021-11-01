package com.care.di_test;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "classpath:application_test.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		PrintBean pb = ctx.getBean("PB", PrintBean.class);
		System.out.println("내용을 입력해주세요 : ");
		pb.setPrint(sc.next());
		pb.printString();
	}
}
