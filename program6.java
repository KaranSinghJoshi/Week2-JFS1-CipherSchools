package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

//coded by KaranSinghJoshi 
//12012781

public class program6 {
    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void Calculate() {
        try {
            System.out.println("Enter first number: ");
            n1 = sc.nextInt();
            System.out.println("Enter second number: ");
            n2 = sc.nextInt();

            if (n2 == 0) {
                throw new ArithmeticException();
            }
            result = n1 / n2;
        }

        catch (InputMismatchException ime) {

            System.out.println("Ouch!!! Exception detected.");
        } catch (ArithmeticException ae) {

            System.out.println("Ouch!!! Exception detected.");
        } finally {
            System.out.println("The division is : " + result);
        }

        // coded by KaranSinghJoshi
        // 12012781

    }

    public static void main(String[] args) {
        program6 obj = new program6();
        obj.Calculate();
    }
}
