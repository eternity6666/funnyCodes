#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;
int main()
{
    srand(time(NULL));

    int flag = 1;
    cout << "开始游戏\n";
    do
    {
        int n = rand() % 100;
        cout << "我写下了一个数. \n它是[0,100)这个区间内的一个整数. \n你能猜中吗?\n";
        int ans, num = 0;
        double start = clock();
        while(cin >> ans)
        {
            num ++;
            if(ans == n)
            {
                break;
            }
            else if(ans > n)
            {
                cout << "大了" << endl;
            }
            else
            {
                cout << "小了" << endl;
            }
        }
        double end = clock();
        if(num == 1) cout << "哇! 您真棒, 1次就猜中了. ";
        else cout << "你猜了" << num << "次终于猜对了. ";
        double useTime = (end - start) / CLOCKS_PER_SEC;
        cout << "你用了" << useTime << "秒\n";
        cout << "输入1继续游戏. \n";
        cin >> flag;
    }
    while(flag == 1);
    return 0;
}
