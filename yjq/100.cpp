#include <bits/stdc++.h>
using namespace std;

int get()
{
    return abs(rand() % 100);
}

int main()
{
    int n;
    cin >> n;
    srand(int(time(0)));
    for(int i = 1; i <= n; i++)
    {
        int a, b;
        a = get();
        b = get();
        if(get() % 2 == 1)
        {
            while(a + b > 100)
            {
                a = get();
                b = get();
            }
            if(a < 10)
                cout << " ";
            cout << a << " + ";
            if(b < 10)
                cout << " ";
            cout << b << " = ";
        }
        else
        {
            while(a < b)
            {
                a = get();
                b = get();
            }
            if(a < 10)
                cout << " ";
            cout << a << " - ";
            if(b < 10)
                cout << " ";
            cout << b << " = ";
        }
        if(i % 5 == 0)
            cout << endl;
        else
            cout << "   ";
    }
    return 0;
}
