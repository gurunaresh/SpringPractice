package com.greatlearning.driver;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.HindiTeacher;

public class Main {

	public static void main(String[] args) {
		Teacher t = new HindiTeacher();
		System.out.println(t.getHomework());
	
	}

}
