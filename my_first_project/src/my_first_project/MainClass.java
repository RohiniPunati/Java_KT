package my_first_project;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class MainClass extends ObjConstructor {
	int a = 20;
	int b;
	String me;
	//static block
	static {
		System.out.println("static block in mainClass");
	}

	MainClass(String me) {

		this.me = me;
		System.out.println("this keyword with constructor " + me);
	}

	void value(int b) {
		this.b = b;
		System.out.println("a value in main class super.a = " + super.a + " local a =" + a);
		System.out.println("this keyword b " + b);
	}

	void show() {
		super.show();
		System.out.println("This is show() of MainClass class");
	}

	public static void main(String[] args) {//static method 
		ObjConstructor obj = new ObjConstructor();
		ObjConstructor obj1 = new ObjConstructor(6);
		ObjConstructor obj2 = new ObjConstructor(8, "Rohini");
		MainClass mc = new MainClass("rohini");
		 obj.show(10);
		 mc.value(5);
		 mc.HelloWorld();
		 mc.show();
		
		
		//pojo 
		PojoPractice pj = new PojoPractice();
		pj.setA(25);
		System.out.println(pj.getA());
		pj.setA(40);
		System.out.println(pj.getA());
		pj.setB(30);
		System.out.println(pj.getB());
		pj.setF_name("punati");
		System.out.println(pj.getF_name());
		
		//Big Integer 
		BigInteger bi = new BigInteger("45678");
		BigInteger bi1 = new BigInteger("456");

		System.out.println("bi === bi1 is '" + bi.equals(bi1) );
		System.out.println("'  bi + bi1 is " + bi.add(bi1));
		System.out.println("bi*bi1 is " + bi.multiply(bi1) );
		System.out.println("float value is  " + bi.floatValue());
		System.out.println(" bitCount is " + bi.bitCount());
		System.out.println("abs value is  " + bi.abs());
		
		//BigDecimal
		BigDecimal bd = new BigDecimal("45.7564657");
		BigDecimal bd1 = new BigDecimal("56.8833333");
		
		System.out.println(" Bigdecimal add " + bd.add(bd1));
		System.out.println("byteValue " + bd.byteValue());
		int q = Math.round(bd.intValue());
		BigDecimal bd2 = new BigDecimal(q);
		System.out.println(" byteValueExact " + bd2.byteValueExact());
		int q1 = Math.round(bd1.intValue());
		BigDecimal bd3 = new BigDecimal(q1);
		System.out.println(" divide q with q1 "+ bd2.divide(bd3, 2, RoundingMode.CEILING));
		
		//Type  casting
		double val = (int) 57.66;
		System.out.println("val " + val);

	}

	public static void HelloWorld() {
		System.out.println("This is static method ");

	}
}
