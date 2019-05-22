package lesson07_strings.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
           for(int i = 0 ; i<5; i++){
               String s = reader.readLine();
               Pattern p = Pattern.compile("([a-z0-9_]{3,15})");
               Matcher m = p.matcher(s);
               if(m.matches()){
                   System.out.println("matches!");
               }
               else System.out.println("do not matches!");
           }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
