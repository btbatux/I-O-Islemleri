package DizinOlusturma;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("DizinOlusturma/aaa/");

        boolean value = file.mkdir();
        if (value) {
            System.out.println("The new directory is created.");
        } else {
            System.out.println("The directory already exists.");
        }

    }
}
