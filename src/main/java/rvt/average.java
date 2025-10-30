import java.util.Scanner;

public class average {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("First number: ");
    Double firstnum = scanner.nextDouble();

    System.out.println("Second number: ");
    Double secondnum = scanner.nextDouble();

    System.out.println("Third number: ");
    double thirdnum = scanner.nextDouble();

    double result = (firstnum + secondnum + thirdnum) / 3;
    System.out.println("Average num: " + result);
    }
}