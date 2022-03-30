package mypack;
import java.util.*;

abstract class powerrangers
{
	public void name(String Name)
	{
		System.out.println("Power Rangers '"+Name+"'");
	}
	abstract void theme_music(String music);
	abstract void zord(String z);
}
class P1 extends powerrangers
{
	void theme_music(String music)
	{
		System.out.println("Theme Music : "+music);
	}
	void zord(String z)
	{
		System.out.println("Zord : "+z);
	}
}
class P2 extends powerrangers
{
	void theme_music(String music)
	{
		System.out.println("Theme Music : "+music);
	}
	void zord(String z)
	{
		System.out.println("Zord : "+z);
	}
}
public class Abstract_Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerrangers p=new P1();
		powerrangers q=new P2();
		p.name("SPD");
		p.theme_music("SPD Emergency");
		p.zord("SPD B Squad Megazord");
		q.name("Dino Thunder");
		q.theme_music("Power Rangers' roar! · There's a light in the distance.....");
		q.zord("Thundersaurus Megazord");
	}

}
