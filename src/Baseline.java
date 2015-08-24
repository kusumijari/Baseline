/**
 * Created by kusumi on 24/08/15.
 */
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baseline {
    int[] quantity = new int[20];
    int[] price = new int[20];
    String[] item = new String[20];
    int itemCounter;
    public static void main(String[] args) {
        Baseline bl = new Baseline();
        bl.readInput();
        bl.calculateTotal();
    }

    private void calculateTotal() {
        String p1 = " book[s?] ";
        Pattern pattern = Pattern.compile(p1);
        int  tax=0;
        for(int i = 0; i < itemCounter; i++){
            int itemTotal = quantity[i] * price[i];
            Matcher m = pattern.matcher(item[itemCounter]);
            if(!(m.find())){
                tax = 
            }
        }
    }

    private void readInput() {
        String temp, in;

        itemCounter=0;
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
                quantity[itemCounter]=Integer.parseInt(in.substring(0,1));
                temp = in.substring(1);
                temp= temp.replaceAll("\\D+", "");
                price[itemCounter]=Integer.parseInt(temp);
                System.out.println("Quantity is " +quantity[itemCounter]);
                System.out.println("Price is "+ price[itemCounter]);
                System.out.println("Item is "+ item[itemCounter]);
                itemCounter++;
            }
        }
        //System.out.println("Input String is " + total);
    }
}
