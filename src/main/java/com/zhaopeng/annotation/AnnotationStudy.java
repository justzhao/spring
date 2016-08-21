package com.zhaopeng.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnnotationStudy {

	@UserCase(id = 47, description = "Passwords must contain at least one numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}

	@UserCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	
	
	public static void main(String[] args) {
	     List<Integer> useCases = new ArrayList<Integer>();
	     Collections.addAll(useCases, 47, 48, 49, 50);
	     trackUserCases(useCases, AnnotationStudy.class);
	 }

	
	 public static void trackUserCases(List<Integer> useCases, Class<?> cl) {
	     for (Method m : cl.getDeclaredMethods()) {
	         UserCase uc = m.getAnnotation(UserCase.class);
	         if (uc != null) {
	             System.out.println("Found Use Case:" + uc.id() + " "
	                         + uc.description());
	             useCases.remove(new Integer(uc.id()));
	         }
	     }
	     for (int i : useCases) {
	         System.out.println("Warning: Missing use case-" + i);
	     }
	 }
}
