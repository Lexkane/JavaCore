package lesson07_strings.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringSecond {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String f = reader.readLine();
            String s = reader.readLine();
            if(s.contains(f)){
                System.out.println("contains");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
