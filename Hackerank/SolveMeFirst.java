package Hackerank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class SolveMeFirst {
static int sum(int a, int b){
	int sum=a+b;
	return sum;
}
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a=x.nextInt();
	int b=x.nextInt();
	System.out.println(sum(a, b));
}
}
