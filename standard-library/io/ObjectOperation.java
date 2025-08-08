import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.zip.InflaterOutputStream;

public class ObjectOperation {
    static class Food implements Serializable{
        String name;
        public void setName(String n){
            name = n;
        }

        public String getName(){return name;}
    }

    static class Money implements Serializable{
        double value; 
        public void setMoney(double m){value = m;}
        public double getMoney() {return value;}
    }

    static class Box implements Serializable{

        private static final long serialVersionUID = 1;

        private Food f;
        private Money m;

        public  void setFood(Food fa){f=fa;}
        public void setMoney(Money mm){m = mm;}

        public Food getFood() {return f;}
        public Money getMoney() {return m;}

        @Override
        public String toString() {
    return "Box{food=" + (f != null ? f.getName() : "null") + 
           ", money=" + (m != null ? m.getMoney() : "null") + "}";
}

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        String dataFile = "ObjectOperation.bin";

        Box b = new Box();
        Food f = new Food(); f.setName("penis");
        Money m = new Money(); m.setMoney(153.35);
        b.setFood(f); b. setMoney(m);
        System.out.println(b);

        ObjectOutputStream s = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
        s.writeObject(b);

        s.close();

        ObjectInputStream bbb = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
        Object ccc = bbb.readObject();
        if(ccc instanceof Box){
            System.out.println("ccc is box!");
        }
        System.out.println(ccc);
    }
}
