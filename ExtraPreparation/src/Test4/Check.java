package Test4;

import java.util.Arrays;
import java.util.Scanner;

/*There is a array of integers. Int[] a = { 4,2,5,7,8,2,9}
Write a program to ask user to enter number‘x’. Check if that number exists in the array . if
exists , create another array which contains all numbers of original array except number ‘x’.*/


public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={ 4,2,5,7,8,2,9};
    int b[]=new int[a.length];
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int num=sc.nextInt();
     for(int i=0;i<a.length;i++) {
    	 if(a[i]==num) {
    		 for(int j=0;j<a.length;j++) {
    			 if(a[j]==num) {
    				continue;
    			 }
    			 else {
    				 b[j]=a[j];
    			 }
    		 }
    		 
    		 System.out.println(Arrays.toString(b));
    	 }
    	
    	 }
    	 }
    	 
     }
    
     
		
		
		
	


