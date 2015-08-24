/**
 * Created by kusumi on 24/08/15.
 */
import java.io.*;
import java.util.Scanner;

public class Baseline {
    public static void main(String[] args) {
        Baseline bl = new Baseline();
        bl.readInput();
    }

    private void readInput() {
        String in;
        String[] quantity = new String[20];
        String[] price = new String[20];
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
                quantity[itemCounter]=in.substring(0,1);

                System.out.println(quantity[itemCounter]);
            }
        }
        //System.out.println("Input String is " + total);
    }
}
