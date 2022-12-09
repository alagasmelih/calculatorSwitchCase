import java.util.Scanner;

public class calculatorSwitchCase {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n1 = input.nextInt();
        System.out.println("Bir sayı giriniz: ");
        n2 = input.nextInt();
        System.out.println("Lutfen yapmak isteğiniz işlemi seçin\n 1-TOPLAMA\n 2-ÇIKARMA\n 3-ÇARPMA\n 4-BÖLME");

        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma:" + (n1 - n2));
            case 3:
                System.out.println("Çarpma:" + (n1*n2));
            case 4:
                if (n2!=0 && n1!=0) {
                    System.out.println("Bölme:" + (n1/n2));
                }else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız Tekrar Deneyin!!!");
                break;
        }

    }
}