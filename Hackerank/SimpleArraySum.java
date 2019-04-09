package Hackerank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class SimpleArraySum {
	
	static int sum(int a[]){
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;
	}
	
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	int a=x.nextInt();
	int []b=new int [a];
	for (int i = 0; i < b.length; i++) {
		b[i]=x.nextInt();
	}
	System.out.println(sum(b));
}
}
