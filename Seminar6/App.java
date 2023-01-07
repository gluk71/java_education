package LAPTOP3;


import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] arg) {
//        App cv= new App();
        laptop laptop1 = new laptop(1, Acer, 128, 1024, "Win", "red");
        laptop laptop2 = new laptop(2, Apple, 256, 64, "Mac", "white");
        laptop laptop3 = new laptop(3, Bbk, 512, 32, "Android", "black");
        laptop laptop4 = new laptop(4, Asus, 1024, 512, "Win", "green");

        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());
        System.out.println(laptop3.toString());
        System.out.println(laptop4.toString());

        while (true) {
            System.out.println("Выберите команду:");
            System.out.println("1 - сортировка по Производитель");
            System.out.println("2 - сортировка по RAM");
            System.out.println("3 - сортировка по SSD");
            System.out.println("4 - сортировка по OS");
            System.out.println("5 - сортировка по цвету");
            Scanner sc = new Scanner(System.in, "ibm866");
            System.out.print("Введите команду: ");
            Integer choice = sc.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {
              
                    if (choice == 1) {
                    System.out.printf("Введите производителя ноутбука: ");
                    Scanner sc = new Scanner(System.in);
                    String res = sc1.nextLine();
                    if (laptop1.os.equals(res)) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.os.equals(res)) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.os.equals(res)) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.os.equals(res)) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }

                if (choice == 2) {
                    System.out.printf("Введите значение ОЗУ(RAM) больше или равно: ");
                    Integer res = sc.nextInt();
                    if (laptop1.ram >= res) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.ram >= res) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.ram >= res) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.ram >= res) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
              
                if (choice == 3) {
                    System.out.printf("Введите объем жесткого диска SSD(RAM), он больше или равен: ");
                    Integer res = sc.nextInt();
                    if (laptop1.ssd >= res) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.ssd >= res) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.ssd >= res) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.ssd >= res) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
              
                if (choice == 4) {
                    System.out.printf("Введите название операционной системы(OS): ");
                    Scanner sc1 = new Scanner(System.in);
                    String res = sc1.nextLine();
                    if (laptop1.os.equals(res)) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.os.equals(res)) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.os.equals(res)) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.os.equals(res)) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
              
                if (choice == 5) {
                    System.out.printf("Введите цвет(clr): ");
                    Scanner sc2 = new Scanner(System.in);
                    String res2 = sc2.nextLine();
                    if (laptop1.clr.equals(res2)) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.clr.equals(res2)) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.clr.equals(res2)) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.clr.equals(res2)) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                break;
            } else {
                System.out.println("Такой команды нет. Введите правильную команду");
            }
        }
    }
}
