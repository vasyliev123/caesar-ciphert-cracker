import java.io.*;

public class Main {

    //26  90-65

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            char c;
            int i;
            int key =0;
            BufferedReader br = new BufferedReader(new FileReader("key.txt"));
            if(br.ready())
                key = Integer.parseInt(br.readLine());
            do{
                i = in.read();
                if(i!=-1) {
                    c = (char) i;
                    System.out.println(c);
                    int temp = c + key;

                    if(c<=90&&c>=65){
                        if(temp<65) {
                            c = (char) (90-(65-temp)+1);

                        }
                        else if (temp > 90) {
                            c = (char) (temp - 90 + 65 -1);
                        } else {
                            c = (char) temp;
                        }
                    }
                    else if(c<=122&&c>=97){
                        if(temp<65) {
                            c = (char) (122-(97-temp)+1);

                        }
                        else if (temp > 122) {
                            c = (char) (temp - 122 + 97 -1);
                        } else {
                            c = (char) temp;
                        }
                    }
                    out.write(c);
                }
            }
            while( i !=-1);
        }
        finally {
            if(in!=null)
            {
                in.close();
            }
            if(out!=null)
            {
                out.close();
            }
        }
    }
}
