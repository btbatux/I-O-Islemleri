package InputStreamSınıfı;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException // olası hata

    {

        /*
         * InputStream abstract bir sınıf olduğu için kendi başına kullanışlı değildir
         * o yüzden InputStream'a ait alt sınıflar veri okumak için kullanılır.
         * InputStream alt sınıfları : FileInputStream, ByteArrayInputStream,
         * ObjectInputStream
         * 
         ** Tüm byte akışı sınıfları, InputStream ve OutputStream soyut (abstract)
         * sınıflardan türetilir.
         */

        String path = "InputStreamSınıfı/urunler.txt"; // dosya yolu
        FileInputStream fis = new FileInputStream(path);

        int karakter;
        while ((karakter = fis.read()) != -1) { // okuma işlemi bittiyse deger -1 olacaktır
            System.out.print((char) karakter);
        }

    }
}
