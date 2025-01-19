
package gradecalculator.gradecalculator;


import java.util.Scanner;

public class Odd {
    private int x;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = scanner.nextInt();
    }

    public void checkOddOrEven() {
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }

    public static void main(String[] args) {
        Odd odd = new Odd();
        odd.read();
        odd.checkOddOrEven();
    
    
}
}
