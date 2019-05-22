package lesson07_strings.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initials {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
          StringBuilder sb = new StringBuilder();
          sb.append(reader.readLine()+" ");
          sb.append(reader.readLine()+" ");
          sb.append(reader.readLine());
          String[] arr = sb.toString().split(" ");
            System.out.printf("Surname and initials: %s %s.%s.\n", arr[0], arr[1].charAt(0), arr[2].charAt(0));
            System.out.printf("Name : %s\n" , arr[0]);
            System.out.printf("Name: %s , Middle name: %s, Last name: %s\n",arr[0], arr[2], arr[1]);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
