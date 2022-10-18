package javaBasic;

public class TypePromotion {

	public static void main(String[] args) {
		//1. Java automatically promotes each byte,short or char operand to int
		//when evulating an expression
		//if one operand is long,float or double whole expression is promoted to long,float
		//double respectively
		char a='a';
		char b='b';
		System.out.println(b-a);

	}

}
