import java.util.Date;

public class important {

    public static void main(String[] args) {
        
        Date fallInLove = new Date();
        fallInLove.setYear(118);
        fallInLove.setMonth(10);
        fallInLove.setDate(17);

        long time = new Date().getTime() - fallInLove.getTime();

        System.out.println(new Date().toString());
        System.out.println(fallInLove.toString());
        System.out.println(time);
        System.out.println(time / 1000 / 60 / 60 / 24);
       // */
        Date current = new Date();
        int currentYear = current.getYear();
        int currentMonth = current.getMonth();
        int currentDay = current.getDay();
        System.out.println(currentYear + " " + currentMonth + " " + currentDay);
        System.out.println(current.toString());

        int fallInLoveYear = 2018;
        int fallInLoveMonth = 11;
        int fallInLoveDay = 17;

        int day = 0;
        for(int i = currentYear; i < fallInLoveYear; i++)
        {
            if(currentMonth <= 2)
            {
                if(leapYear(i))
                    day += 366;
                else
                    day += 365;
            }
            else
            {
                if(leapYear(i + 1))
                    day += 366;
                else
                    day += 365;
            }
        }
        int tmpCurrent = get(currentYear, currentMonth, currentDay);
        int tmpFallInLoveYear = get(fallInLoveYear, fallInLoveMonth, fallInLoveDay);
        day += tmpFallInLoveYear - tmpCurrent;
        System.out.println(day);
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

    public static int get(int year, int month, int day) {

        int[] arrayMonth = new int[14];
        for(int i = 1; i <= 12; i++)
        {
            if(i == 2)
                arrayMonth[i] = 28;
            else if(i <= 7)
            {
                if(i % 2 == 0)
                    arrayMonth[i] = 30;
                else
                    arrayMonth[i] = 31;
            }
            else
            {
                if(i % 2 == 1)
                    arrayMonth[i] = 30;
                else
                    arrayMonth[i] = 31;
            }
        }

        int ans = 0;
        if(leapYear(year))
        {
            for(int i = 1; i < month - 1; i++)
            {
                if(i == 2)
                    ans = ans + 1;
                ans = ans + arrayMonth[i];
            }
            /*
            if(month == 1)
                return day - 1;
            else if(month == 2)
                return day + 31 - 1;
            else if(month == 3)
                return day + 31 + 29 - 1;
            */
        }
        else
        {
            for(int i = 1; i < month - 1; i++)
                ans = ans + arrayMonth[i];
        }
        return ans;
    }
}
