package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner scanner = new Scanner(System.in);//Использование класса Scanner
        try (FileWriter writer = new FileWriter("students.txt", true)) {

            System.out.print("Введите количество студентов: ");// Запрос у пользователя количество студентов
            int numberOfStudents = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа
            // Ввод информации о каждом студенте
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("\nВведите информацию о студенте " + (i + 1) + ":");

                System.out.print("\nВведите имя студента:");
                String name = scanner.nextLine();// Ввод имени студента

                System.out.print("\nВведите возраст студента:");
                int age = scanner.nextInt();// Ввод возраста студента

                System.out.print("\nВведите средний балл студента:");
                double GPA = scanner.nextDouble();// Ввод  среднего балла студента
                scanner.nextLine();
                writer.write("Имя: " + name + "         ");// Запись имени студента в файл
                writer.write("Возраст: " + age + "          ");// Запись возраста студента в файл
                writer.write("Средний балл: " + GPA + "\n");// Запись балла студента в файл
            }

            System.out.println("Информация успешно записана в файл!!");
        } catch (Exception e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
