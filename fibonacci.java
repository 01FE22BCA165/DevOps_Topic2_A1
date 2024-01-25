import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();
        int first=0 ,second=1, next;
        System.out.println("The Fibonacci series is:");
        for (int i = 0; i < n; i++) {
            System.out.print(first);
            next = first + second;
            first = second;
            second = next;
            System.out.print("  ");
        }
        
    }
}
