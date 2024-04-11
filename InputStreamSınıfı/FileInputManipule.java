package InputStreamSınıfı;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputManipule {
    public static void main(String[] args) throws IOException {
        String path = "InputStreamSınıfı/urunler.txt"; // dosya yolu
        FileInputStream fis = new FileInputStream(path);

        int Intcharacter;
        String words = "";

        while ((Intcharacter = fis.read()) != -1) { // okuma işlemi bittiyse deger -1 olacaktır
            words += (char) Intcharacter;
        }

        int urunSayisi = 0;
        String arr[] = words.split("-");

        System.out.println("Urun Sayisi: " + (arr.length - 1));
    }
}
