import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double price = 5.00;



        System.out.println("Thank you for ordering from the Rice Shop! Let's begin your order.");

        System.out.println("First, what would you like to order?(Hint: we only have rice here. Please type rice!)");
        String rice = scan.next();

        System.out.println("Perfect! That will be $" + price + "0. How many of these would you like?");
        int qty = scan.nextInt();

        double currentPrice = (qty * price);

        System.out.println("Great! Your total is currently at $" + (currentPrice) + "0. Lastly, we have a delivery fee. How many miles away are you from our location?");
        int miles = scan.nextInt();

        double fee;

        if(miles <= 5){
            fee = 2.00;
        }else if(6 <= miles && miles <= 15){
            fee = 5.00;
        }else if(16 <= miles && miles <= 25){
            fee = 10.00;
        }else if(26 <= miles && miles <= 50){
            fee = 15.00;
        }else{
            fee = 20.00;
        }

        System.out.println("Splendid! Your delivery fee is " + fee + "0.");
        System.out.println("You have reached a grand total of $" + (currentPrice + fee) +"0.");
        System.out.println("Your order should arrive shortly. Thank you!");



    }
}
