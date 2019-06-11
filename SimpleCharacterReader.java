import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCharacterReader {

    public static  void main(String[] args) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        System.out.println("insert character");
        char c;

        do{
            c = (char) in.read(); //easy buffer overflow with string
            System.out.println(c);
        }while(c != 'e');

    }






}
