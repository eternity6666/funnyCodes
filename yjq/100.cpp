#include <iostream>
using namespace std;

int get()
{
    return abs(random() % 100);
}

int main()
{
    int n = 22;
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
            cout << a << " + " << b << " = " << endl << endl;
        }
        else
        {
            while(a < b)
            {
                a = get();
                b = get();
            }
            cout << a << " - " << b << " = " << endl << endl;
        }
    }
}
