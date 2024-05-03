class parent 
{
	String str ="HII FROM PARENT CLASS ";
	void m1()
	{
		System.out.println("HELLO FROM PARENT m1()");
	}
	static void m3()
	{
		System.out.println("HELLO FROM m3() STATIC PARENT");
	}
}

class child extends parent
{
	String str="HI FROM CHILD CLASS";
	void m2()
	{
		System.out.println("HELLO FROM CHILD CLASS m2()");
	}
	static void m4()
	{
		System.out.println("HELLO FROM m4() STATIC CHILD");
	}
}

class InherDriver1
{
	public static void main(String[] args) {
		child obj=new child();
		obj.m2();
		System.out.println(obj.str); 
		obj.m1(); 
		child.m3();
		child.m4(); 
	}
}
