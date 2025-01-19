

package gradecalculator.gradecalculator;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input six units
        double unit1 = scanner.nextDouble();
        double unit2 = scanner.nextDouble();
        double unit3 = scanner.nextDouble();
        double unit4 = scanner.nextDouble();
        double unit5 = scanner.nextDouble();
        double unit6 = scanner.nextDouble();

        // Calculate average
        double average = (unit1 + unit2 + unit3 + unit4 + unit5 + unit6) / 6;

        // Output grade
        if (average >= 70) {
            System.out.println("Grade: A");
        } else if (average >= 60) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else if (average >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }
}
