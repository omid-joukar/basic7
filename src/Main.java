import java.util.Scanner;

/**
 * Created by KPS on 7/3/2020.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i =0;i<10;i++){
            System.out.println(a+" * "+i+" :"+ (a*i));
        }
    }
}
