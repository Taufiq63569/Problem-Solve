package Hackerank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class AVeryBigSum {
	
	static long sum (long a[]){
		long b=0;
		for (long l : a) {
			b=b+l;
		}
		return b;
	}
	
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a=x.nextInt();
	long b[]= new long [a];
	for (int i = 0; i < b.length; i++) {
		b[i]=x.nextLong();
	}
	System.out.println(sum(b));
}
}
