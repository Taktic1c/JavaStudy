package com.taktc1c;

import java.util.Scanner;

/**
 * Created by Taktic on 03.01.2017.
 */
public class InteractRunner {

    public static void main(String[] arg )
    {
        Scanner reader = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "n";
            while (!exit.equals("y")){
                System.out.println("Введите первое число:");
                String first = reader.next();
                System.out.println("Введите второе число:");
                String second = reader.next();
                System.out.println("Введите действие:");
                String operation = reader.next();
                if (operation.equals("+")){
                    calc.add(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Результат: "+calc.getResult());
                }
                else if (operation.equals("-"))
                {
                    calc.deduct(Integer.valueOf(first), Integer.valueOf(second));
                    System.out.println("Результат: "+calc.getResult());
                }
                calc.cleanResult();
                System.out.println("Прервать? (y/n):");
                exit = reader.next();
            }
        }
        finally {
            reader.close();
        }
    }
}
