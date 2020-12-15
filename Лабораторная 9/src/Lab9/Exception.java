package Lab9;

import java.util.Scanner;

public class Exception {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Введите число: ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        /*}catch(java.lang.Exception e) {
            System.out.println("Ошибка!");
        }*/
        }catch(ArithmeticException e) {
            System.out.println("Нельзя делить на ноль!");
        }catch(NumberFormatException e) {
            System.out.println("Можно использовать только числа!");
        }
    }
}
