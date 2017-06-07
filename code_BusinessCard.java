import java.util.Scanner;

/**
 * Created by B4RT on 2017-06-07.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Thi is the simple java program, that create business cards ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.next();

        System.out.println("Please enter your surname: ");
        String surname = scanner.next();

        System.out.println("Please enter your telephone: ");
        int telephone = scanner.nextInt();

        System.out.println("__________________________");
        System.out.println("| NAME        " + name);
        System.out.println("| SURNAME     " + surname);
        System.out.println("| TELEPHONE   " + telephone);
        System.out.println("__________________________");
    }
}
