package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.student.AreaDetails;

public class DemoTest {
public static void main(String[] args) {
	ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\premsgar\\eclipse-workspace20-06\\CoreProj01\\Test.xml");
AreaDetails details=(AreaDetails) context.getBean("area");
System.out.println(details.getAreaName());
System.out.println(details.getPin());
System.out.println(details.getStudent().getId());
System.out.println(details.getStudent().getName());

System.out.println("wellcome");

}
}
