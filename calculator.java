/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner src = new Scanner(System.in);
	    takeSum(12, 4);
	}
	
	public static void takeSum(int firstnum, int secondnum) {
		int sums = firstnum + secondnum;
		System.out.println("sum of ur numbers:" + sums);
	}
	public static void takeMnozh(int firstnum, int secondnum) {
		int sums = firstnum * secondnum;
		System.out.println("sum of ur numbers:" + sums);
	}
	public static void takDil(int firstnum, int secondnum) {
		int sums = firstnum / secondnum;
		System.out.println("sum of ur numbers:" + sums);
	}
	public static void takeMinus(int firstnum, int secondnum) {
		int sums = firstnum - secondnum;
		System.out.println("sum of ur numbers:" + sums);
	}
}