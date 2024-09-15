package org.example;

public class CoreJavaBrushup1 {
	public static void main(String[] args) {
		 int num=5;
		 String website="rahul shetty academy";
		 char ch= 'A';
		 float f= 10.5f;
		 double d= 10.25;
		 boolean b= true;
		 
		 System.out.println(num);
		 System.out.println(website);
		 System.out.println(f);
		 System.out.println(d);
		 System.out.println(b);
		 
		 //Arrays- 
		 int[] arr= new int[5];
		 arr[0]= 1;
		 arr[1]= 2;
		 arr[2]= 3;
		 arr[3]= 4;
		 arr[4]= 5;
		 
		 int[] arr1 = {1,2,3,4,5,7,8,9,10};
		 System.out.println(arr1[3]);
		 
		 //for loops
		 for(int i =0; i<arr.length; i++)
		 {
			 System.out.println(arr[i]); 
		 }
		 
		 for(int i=0; i< arr1.length; i++)
		 {
			 System.out.println(arr1[i]);  
		 }
		 
		 String[] name = {"rahul", "payel","mukesh"};
		 for(int i=0; i<name.length; i++)
		 {
			 System.out.println(name[i]);   
		 }
		 
		 
		 
	}

}
