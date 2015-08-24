/**
 * Created by kusumi on 24/08/15.
 */
import java.io.*;
import java.util.Scanner;

public class Baseline {
    int[] quantity = new int[20];
    int[] price = new int[20];
    String[] item = new String[20];

    public static void main(String[] args) {
        Baseline bl = new Baseline();
        bl.readInput();
        bl.calculateTax();
    }

    private void calculateTax() {

    }

    private void readInput() {
        String temp, in;

        int itemCounter=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input item or press 0 to exit");
        while(true){
            in=s.nextLine();
            if(in.equals("0")){
                System.out.println("exiting");
                break;
            }
            else{
                item[itemCounter]=in;
                quantity[itemCounter]=in.substring(0,1);
                temp = in.substring(1);
                temp= temp.replaceAll("\\D+", "");
                price[itemCounter]= temp;
                System.out.println("Quantity is " +quantity[itemCounter]);
                System.out.println("Price is "+ price[itemCounter]);
                System.out.println("Item is "+ item[itemCounter]);
                itemCounter++;
            }
        }
        //System.out.println("Input String is " + total);
    }
}
