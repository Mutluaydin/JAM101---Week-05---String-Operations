package stringOperations;

public class Sifre {


    public void rastgeleSifre(){

        String buyukKarakter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sayilar = "0123456789";
        String kucukKarakter = "abcdefghijklmnopqrstuvxyz";
        String ozelKarakter = "+*%&/()=?^![]{}-_.,;:$£<>@#|§";

            String [] rast = new String[50];


        for (int j = 0; j < 50 ; j++) {
            int sayi = (5+(int) (Math.random()));


            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < sayi ; i++) {

                int index1 =(int)(buyukKarakter.length()*Math.random()) ;
                int index2 =(int)(kucukKarakter.length()*Math.random()) ;
                int index3 =(int)(sayilar.length()*Math.random()) ;
                int index4 =(int)(ozelKarakter.length()*Math.random()) ;
                if (index1 !=0  && index2 !=0 &&index3 !=0 &&index4 !=0 ){
                    sb.append(buyukKarakter.charAt(index1));
                    sb.append(kucukKarakter.charAt(index2));
                    sb.append(sayilar.charAt(index3));
                    sb.append(ozelKarakter.charAt(index4));
                }




            }
            rast[j] = sb.toString();

            System.out.println(rast[j] );
        }

    }

}


