package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.MathsTteaher;

public class SpringDriver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher teacher = context.getBean("mathsTeacher", 
				MathsTteaher.class);
		
		System.out.println(teacher.getHomework());
		context.close();

}
}
