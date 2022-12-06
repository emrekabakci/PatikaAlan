import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, merkez;
        double pi = 3.14, alanp;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz : ");
        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alani : " + alan);
        System.out.println("Dairenin cevresi : " + cevre);

        System.out.print("Merkez olcusunu giriniz : ");
        merkez = inp.nextInt();

        alanp = (pi * (r*r)*merkez)/360;

        System.out.println("Daire diliminin alani : " + alanp);

    }
}