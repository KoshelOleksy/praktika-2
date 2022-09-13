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
	    System.out.print("Введіть число:");
	    int num = src.nextInt();
	    if(num>= 0 && num<=10){
	        System.out.print("Позитивне число менше 10 або нуль");
	    }
	    else{
	        System.out.print("Позитивне число більше 10 або негативне");
	    }
	}
}

