package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Monica wants to buy a keyboard and a USB drive from her favorite electronics store. The store has several models of each. Monica wants to spend as much as possible for the  items, given her budget.

Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the amount of money Monica will spend. If she doesn't have enough money to both a keyboard and a USB drive, print -1 instead. She will buy only the two required items.

For example, suppose she has  to spend. Three types of keyboards cost . Two USB drives cost . She could purchase a , or a . She chooses the latter. She can't buy more than  items so she can't spend exactly .

Function Description

Complete the getMoneySpent function in the editor below. It should return the maximum total price for the two items within Monica's budget, or  if she cannot afford both items.

getMoneySpent has the following parameter(s):

keyboards: an array of integers representing keyboard prices
drives: an array of integers representing drive prices
b: the units of currency in Monica's budget
Input Format

The first line contains three space-separated integers , , and , her budget, the number of keyboard models and the number of USB drive models.
The second line contains  space-separated integers , the prices of each keyboard model.
The third line contains  space-separated integers , the prices of the USB drives.
 */
public class ElectronicsShop3 {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int maxVal = 0;

        for(int i=0; i<keyboards.length; i++){
            for(int j=0; j<drives.length; j++){
                if ((keyboards[i] + drives[j]) > maxVal && (keyboards[i] + drives[j]) <= b){
                    maxVal = (keyboards[i] + drives[j]);
                }
                if(maxVal == 0){
                    maxVal = -1;
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        Scanner scanner = new Scanner(System.in);

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

//        bufferedWriter.write(String.valueOf(moneySpent));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        System.out.println("String.valueOf(moneySpent) = "+String.valueOf(moneySpent));

        scanner.close();
    }
}

