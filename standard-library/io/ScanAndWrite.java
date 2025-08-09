import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;

public class ScanAndWrite {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in,"UTF-8");
        // BufferedOutputStream bufferOutput = new BufferedOutputStream(new FileOutputStream("scanAndWrite.txt"));
        // BufferedOutputStream bufferOutput = new BufferedOutputStream(new FileOutputStream(new File("scanAndWrite.txt")));
        BufferedWriter bufferOutput = new BufferedWriter(new FileWriter("scanAndWrite.txt"));

        for(int i=0;i<3;i++){
            String temp = scan.nextLine();  // Not have \n
            // temp = temp + "\n";
            // bufferOutput.write(temp.getBytes("UTF-8"));
            // bufferOutput.write("\n".getBytes("UTF-8"));
            bufferOutput.write(temp);
            bufferOutput.write("\n");
        }
        bufferOutput.flush();
        System.out.println("输出完成！");

        BufferedInputStream bufferIntput = new BufferedInputStream(new FileInputStream("scanAndWrite.txt"));

        Scanner scan2 = new Scanner(new FileInputStream("scanAndWrite.txt"),"UTF-8");
        while(scan2.hasNextLine()){
            System.out.println(scan2.nextLine());
        }

    }
}