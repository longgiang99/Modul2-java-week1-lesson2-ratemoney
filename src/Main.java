import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 0;
        int month = 1;
        double laisuat = 1.0;
        System.out.println(" nhap so tien");
        money = scanner.nextDouble();
        System.out.println("nhap so thang");
        month = scanner.nextInt();
        System.out.println("nhap lai suat");
        laisuat  = scanner.nextDouble();
        double total = 0;
        for (int i =0; i < month;i ++){
            total += money*(laisuat/money)*month;
        }
        System.out.println(total);

    }
}