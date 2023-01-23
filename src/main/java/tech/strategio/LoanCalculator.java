package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     *
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        /*
        * The function for calculating the remaining loan amount
        * after 3 months.
        */
        int acc = amount;
        int interest = 0;
        for(int i = 1; i <= 3; i++){
            interest = (int)((double)(acc) * 0.1);
            acc -= interest;
        }
        return acc;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
