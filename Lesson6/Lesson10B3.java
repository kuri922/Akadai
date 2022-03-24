import java.util.*;

class Lesson10B3 {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();  

        int year = cal1.get(Calendar.YEAR);       
        int month = cal1.get(Calendar.MONTH) + 1;  
        int day = cal1.get(Calendar.DATE);         
        int hour = cal1.get(Calendar.HOUR_OF_DAY); 
        int minute = cal1.get(Calendar.MINUTE);    
        int second = cal1.get(Calendar.SECOND);   

        StringBuffer dow = new StringBuffer();
        switch (cal1.get(Calendar.DAY_OF_WEEK)) {  
            case 
                Calendar.SUNDAY: dow.append("日"); 
            break;

            case 
                Calendar.MONDAY: dow.append("月"); 
            break;

            case
                 Calendar.TUESDAY: dow.append("火");
             break;

            case
                Calendar.WEDNESDAY: dow.append("水"); 
             break;

            case 
                Calendar.THURSDAY: dow.append("木"); 
            break;

            case 
                Calendar.FRIDAY: dow.append("金"); 
            break;

            case
                 Calendar.SATURDAY: dow.append("土"); 
            break;
        }

       
        System.out.print(year + "年" + month + "月" + day);
        System.out.println( "日 " + "(" + dow +")"  + " " + hour + "時" + minute + "分" + second + "秒");
    }
}