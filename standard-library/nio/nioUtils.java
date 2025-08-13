import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nioUtils {

    
    public static void listDir(String dir) throws Exception{
        Path p = Paths.get(dir);
        if(Files.isDirectory(p)){
            // Files.list(p).forEach(System.out::println);
            Files.list(p).forEach(path ->{
                try{
                    if (Files.isDirectory(path)){
                        System.out.println("[DIR] "+ path);
                    }
                    else{
                        System.out.println("[FILE] "+ path);
                    }
                } catch(Exception e){
                    System.out.println("[UNKNOWN] " + path);
                }
            });


        }
        else{
            System.out.println(p + "is not a directory!");
        }
    }



    public static void main(String[] args) throws Exception{
        listDir("D:\\Documents");
    }
}
