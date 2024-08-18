import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Marks:");
        int marks = obj.nextInt();

        String result = ( marks >=50) ? "Pass":"Fail";
        System.out.println(result);
    }
}

