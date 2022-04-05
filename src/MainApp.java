import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        int a, b ;
        double c;

        Scanner read = new Scanner(System.in);

        System.out.println("1.Dik kenarı giriniz.");
        a = read.nextInt();

        System.out.println("2. Dik Kenarı giriniz.");
        b= read.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c );

        double u , alan  ;
         u = (a + b + c)/ 2 ;
         alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı : " + alan);



    }
}
