import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String studentID = SafeInput.getRegExString(
                in, "Enter your UC M number", "^(M|m)\\d{5}$");

        System.out.println("Your student ID is: " + studentID);
    }
}