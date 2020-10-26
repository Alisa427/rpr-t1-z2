package ba.unsa.etf.rpr;

import com.sun.jdi.InternalException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Unesi broj");
        n = in.nextInt();
        int i = 1;
        if (sumaCifara(n)) {
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }
    }

    private static boolean sumaCifara(int n) {
        int cifra;
        int br = n;
        int suma = 0;
        for (; ; ) {
            cifra = n % 10;
            n = n / 10;
            suma = suma + cifra;
            if (n == 0)
                break;
        }
        n = br;
        if (n % suma == 0)
            return true;
        return false;
    }
}
