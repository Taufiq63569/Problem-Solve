package Hackerank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDifference {
public static void main (String[] args){
    Scanner x = new Scanner (System.in);
    int n= x.nextInt();
    int s=0,t=0;
    int a[][]=new int[n][n];
    for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			a[i][j]=x.nextInt();
			if(i==j){
				s=s+a[i][j];
			}
			if(i+j==n-1){
				t=t+a[i][j];
			}
		}
	}
    System.out.println(Math.abs(s-t));
    
}
    }

