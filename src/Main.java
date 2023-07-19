import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

//    public static void task1() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Задача 1");
//        System.out.println("Введите имя:");
//        String firstName = scanner.next();
//        System.out.println("Введите отчество:");
//        String middleName = scanner.next();
//        System.out.println("Введите фамилию:");
//        String lastName = scanner.next();
//        String fullName = lastName + " " + firstName + " " + middleName;
//        System.out.println("ФИО сотрудника - " + fullName);
//    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 2");
        System.out.println("Введите имя:");
        String firstName = scanner.next();
        System.out.println("Введите отчество:");
        String middleName = scanner.next();
        System.out.println("Введите фамилию:");
        String lastName = scanner.next();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));
    }


}