package mypack;

class Gen_Fun
{
	<T> void funct(T name,T Id,T num,T add)
	{
		System.out.println("Details : \nEmployee Name : "+name+"\nEmployee Id : "+Id+"\nEmployee Number : "+num+"\nEmployee Address : "+add);
	}
}
class Emp2 extends Gen_Fun
{
	<T> void func(T name,T Id,T num,T add)
	{
		System.out.println("Details : \nEmployee Name : "+name+"\nEmployee Id : "+Id+"\nEmployee Number : "+num+"\nEmployee Address : "+add);
	}
}
public class Generics_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp2 g=new Emp2();
		g.funct("Vamsi", 364286, 348348361, "Old Gajuwaka,Vsk-26");
		System.out.println();
		g.func("Krishna", 34543, 597498593, "Ashok Nagar, Hyderbad");
	}

}
