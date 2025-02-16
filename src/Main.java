import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1:");
        int total = 0;
        int salary = 15000;
        int i;
        for (i = 1; total <= 2_459_000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Потребовалось " + i + " месяцев для накопления: " + total + " рублей");
        System.out.println();

        // Задача №2
        System.out.println("Задача №2:");
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задача №3
        System.out.println("Задача №3:");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (i = 1; i <= 10; i++) {
            population = population + birthRate - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек");
        }
        System.out.println();

        // Задача №4
        System.out.println("Задача №4:");
        total = 0;
        salary = 15000;
        for (i = 1; total <= 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        // Задача №5
        System.out.println("Задача №5:");
        total = 0;
        salary = 15000;
        for (i = 1; total <= 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println();

        // Задача №6
        System.out.println("Задача №6:");
        total = 0;
        salary = 15000;
        int year = 9;
        for (i = 1; i <= year * 12; i++) {
            total += total / 100 * 7;
            total += salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println();

        // Задача №7
        System.out.println("Задача №7:");
        int first;
        first = (int) (Math.random () * 7) + 1;
        for (i = first; i <= 31; i++) {
            if ((i - first) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();
    }
}