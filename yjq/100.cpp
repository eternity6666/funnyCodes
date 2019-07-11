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
    while(n--)
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
            cout << a << " + " << b << " = " << endl;
        }
        else
        {
            while(a < b)
            {
                a = get();
                b = get();
            }
            cout << a << " - " << b << " = " << endl;
        }
    }
}
