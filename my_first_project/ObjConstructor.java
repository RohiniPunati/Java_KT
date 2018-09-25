package my_first_project;

public class ObjConstructor {
	static int a=50;//static variable 
	
	//static block
	static{
		System.out.println("static block in obj constructor ");
	}
	
	//constructor overloading start
	 ObjConstructor() {
		System.out.println("null constructor ");
	}
	ObjConstructor(int a){

		System.out.println("1parameter constructor "+a);
	}
	ObjConstructor(int a,String name){
		System.out.println("2parameterised constructor "+a+" name "+name);
	}
	//constructor overloading end
	
	
	//method overloading start
	void show(){
		System.out.println("This is show() of ObjConstructor class");
	}
	void show(int a){
		
		System.out.println("k= "+a);
	}
	//method overriding end
}
