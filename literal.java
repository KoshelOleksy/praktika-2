/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
        // 1. логічний
        boolean logic = true;
        // 2. рядковий
        System.out.println("Кот\nКошка\nКотёнок");
        // 3. символьний
        System.out.println("Знак диления:" + '\u00F7');
        // 4. цілісний 2-й
        int a = 0b1101010110;
        System.out.println("Число " + a + " в двоичной системе: 1101010110");
        // 5. цілісний 8-й
        int b = 012314;
        System.out.println("Число " + b + " в восьмеричной системе: 012314");
        // 6. цілісний 10-й
        int c = 456;
        System.out.println("Число " + c + " в десятичной системе: 456");
        // 7. цілісний 16-й
        int d = 0x141D12;
        System.out.println("Число " + d + " в шестнадцатеричной системе: 0x141D12");
        // 8. літерал типу float
        float m = 4.05E-15F;
        // 9. літерал типу double.
        double g = 2.238994859302;
	}
}
