package mypack;

class Test<T,U>
{
	T ob1;
	U ob2;
	Test(T ob1,U ob2)
	{
		this.ob1=ob1;
		this.ob2=ob2;
	}
	void show()
	{
		System.out.println("My name is "+ob1+" and my Salary is "+ob2);
	}
}
public class Generics_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test <String, Integer> t1=new Test<String,Integer>("Vasi",32846);
		Test <String, Double> t2=new Test<String,Double>("krish",24361.123);
		Test <String, Float> t3=new Test<String,Float>("sk",73528.13f);
		t1.show();
		t2.show();
		t3.show();
	}

}
