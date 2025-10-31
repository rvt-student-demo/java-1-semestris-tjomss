import java.util.Scanner;
public class iffunction{
    public static void main(String[] agrs) {
    Scanner scanner = new Scanner(System.in);
    int speed = Integer.valueOf(scanner.nextLine());
    if (speed > 120) {
        System.out.println("Speeding ticket!");
    } 
    else if (speed > 50){
        System.out.println("Good!");
    }

    }
}