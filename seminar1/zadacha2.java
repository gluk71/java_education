//Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;

class Summ{

public static void getFactorial(int f) {
    int summ = 0;
    System.out.println(f);
    for (int i = 1; i <= f; i++) {
    System.out.println(i);
    summ += i;
    }
    System.out.println(summ);
}

public static void main(String args[]){ 
System.out.println("Введите число n:"); 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        getFactorial(n);
    }  
}
