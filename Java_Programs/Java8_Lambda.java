package mypack;

interface pk {
	abstract void names(String tname, String pname);
}

interface mv {
	abstract void attack(String a);
}

public class Java8_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pk p;
		p = (tname, pname) -> {
			System.out.println("Trainee : '" + tname + "'" + "\nPokemon Name : '" + pname + "'");
		};
		mv m;
		m = a -> System.out.println("* Finising Move is " + a + " *\n");
		p.names("ASH", "Pikachu");
		m.attack("Thunder Bolt");
		p.names("Brock", "Onix");
		m.attack("Stone Edge");
	}

}
