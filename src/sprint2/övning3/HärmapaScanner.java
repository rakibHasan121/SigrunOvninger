package sprint2.övning3;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HärmapaScanner {
    HärmapaScanner() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Write something: ");
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("bye")) {
                System.exit(0);
            }else if(input.equals("")){
                System.out.println("Input cant be blank");
            }
            System.out.println("You said: " + input);
            System.out.print("Write something: ");
        }
    }

    public static void main(String[] args) {
        HärmapaScanner hm = new HärmapaScanner();
    }

}
