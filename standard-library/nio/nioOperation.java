import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nioOperation {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("1\\2\\3\\4\\5\\6\\7\\test1.txt");  // Windows path
        Path path2 = Paths.get("1","2","3","4","123.txt");

        System.out.println(path2.toString());

        System.out.println("------------------");

        System.out.println(path);
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        System.out.println(path.getRoot());        

        System.out.println("------------------");

        File f = path.toFile();
        File abF = path.toAbsolutePath().toFile();
        System.out.println(f);
        System.out.println(abF);
        
        System.out.println(new File("abc.txt").exists());

        System.out.println(Files.exists(path2));
        
        Path path3 = Paths.get("nioOperation.java");
        System.out.println(Files.exists(path3));
        System.out.println(Files.size(path3));


        Path path4 = Paths.get("you","hello");
        Files.createDirectories(path4);

        // ls the directory 
        // Files.list(path3);   // NotDirectoryException
        Path documentPath = Paths.get("D:\\Documents");
        Files.list(documentPath).forEach(System.out::println);;
        
        // System.out.println("fuck you");
    }   
}
