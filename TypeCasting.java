package javaBasic;

public class TypeCasting {

	public static void main(String[] args) {
  //byte-> short-> int->float->long->double//
  //Destination type > source type(if it doesn't follow then it's called "Lossy conversion")
  //type conversion=="wideing" conversion or "implicit" conversion
  //type casting=="Narrowing conversion" or "Explicit conversion"
		float a=25.12f;
		int b=(int)a;
		System.out.println(b);
	}

}
