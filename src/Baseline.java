/**
 * Created by kusumi on 24/08/15.
 */
import java.io.*;
public class Baseline {
    public static void main(String[] args) {
        Baseline bl = new Baseline();
        bl.readInput();
    }

    private void readInput() {
        String in;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input item or press 0 to exit");
        while(!(s.nextLine().equals("0"))){
            in = s.nextLine();
        }
    }
}
