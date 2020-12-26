package stringOperations;

import java.util.Locale;
import java.util.Scanner;

public class UpperCase {
    String name ;
    String familyName;

    public void upperCase(){
        Scanner input = new Scanner(System.in);
        // Klavyeden isim giriliyor
        System.out.println("Kisini Ismini Girin: ");
        name = input.next();
        // Klavyeden soyisim giriliyor
        System.out.println("Kisinin Soyadini girin: ");
        familyName = input.next();

        //Girilen isim ve soyisim nasil yazilirsa yazilsin ilk harf buyuk diger harfler kucuk yazilir
        System.out.print(name.substring(0,1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase(Locale.ROOT));
        System.out.print(" ");
        System.out.println(familyName.substring(0,1).toUpperCase(Locale.ROOT) + familyName.substring(1).toLowerCase(Locale.ROOT));
    }



}
