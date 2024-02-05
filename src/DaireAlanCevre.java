import java.util.Scanner;

public class DaireAlanCevre
{
    public static void main(String[] args)
    {
        double alan, r,cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap Uzunluğunu (r) Giriniz.: ");
        r = input.nextInt();

        alan = 3.14 * r * r;
        cevre = 2 * 3.14 * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }

}
