#include <bits/stdc++.h>
using namespace std;

bool leapYear(int year);
int get(int year, int month, int day);
int main() 
{
    int year = 2018;
    int month = 11;
    int day = 17;

    int currentYear;
    int currentMonth;
    int currentDay;
    
    cout << "Enter the current year: ";
    cin >> currentYear;
    cout << "Enter the current month: ";
    cin >> currentMonth;
    cout << "Enter the current day: ";
    cin >> currentDay;

    int tmp1 = get(year, month, day);
    int tmp2 = get(currentYear, currentMonth, currentDay);

    cout << tmp2 - tmp1 << endl;
    return 0;
}

bool leapYear(int year) 
{
    if(year % 4 == 0)
        if(year % 100 == 0)
            return year % 400 == 0;
        else
            return true;
    return false;
}

int get(int year, int month, int day)
{
    int ans = day;
    for(int i = 2018; i < year; i++)
    {
        ans = ans + (leapYear(i) ? 366 : 365);
    }

    if(leapYear(year) && month > 2)
        ans++;

    if(leapYear(year) && month == 2 && day == 29)
        ans++;

    for(int i = 1; i < month; i++)
        if(i == 2)
            ans += 28;
        else if(i <= 7)
            if(i % 2 == 1)
                ans += 31;
            else
                ans += 30;
        else
            if(i % 2 == 0)
                ans += 31;
            else
                ans += 30;
    return ans;
}

