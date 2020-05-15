#include <bits/stdc++.h>
using namespace std;

void printEnd(int n)
{
    for (int i = 0; i < n; i++)
        cout << endl;
}

bool stillSequence(char c)
{
    if ('a' <= c && c <= 'z')
        return true;
    if ('A' <= c && c <= 'Z')
        return true;
    if (c == ':' || c == ',' || c == ';' || c == '(' || c == ')')
        return true;
    if (c == '¡°' || c == '¡±')
        return true;
    return false;
}

bool isEnding(char c)
{
    return c == '.' || c == '?' || c == '!';
}
bool simpleWord(string s)
{
    if (s == "vs.")
        return true;
    if (s == "US.")
        return true;
    int len = s.length();
    if (len > 1 && s[len - 1] == '.' && s[len - 2] <= '9' && s[len - 2] >= '0')
        return true;
    return false;
}
int main()
{
    freopen("old.in", "r", stdin);
    freopen("new.out", "w", stdout);
    string s;
    bool isEnd = true;
    int count = 0;
    while (cin >> s)
    {
        int len = s.length();
        if (s == "1" || s == "2" || s == "3" || s == "5" || s == "4")
        {
            cout << " " << s << endl;
            isEnd = true;
            continue;
        }
        if (isEnd)
        {
            isEnd = false;
            // cout << ++count << ". ";
        }
        else
            cout << " ";
        cout << s;
        if (isEnding(s[len - 1]) && !simpleWord(s))
        {
            isEnd = true;
            printEnd(5);
        }
    }
    return 0;
}