import java.util.*;

public class important {

    public static void main(String[] args) {

        Date fallInLove = new Date(2018, 11, 17);
        Date date = new Date();
        System.out.println(date.toString());


        long time = fallInLove.getTime() - date.getTime();
        System.out.println(time / (1000 * 60 * 24));   
        /*
        int year = 2018;
        int month = 11;
        int day = 17;
        */

        System.out.println(date.getTime());
        // System.out.println(date.year);
        // System.out.println(date.compareTo(fallInLove));
        /*
         *
        if(leapYear(date.getYear()))
        {
            int month;
            if(date.getMonth() > 2)
            {

            }
        }
        else
        {

        }
        */
    }
    
    public static boolean leapYear(int year) {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }
}

