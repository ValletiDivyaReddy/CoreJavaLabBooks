package com.cg.lb2.ui;

import java.util.*; 

public class Exercise3 {

	 static void reverse(Integer a[]) 
	    { 
	        Collections.reverse(Arrays.asList(a)); 
	        System.out.println(Arrays.asList(a)); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Integer [] arr = {2, 30, 55, 65, 41,}; 
	        reverse(arr); 
	    } 
}