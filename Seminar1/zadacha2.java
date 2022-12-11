//Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

class Summ{

public static void getOdd(int f) {
    int odd = 1;
    for (int i = 1; i <= f; i++) {
    odd = i*odd;
    }
    System.out.println(odd);
}

public static void main(String args[]){ 
System.out.println("Введите число n:"); 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        getOdd(n);
    }  
}
