import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String digits;

		System.out.print("Enter your Credit Card Number:");
		digits = input.next();

		if (Check(digits) == true) {
			System.out.println("valid!");
		} else {
			System.out.println("NOT Valid");
			
			input.close();
		}

	}
	public static boolean Check(String digits)
    {
            int sum = 0;
            boolean alternate = false;
            for (int i = digits.length() - 1; i >= 0; i--)
            {
                    int n = Integer.parseInt(digits.substring(i, i + 1));
                    if (alternate)
                    {
                            n *= 2;
                            if (n > 9)
                            {
                                    n = (n % 10) + 1;
                            }
                    }
                    sum += n;
                    alternate = !alternate;
            }
            return (sum % 10 == 0);
    }

}
