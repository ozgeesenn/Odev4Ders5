public class Departman {

    String kisiAdi;
    String personelNo;
    String bolum;
    String adres;

    void baslat()
    {
        System.out.println(kisiAdi + " icin Departman methodu baslatildi");
    }

    void durdur()
    {
        System.out.println(kisiAdi + " icin Departman methodu durduruldu");
    }

    void personelBilgileri()
    {
        System.out.println("Personel bilgileri getiriliyor..\n"+ kisiAdi + " " + personelNo + " " + bolum + " " + adres);
    }


}
