package sky.pro.java.course1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ЗАДАЧА 1
        System.out.println("ЗАДАЧА 1");

//        Scanner yearRandom = new Scanner(System.in); // попробовал приспособить класс Scanner
        // с ним задача вышла интерактивнее
        System.out.println("Введите год для проверки и нажмите Enter");
//        int year = yearRandom.nextInt();
        int year = 2020;
        checkYear(year);

        System.out.println("");

        //ЗАДАЧА 2
        System.out.println("ЗАДАЧА 2");

        int typeOfOS = 0;
        int yearOfDevice = 2005;
        checkDevice(typeOfOS, yearOfDevice);

        System.out.println("");

        //ЗАДАЧА 3
        System.out.println("ЗАДАЧА 3");

        int deliveryDistance = 67;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            deliveryDays = deliveryTime(deliveryDistance);
        }

        System.out.println("");

        //ЗАДАЧА 4
        System.out.println("ЗАДАЧА 4");

        String letters = "aabccddefgghiijjkk";
        textValidator(letters);


        System.out.println("");

        //ЗАДАЧА 5
        System.out.println("ЗАДАЧА 5");

        int [] massive = {3, 2, 1, 6, 5};
        reversMassive(massive);

        System.out.println("");
    }

    //МЕТОД К ЗАДАЧЕ 5
    public static void reversMassive(int [] subMassive) {
        for (int i = 0; i < subMassive.length / 2; i++) {
            int tmp = subMassive[i];
            subMassive[i] = subMassive[subMassive.length - i - 1];
            subMassive[subMassive.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(subMassive));
    }

    //МЕТОД К ЗАДАЧЕ 4
    public static void textValidator(String name) {

        char[] lettersToSymbols = name.toCharArray();
        for (int i = 1; i < lettersToSymbols.length; i++) {
            if (lettersToSymbols[i] == lettersToSymbols[i - 1]) {
                System.out.println("Символ " + lettersToSymbols[i] + " задублирован");
                break;
            } else if (i == lettersToSymbols.length - 1) {
                System.out.println("Дублей не найдено");
            }
        }
    }

    //МЕТОД К ЗАДАЧЕ 3
    public static int deliveryTime(int calculating) {

        int deliveryTime = 0;
        deliveryTime = ((calculating - 20) / 40) + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        return deliveryTime;
    }

    //МЕТОД К ЗАДАЧЕ 2
    public static void checkDevice (int typeOfOS, int yearOfDevice) {

        if (typeOfOS == 0) {
            if (yearOfDevice >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (typeOfOS != 0) {
            if (yearOfDevice >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    //МЕТОД К ЗАДАЧЕ 1
    public static void checkYear(int i) {

        int leapYear1 = i % 4;
        int leapYear2 = i % 400;
        int leapYear3 = i % 100;

        boolean checkedLeapYear1 = leapYear1 == 0;
        boolean cheakedLeapYear2 = leapYear2 == 0;
        boolean checkedLeapYear3 = leapYear3 != 0;

        if (checkedLeapYear1 && checkedLeapYear3) {
            System.out.println(i + " - високосный год");
        } else if (cheakedLeapYear2) {
            System.out.println(i + " - високосный год");
        } else {
            System.out.println(i + " - не високосный год");
        }
    }

}