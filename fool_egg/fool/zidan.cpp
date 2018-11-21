#include <iostream>
#include <string>
#include <cstring>
using namespace std;
int main()
{
    char yn;
    int flag=0;
    string foolSaid;
    do
    {
        system("clear");
        cout<<"子蛋为您服务:\n";
        cout << "傻子,子蛋将帮你判断傻蛋说的是对还是错:\n";
        cout << "傻子,请输入傻蛋说过的话:\n";
        cin >> foolSaid;
        cout << "傻子,你觉得傻蛋说的对吗?(Y/N)";
        cin >> yn;
        if (yn == 'Y' || yn == 'y')
        {
            cout << "很开心,你做了正确的判断,傻蛋说的是对的!\n";
        }
        else
        {
            cout << "很抱歉,你做了错误的判断,傻蛋说的是对的.傻子同学,你需要follow her and do it.\n";
        }
        cout<<"输入1继续使用:\n";
        cin>>flag;
    }while(flag==1);
    cout<<"子蛋很高兴为您服务,祝傻子和傻蛋生活愉快!天天开心!";
    return 0;
}

