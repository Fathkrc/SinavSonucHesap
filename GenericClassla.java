package generickonusu;

import java.util.Scanner;

public class GenericClassla {
    public static void main(String[] args) {/*
        Character[] char_dizi = {'J', 'A', 'V', 'a'};
        Integer[] integer_dizi = {1, 2, 3, 4, 5};
        String[] string_dizi = {"Java", "Python", "C++", "go"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Fatih")};
        //OgrenciYazdir.yazdir(ogrenci_dizi);
        CharYazdir.yazdir(char_dizi);
        YazdirmaSinifi<Character> yazdirChar=new YazdirmaSinifi<Character>();
        YazdirmaSinifi<Integer> yazdirInt=new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<String> yazdirstr=new YazdirmaSinifi<String>();
        YazdirmaSinifi<Ogrenci> yazdirogr=new YazdirmaSinifi<Ogrenci>();
        yazdirstr.yazdir(string_dizi);
        System.out.println("************************************");
        yazdirChar.yazdir(char_dizi);
        System.out.println("************************************");
        yazdirInt.yazdir(integer_dizi);
        System.out.println("************************************");
        yazdirogr.yazdir(ogrenci_dizi);*/

       // Sayisal sayisal1=new Sayisal(30,40,20,30);
        //Sayisal sayisal2=new Sayisal(25,45,2,35);
        //Sayisal birinci = birinci(sayisal1,sayisal2);
        //EsitAgirlik esitAgirlik1=new EsitAgirlik(30,20,40,2);
        //EsitAgirlik esitAgirlik2=new EsitAgirlik(40,10,50,0);

        //System.out.println("Birinci sayisal Öğrencisinin puanı : "+birinci.puanHesapla());
        //EsitAgirlik birinci2=birinci(esitAgirlik1,esitAgirlik2);
        //System.out.println("Birinci Eşit ağırlık Öğrencisinin puanı : "+birinci2.puanHesapla());

        System.out.println("YGS LYS birinci bulma programı...");
        Scanner scan=new Scanner(System.in);
        String islemler="İşlemler....\n"+
                "1. Eşit ağırlık Öğrencileri birincisi \n"+
                "2. Sayısal öğrencileri birincisi\n"+
                "Çıkış : q";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");

        while(true){
            System.out.println("çıkış için q ya basınız");
            String sonuc=scan.nextLine();
            if (sonuc.equalsIgnoreCase("q")) {
                System.out.println("programdan çıkılıyor");
                break;
            }
            //1. öğrenci
            System.out.println("birinci öğrenci ismi : ");
            String isim1=scan.nextLine();
            System.out.println("netler(türkçe,matematik,edebiyat,fizik) : " );
            int turkce1=scan.nextInt();
            int matematik1=scan.nextInt();
            int edebiyat1=scan.nextInt();
            int fizik1=scan.nextInt();
            scan.nextLine();
            //2. öğrenci
            System.out.println("ikinci öğrenci ismi : ");
            String isim2=scan.nextLine();
            System.out.println("netler ( türkçe,matematik,edebiyat,fizik) : " );
            int turkce2=scan.nextInt();
            int matematik2=scan.nextInt();
            int edebiyat2=scan.nextInt();
            int fizik2=scan.nextInt();
            scan.nextLine();
            //Üçüncü öğrenci
            System.out.println("üçüncü öğrenci ismi : ");
            String isim3=scan.nextLine();
            System.out.println("netler ( türkçe,matematik,edebiyat,fizik) : " );
            int turkce3=scan.nextInt();
            int matematik3=scan.nextInt();
            int edebiyat3=scan.nextInt();
            int fizik3=scan.nextInt();
            scan.nextLine();
            System.out.println("işlemi giriniz");
            String islem=scan.nextLine();
             if (islem.equals("1")) {
                 EsitAgirlik ogrenci1=new EsitAgirlik(turkce1,matematik1,edebiyat1,fizik1,isim1);
                 EsitAgirlik ogrenci2=new EsitAgirlik(turkce2,matematik2,edebiyat2,fizik2,isim2);
                 EsitAgirlik ogrenci3=new EsitAgirlik(turkce3,matematik3,edebiyat3,fizik3,isim3);
                 EsitAgirlik esitAbirinci = birinci(ogrenci1,ogrenci2,ogrenci3);
                 System.out.println("Birinci Eşit ağırlık öğrencisi : "+ esitAbirinci.getIsim());
                 System.out.println("öğrencinin puanı : "+esitAbirinci.puanHesapla());

             }else if(islem.equals("2")) {
                 Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                 Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                 Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                 Sayisal sayisalbirinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                 System.out.println("Birinci Sayisal öğrencisi : " + sayisalbirinci.getIsim());
                 System.out.println("öğrencinin puanı : "+sayisalbirinci.puanHesapla());
             }
                 else{
                     System.out.println("geçersiz işlem");
                     break;

                 }


        }
    }



    public static <E extends Aday> E birinci(E e1, E e2, E e3) {
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            return e1;
        } else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            return e2;
        } else if (e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla() > e2.puanHesapla()) {
            return e1;
        } else {
            return e1;
        }
    }
}
