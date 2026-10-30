import java.util.*;

public class IntegerSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers in one line:");
        String line = sc.nextLine();

        StringTokenizer st = new StringTokenizer(line);
        int sum = 0;

        System.out.println("Integers entered:");

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum = sum + num;
        }

        System.out.println("Sum of integers = " + sum);
    }
}
