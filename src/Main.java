public class Main {
    public static void main(String[] args) {
        task1(); task4(); task7(); task10();
        task3(); task5(); task8();
        task2(); task6(); task9();
    }


    private static void task1() {
        System.out.println("Задача1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Задача2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задача3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }
    private static void task4() {
        System.out.println("Задача4");
        for (int i =10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }
    private static void task5() {
        System.out.println("Задача5");
        for (int i = 1904; i <= 2096; i = i +4) {
            System.out.println(i + " високосный год");
        }
    }
    private static void task6() {
        System.out.println("Задача6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }
    private static void task7() {
        System.out.println("Задача7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }
    private static void task8() {
        System.out.println("Задача8");
        int money = 29000;
        int totalMoney = 0;
        for (int i  = 1; i <= 12; i = i + 1) {
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    totalMoney + "рублей");
        }
    }
    private static void task9() {
        System.out.println("Задача9");
        int money = 29000;
        int totalMoney = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    totalMoney + " рублей");
        }
    }
    private static void task10() {
        System.out.println("Задача10");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2*" + i + "=" + i * 2);
        }
    }

}







