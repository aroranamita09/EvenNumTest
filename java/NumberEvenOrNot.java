package com.stackroute;

import java.util.Scanner;

class EvenNumTest
{
    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
            return true;
        else
            return false;
    }
}
public class NumberEvenOrNot {
    
        EvenNumTest checkNum = new EvenNumTest();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(checkNum.isEven(num))
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is not even");
        }
}
