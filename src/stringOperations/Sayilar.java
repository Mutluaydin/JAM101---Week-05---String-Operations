package stringOperations;

import java.util.Scanner;

public class Sayilar {
    int sayi =0 ;
    int sayac = 0 ;
    public void sayi(){
        System.out.print( sayi + ",");

        for (int i = 1; i <= 100 ; i++) {
            System.out.print( i + ",");
             if (i %10 == 0 ) {
                 System.out.print("\n");
             }
        }

        System.out.println();
    }

    public void asalSayi(){

        for (int say = 2; say < 100 ; say++) {
            int kontrol = 0;
            for (int j = 2; j < say; j++) {
                if (say % j == 0){
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0){
                System.out.print(say + " ");
                sayac++;
            }
        }
        System.out.println();
    }
}
