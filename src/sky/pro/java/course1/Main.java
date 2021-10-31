package sky.pro.java.course1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //ЗАДАЧА 1
        System.out.println("ЗАДАЧА 1");


        System.out.println("Введите год для проверки и нажмите Enter");

        int year = 2001;
        checkYears(year);

        System.out.println("");

        //ЗАДАЧА 2
        System.out.println("ЗАДАЧА 2");

        printRecommendedAppVersion(0, 2021);

        System.out.println("");

        //ЗАДАЧА 3
        System.out.println("ЗАДАЧА 3");

        System.out.println("Количество дней доставки: " + calculateDeliveryDays(23));

        System.out.println("");

        //ЗАДАЧА 4
        System.out.println("ЗАДАЧА 4");

        String letters = "aabccddefgghiijjkk";
        textValidator(letters);


        System.out.println("");

        //ЗАДАЧА 5
        System.out.println("ЗАДАЧА 5");

        int[] massive = {3, 2, 1, 6, 5};
        reversMassive(massive);

        System.out.println("");
    }

    //МЕТОД К ЗАДАЧЕ 5
    public static void reversMassive(int[] subMassive) {
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
        char prevChar = Character.MAX_VALUE;
        for (char letter : lettersToSymbols) {
            if (letter == prevChar) {
                System.out.println("Символ " + letter + " задублирован");
                return;
            }
            prevChar = letter;
        }
        System.out.println("Дублей не найдено");
    }

        //МЕТОД К ЗАДАЧЕ 3
        public static int calculateDeliveryDays ( int deliveryDistance){
            int result = 1;
            if (deliveryDistance > 20) {
                result++;
            }
            if (deliveryDistance > 60) {
                result++;
            }
            return result;
        }

        //МЕТОДЫ К ЗАДАЧЕ 2
        public static void printRecommendedAppVersion ( int clientOS, int deviceYear){

            boolean deviceIsOld = checkYear(deviceYear);
            StringBuilder messageBuilder = new StringBuilder();
            messageBuilder.append("Установите ");
            if (deviceIsOld) {
                messageBuilder.append("lite ");
            }
            messageBuilder.append("версию для ");
            if (clientOS == 0) {
                messageBuilder.append("iOS");
            } else {
                messageBuilder.append("Android");
            }

            System.out.println(messageBuilder);
        }

        public static boolean checkYear(int yearOfDevice) {
            int currentYear = LocalDate.now().getYear();
            return yearOfDevice < currentYear;
        }

        //МЕТОД К ЗАДАЧЕ 1
        public static void checkYears ( int i){

            int leapYear1 = i % 4;
            int leapYear2 = i % 400;
            int leapYear3 = i % 100;

            boolean checkedLeapYear1 = leapYear1 == 0;
            boolean cheakedLeapYear2 = leapYear2 == 0;
            boolean checkedLeapYear3 = leapYear3 != 0;

            if ((checkedLeapYear1 && checkedLeapYear3) || cheakedLeapYear2) {
                System.out.println(i + " - високосный год");
            } else {
                System.out.println(i + " - не високосный год");
            }
        }
}