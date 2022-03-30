package mypack2;

interface PK
{
	TP names(String tname,String pname);
}
interface FM
{
	TP finisher(String f);
}
class TP
{
	TP(String trname,String pkname)
	{
		System.out.println("Trainee : '"+trname+"'"+"\nPokemon : "+pkname);
	}
	TP(String fi_name)
	{
		System.out.println("* Finising Move is "+fi_name+" *\n");
	}
}
public class Java8_Method_Reference_To_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PK p=TP::new; 
		FM f=TP::new;
		p.names("ASH", "Pikachu");
		f.finisher("Thunder Bolt");
		p.names("Brock", "Onix");
		f.finisher("Stone Edge");
	}

}
