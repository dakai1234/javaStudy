package com.java.test1;

/**
 * Program Name:test4
 * ʹ���������������
 * @author xiaoKai
 * @Date 2021/1/14
 */

public class test4 {
	
	public static void main(String[] args)
	{
		//�����������
		char a = 'a';
		int num = 1;
		int num1 = 2;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int num7 = 0;
		int num8 = 0;
		int num9 = 0;
		int num10 = 0;
		int num11 = 0;
		int num12 = 0;
		int num13 = 0;
		int num14 = 0;
		int num15 = 0;
		int num16 = 0;
		int num17 = 0;
		int sum = 0;
		//����
		sum = num + num1;    //�ӷ�
		num2 = num - num1;   //����
		num3 = num / num1;   //����
		num4 = num * num1;   //�˷�
		num5 = num % num1;   //����
		num6 = num++ + num;  //�Լӣ��ұ��Լ�num6ֵ�����Լ�ֵ
		num7 = ++num + num;  //�Լӣ�����Լ�num7ֵ�����Լ�ֵ
		num8 = -num;         //��
		num9 = num & num1;   //��λ����㣬�������밴λ������λ��ͬΪ1ʱ����1
		num10 = num | num1;  //��λ����㣬�������밴λ����һλΪ1ʱ�ͷ���1
		num11 = ~num;        //��λ�Ǽ��㣬�������밴λ����������ÿ��λȡ��
		num12 = num ^ num1;  //��λ�����㣬�������밴λ������λ��ͬʱ����0����ͬʱ����1
		num13 = num << num1; //�������㣬�������������������ƣ��ճ�������0���
		num14 = num >> num1; //�������㣬�������������������ƣ���������Ϊ��������0��䣬��֮��1
		num15 = num >>> num1;//�������㣬�������������������ƣ��ճ�����������0���
		
		num += num1;         //��ͬ�� num����num��num1
		//��������һ������
		num -= num1;
		num /= num1;
		num *= num1;
		num %= num1;
		num &= num1;
		num |= num1;
		num ^= num1;
		num <<= num1;
		num >>= num1;
		num >>>= num1;
		
		//����ȷ�����ture�����������flase
		System.out.println("num �Ƿ���� num1:" + (num>num1));
		System.out.println("num �Ƿ���� num1:" + (num==num1));
		System.out.println("97 �Ƿ���� 'a':" + (97 == a));
		System.out.println("ture �Ƿ���� false:" + (num>num1));
		
		
		
		
		
	}
}
