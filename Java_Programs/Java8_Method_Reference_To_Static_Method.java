package mypack;

interface PK1
{
	abstract void names(String tname,String pname);
}
interface FM1
{
	abstract void finisher(String f);
}
class TP1
{
	static void tp1_name(String trname,String pkname)
	{
		System.out.println("Trainee : '"+trname+"'"+"\nPokemon : "+pkname);
	}
	static void tp1_finisher(String fi_name)
	{
		System.out.println("* Finising Move is "+fi_name+" *");
	}
}
public class Java8_Method_Reference_To_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PK1 p=TP1::tp1_name;
		FM1 f=TP1::tp1_finisher;
		p.names("ASH", "Pikachu");
		f.finisher("Thunder Bolt");
	}

}
