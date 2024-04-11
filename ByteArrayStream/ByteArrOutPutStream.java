package ByteArrayStream;

import java.io.ByteArrayOutputStream;

public class ByteArrOutPutStream {
    public static void main(String[] args) {
        String data = "Patika ile Java Öğreniyorum";

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            out.write(array);

            String streamData = out.toString();
            System.out.println("Çıkış akışı : " + streamData);

            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
