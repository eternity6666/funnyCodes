// huanFang:幻方

// package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inner = new Scanner(System.in);
        System.out.print("请输入幻方的阶数(本算法只适用于奇数阶幻方):");
        int userInput = inner.nextInt();
        int tmp = 0;
        while(userInput % 2 == 0 || userInput <= 2)
        {
            tmp++;
            if(tmp == 10)
                break;
            System.out.println("请注意您还有" +(10 - tmp) + "次输入机会:");
            System.out.print("请输入大于1的奇数:");
            userInput = inner.nextInt();
        }
        if(tmp < 10) {
            System.out.println("感谢您的输入,您输入的幻方其中一种构造方法为:");
            deal(userInput);
        }
        else {
            System.out.println("错误输入过多，游戏结束!");
        }
    }

    public static int get(int a, int n){
        if(a < 1)
            return 1;
        else if (a > n)
            return n;
        else
            return a;
    }

    public static void deal(int n){
        // FileOutputStream output = new FileOutputStream("out.txt");
        // 定义n阶幻方
        int[][] HF = new int[n + 1][n + 1];
        // 初始化n阶幻方
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                HF[i][j] = 0;


        // 生成幻方
        int x, y;
        x = 1;
        y = n / 2 + 1;

        HF[x][y] = 1;
        int tmp = 1;
        while(tmp < n * n) {
            if(x == 1){
                if(y == n){
                    x++;
                }
                else{
                    x = n;
                    y++;
                }
            }
            else{
                if(y == n){
                    x--;
                    y = 1;
                }
                else{
                    x--;
                    y++;
                    if(HF[x][y] != 0) {
                        x++;
                        y--;
                        x++;
                    }
                }
            }

            if(x >= 1 && x <= n && y >= 1 && y <= n && HF[x][y] == 0)
                HF[x][y] = ++tmp;

            /*
            for(int i = 1; i <= n; i++){
                System.out.print("   ");
                for(int j = 1; j <= n; j++){
                    if(n >= 100)
                        System.out.printf(" %03d", HF[i][j]);
                    else if(n >= 10)
                        System.out.printf(" %02d", HF[i][j]);
                    else
                        System.out.printf(" %01d", HF[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            */
        }

        // 输出幻方
        tmp = n * n;
        int numN = 0;
        while(tmp / 10 != 0){
            numN++;
            tmp /= 10;
        }

        for(int i = 1; i <= n; i++){
            System.out.print("   ");
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
                outputSpace(numN, HF[i][j]);
                System.out.print(HF[i][j]);
            }
            System.out.println();
        }
    }

    public static void outputSpace(int a, int b){
        for(int i = a; i >= 1; i--) {
            if(b < Math.pow(10, i))
                System.out.print(" ");
            else
                break;
        }
    }
}

