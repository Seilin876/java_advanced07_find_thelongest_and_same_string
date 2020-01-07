package com.example.advancedhw07;
import java.util.Scanner;

public class MyClass { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入一字串(<100)");
    String IS = scanner.next();                                     //輸入字串InputString
    String LS = "";                                                 //最長字串LongestString
    int LL = 0;                                                     //最長長度LongestLength
    int IL = IS.length();                                           //輸入字串長度InputLength

    for (int i = 0; i < IL; ) {
        for (int j = 2; j < IL + 1; ) {                      //(若由後往前找的值等同起始值，可知沒有一個相同)
            if (IS.lastIndexOf(IS.substring(i, j)) == i) {//後面沒有相同的
                i++;                                                //往下找
                j = i + 2;                                          //倆倆先找
                if (j >= IL + 1) {
                    i = IL;                          //字串收尋結束直接強迫結束迴圈
                }
            } else {
                int LN = IS.substring(i, j).length();
                if (LN > LL) {                           //如果有相同長度的字串大於"最長字串長度"
                    LS = IS.substring(i, j);  //將字串覆蓋於標準字串
                    LL = LN;                             //將"最長字串長度"填入該長度
                } else if (LN == LL) {                   //若有長度相同
                    LS = LS + "," +IS.substring(i, j);
                }
                j++;
            }
        }
    }
    System.out.println("最長重複字串:" + LS);

}

}