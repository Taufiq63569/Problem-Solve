package Hackerank;

import java.util.Scanner;

public class ComparetheTriplets {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int c=0, d=0;
	int a[]=new int[3];
	int b[]= new int [3];
	for (int i = 0; i < a.length; i++) {
		a[i]=x.nextInt();
}
	for (int i = 0; i < b.length; i++) {
		b[i]=x.nextInt();
	}
	for (int i = 0; i < b.length; i++) {
		if(a[i]>b[i]){
			c++;
		}
		if(a[i]<b[i]){
			d++;
		}
	}
	System.out.println(c+" "+d);
}
}






