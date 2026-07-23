import java.util.Scanner;

public class HotelManagement {

    static boolean previousCustomer = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hotel Login
        System.out.println("=================================");
        System.out.println(" WELCOME TO KAVITHA HOTEL");
        System.out.println("=================================");

        System.out.print("Enter Customer Name : ");
        String customerName = sc.nextLine();

        System.out.print("Enter Mobile Number : ");
        String customerNumber = sc.nextLine();

        while (true) {

            System.out.println("\n===== HOTEL MENU CARD =====");
            System.out.println("1. PANIPURI - Rs.40");
            System.out.println("2. GOBI - Rs.60");
            System.out.println("3. VADAPAV - Rs.50");
            System.out.println("4. CHOLE BHATURE - Rs.180");
            System.out.println("5. PANNEER BIRYANI - Rs.150");
            System.out.println("6. CHICKEN DUM BIRYANI - Rs.200");
            System.out.println("7. BUTTER NON(2)- Rs.80");
            System.out.println("8.  MASALA BUTTERMILK- Rs.50");
            System.out.println("9.  GULAB JAMUN- RS.45");
            System.out.println("10.  SPL LASSI- RS.100");
             




            System.out.print("\nEnter item number: ");
            int choice = sc.nextInt();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            int price = 0;

            switch (choice) {
                case 1: price = 40; break;
                case 2: price = 60; break;
                case 3: price = 50; break;
                case 4: price = 180; break;
                case 5: price = 150; break;
                case 6: price = 200; break;
                case 7: price = 80; break;
                case 8: price = 50; break;
                case 9: price = 45; break;
                case 10: price = 100; break;
                default:
                    System.out.println("Invalid Choice!");
                    continue;
            }

            int total = price * qty;
            double discount = 0;

            if (previousCustomer) {
                discount = total * 0.10;
                System.out.println("\nCongratulations! You got 10% Discount.");
            } else {
                System.out.println("\nNo Discount. This is your first order.");
                previousCustomer = true;
            }

            double finalBill = total - discount;

            System.out.println("\n========== BILL ==========");
            System.out.println("Hotel Name : KAVITHA HOTEL");
            System.out.println("Customer Name : " + customerName);
            System.out.println("Mobile Number : " + customerNumber);
            System.out.println("Total Amount : Rs." + total);
            System.out.println("Discount : Rs." + discount);
            System.out.println("Pay Amount : Rs." + finalBill);
            System.out.println("\n===== PAYMENT METHOD =====");
            System.out.println("1. Cash");
            System.out.println("2. UPI");
            System.out.println("3. Credit Card");
            System.out.println("4. Debit Card");
            System.out.print("Choose Payment Method: ");
            int payment = sc.nextInt();

switch (payment) {
    case 1:
        System.out.print("Enter Cash Amount: Rs.");
        double cash = sc.nextDouble();

        if (cash >= finalBill) {
            System.out.println("Payment Successful!");
            System.out.println("Balance Amount: Rs." + (cash - finalBill));
        } else {
            System.out.println("Insufficient Cash!");
        }
        break;

    case 2:
        System.out.print("Enter UPI ID: ");
        sc.nextLine(); // Clear buffer
        String upi = sc.nextLine();
        System.out.println("Payment of Rs." + finalBill + " Successful via UPI.");
        break;

    case 3:
        System.out.print("Enter Last 4 Digits of Credit Card: ");
        String credit = sc.next();
        System.out.println("Payment of Rs." + finalBill + " Successful via Credit Card.");
        break;

    case 4:
        System.out.print("Enter Last 4 Digits of Debit Card: ");
        String debit = sc.next();
        System.out.println("Payment of Rs." + finalBill + " Successful via Debit Card.");
        break;

    default:
        System.out.println("Invalid Payment Method!");
}


            System.out.print("\nDo you want to order again? (yes/no): ");
            String ch = sc.next();

            if (ch.equalsIgnoreCase("no")) {
                System.out.println("\nThank You for Visiting KAVITHA HOTEL!");
                break;
            }
        }

        sc.close();
    }
}