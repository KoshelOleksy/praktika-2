/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    for(String str : args){
	        int num = Integer.parseInt(str);
	        if(num%2 == 0){
		        System.out.println("аргумен " + str + " паный");
	        }
	    }
	}
}
