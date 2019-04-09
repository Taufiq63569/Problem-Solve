package Hackerank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a= x.nextInt();
		int c1=0, c2=0, c3=0;
		double sum1, sum2, sum3;
		int [] b= new int [a];
		for (int i = 0; i < b.length; i++) {
			b[i]=x.nextInt();
			if(b[i]==Math.abs(b[i]) && b[i]!= 0){
				c1++;
			}
			else if (b[i]== 0){
				c2++;
			}
			else {
				c3++;
			}
		}

		sum1=(c1*1.00)/a;
		sum2=(c2*1.00)/a;
		sum3=(c3*1.00)/a;
		System.out.println(String.format("%.6f",sum1));
		System.out.println(String.format("%.6f", sum3));
		System.out.println(String.format("%.6f", sum2));
		
		
	}
}


