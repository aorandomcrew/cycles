public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int i;
        for (i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i;
        for (i=10;i>=1;i--){
            System.out.println(i);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int i;
        for (i=0;i<=17;i=i+2){
            System.out.println(i);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int i;
        for(i=10; i>=-10;i--){
            System.out.println(i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int i;
        for (i=1904;i<=2096; i=i+4){
            System.out.println(i);
        }
    }
    public static void task6 () {
        System.out.println("Задача 7");
        int i;
        for (i=7; i<=98; i=i+7){
            System.out.println(i);
        }
    }
    public static void task7 () {
        System.out.println("Задача 8");
        int i;
        for (i=2; i<=512; i=i*2){
            System.out.println(i);
        }
    }
    public static void task8 () {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int I = 1; I <= 12; I++) {
            total = total + salary;
            System.out.println("Месяц " + I + " Итого " + total);
        }
        System.out.println("всего отложено: " + total + " рублей");
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int I = 1; I <= 12; I++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("месяц " + I + " итого " + total);
        }
        System.out.println("всего отложено: " + total + " рублей");
    }
    public static void task10 () {
        System.out.println("Задача 10");
        int i;
        int number = 2;
        for (i=1; i<=10; i++){
            System.out.println(number + "*" + i + "=" + i*number);
        }
    }
}