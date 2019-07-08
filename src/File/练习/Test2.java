package File.练习;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\34759\\Desktop\\三国演义");
        file.mkdir();
        File[] fileArray = file.listFiles();
        for (File f : fileArray) {
//            System.out.println(f.getName());
//            三国演义_001_桃园三结义.txt
//            三国演义_002_三英战吕布.txt
//            三国演义_003_赤壁之战.txt
//            三国演义_004_月下追貂蝉.txt
            String name = f.getName();
            int index = name.indexOf("_");
            String numberString = name.substring(index + 1, index + 4);
            int index2 = name.lastIndexOf("_");
            String nameString = name.substring(index2 + 1);
            String newName = numberString.concat("_").concat(nameString);
//            System.out.println(newName);
            // 进行重命名
            File newFile = new File(file, newName);
            f.renameTo(newFile);
        }

    }
}
