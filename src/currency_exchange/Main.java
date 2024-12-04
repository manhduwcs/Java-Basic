package currency_exchange;

import java.util.Scanner;

public class Main {
    public static double exchange(Currency from, Currency to, Double exchangeAmount) {
        // return from
        double defaultRate = to.getCurrentRate() / from.getCurrentRate();
        return exchangeAmount * defaultRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choose = 1;
            Currency[] currencies = Currency.values();
            Currency from;
            Currency to;
            double exchangeAmount = 0;
            while (true) {
                try {
                    System.out.println("Choose a Currency that you want to exchange : ");
                    int i = 1;
                    for (Currency cur : Currency.values()) {
                        System.out.printf("[%d].%s%5s", i, cur, "");
                        if (i % 5 == 0) System.out.println();
                        i++;
                    }
                    System.out.print("Your choice = ");
                    choose = sc.nextInt();
                    sc.nextLine();
                    if (choose == 0) {
                        System.out.println("Closing the program....");
                        return;
                    }
                    if (choose < 1 || choose > i - 1) {
                        throw new Exception("Choose out of bound : your choice = " + choose + " > max = " + (i - 1) + " . Try again !");
                    }

                    from = currencies[choose - 1];
                    break;
                } catch (Exception e) {
                    if (e.getMessage() == null) {
                        System.out.println("Error : Invalid input ! Please try again.");
                    } else {
                        System.out.println("Error : " + e.getMessage());
                    }
                }
            }
            while (true) {
                try {
                    System.out.println("You want to exchange to what currency below : ");
                    int i = 1;
                    for (Currency cur : Currency.values()) {
                        if (cur.equals(from)) {
                            System.out.printf("[%d].%s[chosen]%5s", i, cur, "");
                            i++;
                            continue;
                        }
                        System.out.printf("[%d].%s%5s", i, cur, "");
                        if (i % 5 == 0) System.out.println();
                        i++;
                    }
                    System.out.print("Your choice = ");
                    choose = sc.nextInt();
                    sc.nextLine();
                    if (choose - 1 == from.ordinal()) {
                        throw new Exception("You've chosen this option : " + from + " ! Please choose another.");
                    }
                    if (choose == 0) {
                        System.out.println("Closing the program....");
                        return;
                    }
                    if (choose < 1 || choose > i - 1) {
                        throw new Exception("Choose out of bound : your choice = " + choose + " > max = " + (i - 1) + " . Try again !");
                    }

                    to = currencies[choose - 1];
                    break;
                } catch (Exception e) {
                    if (e.getMessage() == null) {
                        System.out.println("Error : Invalid input ! Please try again.");
                    } else {
                        System.out.println("Error : " + e.getMessage());
                    }
                }
            }
            while (true) {
                try {
                    System.out.print("Enter amount of money you want to exchange : ");
                    exchangeAmount = sc.nextDouble();
                    sc.nextLine();
                    if (exchangeAmount <= 0) {
                        throw new Exception("Exchange amount must be greater than 0 !");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Error : Invalid input type ! Try again.");
                }
            }
            // xu li
            System.out.printf("%nExchange completed : %.2f %s = %.4f %s%n", exchangeAmount, from, exchange(from, to, exchangeAmount), to);
        }
    }

    //    120.00 EUR = 14256.86 JPY
//    120.00 JPY = 0.56 CNY

}



