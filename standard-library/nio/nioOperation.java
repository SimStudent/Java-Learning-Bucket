import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nioOperation {
    public static void main(String[] args){
        Path path = Paths.get("1\\2\\3\\4\\5\\6\\7\\test1.txt");  // Windows path
    
        System.out.println(path);
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        System.out.println(path.getRoot());        

        System.out.println("------------------");

        File f = path.toFile();
        File abF = path.toAbsolutePath().toFile();
        System.out.println(f);
        System.out.println(abF);
        
        System.out.println(new File("abc.txt").exists());;
        
        // System.out.println("fuck you");
    }   
}
