
import java.util.Scanner;

public class Asal {

    static void Asal_sayi(int n,int i) {

        if (n == i) {

            System.out.println(n+ " asaldır");
            return ;}

            else if(n<2){

                System.out.println("asal sayılar 2 den küçük olamaz");

            }

        else if (n % i == 0) {

            System.out.println((n+ " asal değildir"));

            return;
        }

        Asal_sayi(n,i+1)  ;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");


        int n = input.nextInt();

        Asal_sayi(n,2);


    }

}