package introducaoOOP.Exercicios;

import introducaoOOP.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = scan.nextLine();

        System.out.println();
        System.out.println("Enter grades: ");
        student.gradeOne = scan.nextDouble();
        student.gradeTwo = scan.nextDouble();
        student.gradeThree = scan.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f\n", student.reportCard());
        student.result(student.grade);


        scan.close();
    }
}
