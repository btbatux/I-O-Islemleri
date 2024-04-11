package ByteArrayStream;

import java.io.IOException;
import java.io.ByteArrayInputStream;

public class ByteArrInputStream {
    public static void main(String[] args) throws IOException {
        byte[] dizi = { 1, 23, 4, 5, 6, 7 };
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(dizi);
        System.out.println("Okunabilir veri miktarı " + arrayInputStream.available());

        int i = arrayInputStream.read();
        while (i != -1) {
            {
                System.out.print(i + " ");
                i = arrayInputStream.read();
            }
        }

        try {
            arrayInputStream.close();
        } catch (IOException e) {
            {
                System.out.println(e.getMessage());

            }
        }

    }
}
