package server.com.vlad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many fibonacci numbers do you want? ");
        int n = in.nextInt();

        int x=0, y=1, t;
        while (n > 0){
            t = x+y;
            x = y;
            y = t;
            System.out.print(y + " ");
            n--;
        }
    }
}
