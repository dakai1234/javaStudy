package com.java.test1;

/**
 * Program Name:test4
 * 使用运算符计算数据
 * @author xiaoKai
 * @Date 2021/1/14
 */

public class test4 {
	
	public static void main(String[] args)
	{
		//定义计算数据
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
		//计算
		sum = num + num1;    //加法
		num2 = num - num1;   //减法
		num3 = num / num1;   //除法
		num4 = num * num1;   //乘法
		num5 = num % num1;   //除余
		num6 = num++ + num;  //自加，右边自加num6值不加自加值
		num7 = ++num + num;  //自加，左边自加num7值加上自加值
		num8 = -num;         //求负
		num9 = num & num1;   //按位与计算，二进制码按位，当两位相同为1时返回1
		num10 = num | num1;  //按位或计算，二进制码按位，有一位为1时就返回1
		num11 = ~num;        //按位非计算，二进制码按位，将操作数每个位取反
		num12 = num ^ num1;  //按位异或计算，二进制码按位，当两位相同时返回0，不同时返回1
		num13 = num << num1; //左移运算，将操作数二进制码左移，空出来的以0填充
		num14 = num >> num1; //右移运算，将操作数二进制码右移，若操作数为正数则以0填充，反之补1
		num15 = num >>> num1;//右移运算，将操作数二进制码左移，空出来的总是以0填充
		
		num += num1;         //等同于 num等于num加num1
		//下述与上一次相似
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
		
		//若正确则输出ture，错误则输出flase
		System.out.println("num 是否大于 num1:" + (num>num1));
		System.out.println("num 是否相等 num1:" + (num==num1));
		System.out.println("97 是否相等 'a':" + (97 == a));
		System.out.println("ture 是否相等 false:" + (num>num1));
		
		
		
		
		
	}
}
