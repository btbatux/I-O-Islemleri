import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStr {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("dosya.txt");

            String isim = "batuhan strg";
            byte[] isimDizi = isim.getBytes();
            fileOutputStream.write(isimDizi);

        } catch (FileNotFoundException f) {
            System.out.println("Dosya Bulunamadı" + f.getMessage());
        } catch (IOException ex) {
            System.out.println("Dosya yazılırken hata oluştu" + ex.getMessage());

        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya Kapatılırken bir hata oluştur " + e.getMessage());
            }
        }

    }
}
