package homework7;

public class FileName {

    public static void main(String[] args) {
        String directory = "c:\\WebServers\\home\\testsite\\www\\myfile.txt";

        System.out.println(directory);


        int index = directory.lastIndexOf("\\");
        String fileName = directory.substring(index + 1);
        String withoutExtension= fileName.replaceFirst("[.][^.]+$", "");
        System.out.println(withoutExtension);
    }
}
