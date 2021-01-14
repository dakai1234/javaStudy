package com.java.test1;

/**
 * Program Name:test3
 * 数据变量间的类型转换
 * @author xiaoKai
 * @Date 2021/1/14
 */
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动转换
		byte num = 1;
		short num1 = num;
		int num2 = num1;
		long num3 = num2;
		float num4 = num3;
		double num5 = num4;
		String a = "1"+"2"+"3";
		//强制转换
		byte num7 = (byte)num1;
		short num8 = (short)num2;
		int num9 = (int)num3;
		float num10 = (float)num5;
		double num11 = (double)num2;
		int num12 = Integer.parseInt(a);
		
	}

}
