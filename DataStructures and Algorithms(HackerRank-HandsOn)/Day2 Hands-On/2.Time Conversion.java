import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    
    public static String timeConversion(String s) {
   
         String time = s.substring(0,8);
             String format = s.substring(8,10);
             String hour=time.substring(0,2);
             System.out.println(format);
             if(format.equals("AM")){
                 if(hour.equals("12")) {
                     return (time.replaceAll(hour,"00"));
                 }
                 return time;
             }
                 
             else {
                 if(hour.equals("12")) {
                     return time;
                 }
                 int total_hour=12+Integer.parseInt(hour);
                 String newtime=Integer.toString(total_hour);
               
                 
                 return (time.replaceAll(hour,newtime));
    }

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
