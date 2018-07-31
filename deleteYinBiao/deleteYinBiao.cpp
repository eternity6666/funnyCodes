/************************************************************/
/*                                                          */
/*                功能：删除文件中的音标                    */
/*                                                          */
/************************************************************/
#include <fstream>
#include <string>
#include <cstring>
#include <iostream>
#define usefre
using namespace std;
int main()
{
#ifdef usefre
    freopen("in.txt", "r", stdin);
    freopen("out.txt", "w", stdout);
#endif
    char c;
    string s;
    while(getline(cin,s))
    {
        int flag = 1;
        for(int i = 0; i < s.length(); i++)
        {
            c = s[i];
            if(c == '[')
            {
                flag = 0;
                continue;
            }   
            else if(c == ']')
            {
                flag = 1;
                continue;
            }
            if(flag == 1)
            {
                cout << c;
            }
        }
        cout << endl;
        /*
        if(c == '[')
        {
            flag = 0;
            continue;
        }
        else if(c == ']')
        {
            flag = 1;
            cout << " ";
            continue;
        }
        if(flag == 1)
        {
            cout << c;
        }
        */
    }
    return 0;
}
