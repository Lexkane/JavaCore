package lesson09_IO_Thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class MyText {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Lv-305.JavaCore\\src\\main\\java\\mytext.txt"));
        ArrayList<String> arr = new ArrayList<>();
        while (reader.ready()){
            arr.add(reader.readLine());
        }
        arr.forEach(x->System.out.println(x.length()));
        String shortes = arr.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("shortest line: "+shortes);
        String longest = arr.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println("Longest line: "+longest);

        for(String s : arr){
            if(s.contains("var")) System.out.println(s);
        }
    }
}
