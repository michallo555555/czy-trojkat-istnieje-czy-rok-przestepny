import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("1- czy trojkat istnieje  2- czy rok jest przestepny 3-n!");
        Scanner scan = new Scanner(System.in);
        int z= scan.nextInt();

        switch (z) {


            case 1:
            {
                System.out.println("Program sprawdza czy trojkat moze diaac \n podaj a potem b potem c");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();

                if (a + b > c) {
                    if (a + c > b) {
                        if (b + c > a) {

                        }
                    }
                    System.out.println("Trojkat istnieje");

                } else {
                    System.out.println("Trojkat nieistnieje");

                }
            }

            case 2:
            {
              System.out.println("podaj ktory rok chcesz sprawdzic");
              int rok= scan.nextInt();
              if (rok%4==0)
              {
                  System.out.println("Rok jest przestepny"+ rok);
              }else
              {
                  System.out.println("Rok"+ rok );
                  System.out.print("nie jest przestepny" );
              }
            }
            case 3:
            {
                System.out.println("Podaj n");
                int n= scan.nextInt();
                for (int i=n-1;i>0;i--)
                {
                    n=n*i;
                }System.out.println(n);

                }
            }

    }
}
