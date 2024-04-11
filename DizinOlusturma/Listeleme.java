package DizinOlusturma;

import java.io.File;

public class Listeleme {
    public static void main(String[] args) {
        File file = new File("DizinOlusturma");
        String[] fileList = file.list();
        for (String str : fileList) {
            System.out.println(str);
        }
    }
}
