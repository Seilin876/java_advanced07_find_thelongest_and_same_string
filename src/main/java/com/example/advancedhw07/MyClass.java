package com.example.advancedhw07;
import java.util.Scanner;

public class MyClass { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("�п�J�@�r��(<100)");
    String IS = scanner.next();                                     //��J�r��InputString
    String LS = "";                                                 //�̪��r��LongestString
    int LL = 0;                                                     //�̪�����LongestLength
    int IL = IS.length();                                           //��J�r�����InputLength

    for (int i = 0; i < IL; ) {
        for (int j = 2; j < IL + 1; ) {                      //(�Y�ѫ᩹�e�䪺�ȵ��P�_�l�ȡA�i���S���@�ӬۦP)
            if (IS.lastIndexOf(IS.substring(i, j)) == i) {//�᭱�S���ۦP��
                i++;                                                //���U��
                j = i + 2;                                          //�ǭǥ���
                if (j >= IL + 1) {
                    i = IL;                          //�r�ꦬ�M���������j�������j��
                }
            } else {
                int LN = IS.substring(i, j).length();
                if (LN > LL) {                           //�p�G���ۦP���ת��r��j��"�̪��r�����"
                    LS = IS.substring(i, j);  //�N�r���л\��зǦr��
                    LL = LN;                             //�N"�̪��r�����"��J�Ӫ���
                } else if (LN == LL) {                   //�Y�����׬ۦP
                    LS = LS + "," +IS.substring(i, j);
                }
                j++;
            }
        }
    }
    System.out.println("�̪����Ʀr��:" + LS);

}

}