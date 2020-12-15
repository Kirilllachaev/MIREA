package Lab13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class findFiles {

    ArrayList <File> list;

    public findFiles (String Path) throws IOException{

        System.out.println("----------------------------------");
        System.out.println("Список файлов в директории:" + Path);
        System.out.println("----------------------------------");

        list = new ArrayList<File>();
        File f = new File (Path);
        File[] listFiles = f.listFiles();
        int i=0;
        for(File f1 :listFiles){
            list.add(f1);
            System.out.println(list.get(i++));
        }
    }

    public ArrayList<File> getList(){
        return list;
    }

    public File getIndex(int i){
        return list.get(i);
    }

    public void ReadFile (String path, int cont) throws IOException{

        System.out.println("----------------------------------------");
        System.out.println("Первые пять файлов в директории:" + path);
        System.out.println("----------------------------------------");

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(i ==(cont-1)){
                    System.out.println("----------------------------------------");
                    return;
                }

                i++;

            }
        }

    }

}
