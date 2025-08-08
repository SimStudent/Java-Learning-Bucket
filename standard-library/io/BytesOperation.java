import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class BytesOperation {
    public static void main(String[] args){
        // try{
        // FileInputStream in = new FileInputStream("in.txt");
        // FileOutputStream out = new FileOutputStream("out.txt");
        // }
        // finally{
        //     if(in!=null){
        //         in.close();  // 作用域会出现问题
        //     }
        // }
        // FileInputStream in = null;
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        // FileOutputStream out = null;

        try{
            System.out.println(0.1+0.2);
            System.out.println(System.console());
            Scanner scan = new Scanner(new FileInputStream("in.txt"));
            while(scan.hasNext()){
                System.out.println(scan.next());
            }

            // in = new FileInputStream("1.exe");
            in = new BufferedInputStream(new FileInputStream("1.exe"));

            // out = new FileOutputStream("2.exe");
            out = new BufferedOutputStream(new FileOutputStream("12.exe"));
            int c;
            Instant i = Instant.now();
            while((c = in.read())!=-1){
                // System.out.print(c);
                out.write(c);
               }
            Instant j = Instant.now();
            System.out.println("It need " + Duration.between(i, j).toSeconds());;
            
        }
        catch(FileNotFoundException e){System.out.println("Cannot find the files!");}
        catch(IOException e){System.out.println(e);}
        finally{
            try {
                if(in!=null){
                    in.close();  // 作用域会出现问题
                }
                if(out != null){
                    out.close();
                }       
            } catch (Exception e) {
                System.out.println("It is exception!");    
            }

        }
    }    
}
