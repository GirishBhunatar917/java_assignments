package assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class display_time_12 {
    public static void main(String[] args) {
        
        Date now = new Date();
        
       
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        
       
        String formattedTime = formatter.format(now);
        
        
        System.out.println("Current system time: " + formattedTime);
    }
}

