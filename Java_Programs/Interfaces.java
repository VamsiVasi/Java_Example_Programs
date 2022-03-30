package mypack;

interface pokemon
{
	abstract void t_name(String tname);
	abstract void p_name(String pname);
}
interface move
{
	abstract void finisher(String f);
}
class pk1 implements pokemon,move
{
	public void t_name(String tname)
	{
		System.out.println("Trainee : '"+tname+"'");
	}
	public void p_name(String pname)
	{
		System.out.println("Pokemon Name : '"+pname+"'");
	}
	public void finisher(String f)
	{
		System.out.println("* Finising Move is "+f+" *");
	}
}
class pk2 extends pk1
{
	
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pk1 p=new pk1();
		pk2 q=new pk2();
		p.t_name("ASH");
		p.p_name("Pikachu");
		p.finisher("Thunder Bolt");
		q.t_name("Brock");
		q.p_name("Onix");
		q.finisher("Stone Edge");
	}

}
