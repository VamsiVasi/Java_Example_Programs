package mypack1;

interface PK
{
	abstract void names(String tname,String pname);
}
interface FM
{
	abstract void finisher(String f);
}
class TP
{
	void tp_name(String trname,String pkname)
	{
		System.out.println("Trainee : '"+trname+"'"+"\nPokemon : "+pkname);
	}
	void tp_finisher(String fi_name)
	{
		System.out.println("* Finising Move is "+fi_name+" *");
	}
}
public class Java8_Method_Reference_To_Instance_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP t=new TP(); 
		PK p=t::tp_name;
		FM f=t::tp_finisher;
		p.names("ASH", "Pikachu");
		f.finisher("Thunder Bolt");
	}

}
