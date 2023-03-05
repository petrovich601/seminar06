package org.example.Hw;

import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Сиреневый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "Черный");

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по объему ЖД");
        System.out.println("3 - сортировка по OS");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){

            System.out.println("Введите минимальное значение ОЗУ: ");
            int ram = sc.nextInt();
            if (ram <=32){
                if (ram > 16){
                    System.out.printf(l3.toString());
                } else if(ram > 4){
                    System.out.printf(l3 + "\n" + l4);
                } else if(ram > 2){
                    System.out.printf(l3 + "\n" + l4 + "\n" + l2);
                } else System.out.printf(l1 + "\n" + l2 + "\n" + l4 + "\n" + l3);
            } else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 2){

            System.out.println("Введите минимальное значение SSD: ");
            int ssd = sc.nextInt();
            if (ssd >512) System.out.println("Таких ноутбуков нет!");
            else if(ssd > 256){
                System.out.println(l3);
            }else if(ssd > 128){
                System.out.println(l3 + "\n" + l4 + "\n" + l2);
            }else System.out.println(l1 + "\n" + l2 + "\n" + l4 + "\n" + l3);

        }else if(choice == 3){

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine().toLowerCase();
            switch (os) {
                case "windows" -> System.out.println(l1 + "\n" + l2 + "\n" + l4 + "\n" + l3);
                case "windows 10" -> System.out.println(l1 + "\n" + l3);
                case "windows 11" -> System.out.println(l2 + "\n" + l4);
                default -> System.out.println("Таких ноутбуков нет!");
            }
            sc1.close();
        }

        sc.close();
    }

}


