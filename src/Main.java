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

    }
}