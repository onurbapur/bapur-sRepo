package Day_25;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

    public static void createDate(){
        Date date = new Date();
        SimpleDateFormat formatla = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String dateStr = formatla.format(date);

        System.out.println(date);
        System.out.println(dateStr);

        timeStamp(dateStr);
    }

    public static void timeStamp(){
        createDate();
    }
    public static void timeStamp(String date){
        String stamp = "";
        for (int i = 0; i < date.length(); i++) {
            if ("0123456789".contains(date.charAt(i) + "")){
                stamp += date.charAt(i) + "";
            }
        }
        System.out.println(stamp);
    }
    public static void main(String[] args) {
        timeStamp();
    }
}
