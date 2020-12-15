package Lab13;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String pathDir = "d:\\1";
        String pathFile = "d:\\1\\5.txt";

        findFiles ff = new findFiles(pathDir);
        ff.ReadFile(pathFile, 5);
    }

}