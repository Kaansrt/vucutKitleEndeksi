import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,endeks;
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        kilo = input.nextDouble();
        endeks = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksiniz : "+endeks);
    }
}