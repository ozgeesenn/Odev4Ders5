public class main {

    public static void main(String[] args)
    {
        Departman kisi1 = new Departman();
        Departman kisi2 = new Departman();
        Departman kisi3 = new Departman();

        kisi1.kisiAdi= "Ozge Sen";
        kisi2.kisiAdi= "Serkan Cura";
        kisi3.kisiAdi = "Ali Kaya";

        kisi1.personelNo = "KSHJDGKSDG";
        kisi2.personelNo = "LSJGLSEJG";
        kisi3.personelNo = "VELNIVLEWN";

        kisi1.bolum = "IK";
        kisi2.bolum = "IT";
        kisi3.bolum = "CRM";

        kisi1.adres = "Eskisehir";
        kisi2.adres = "İstanbul";
        kisi3.adres = "Sivas";

        kisi1.baslat();
        kisi1.personelBilgileri();
        kisi1.durdur();

        kisi2.baslat();
        kisi2.personelBilgileri();
        kisi2.durdur();

        kisi3.baslat();
        kisi3.personelBilgileri();
        kisi3.durdur();


    }
}
