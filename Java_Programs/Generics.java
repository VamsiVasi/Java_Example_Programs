package mypack;

class container<t>
{
	t value;
	public t getValue() {
		return value;
	}
	public void setValue(t value) {
		this.value = value;
	}
	public void show()
	{
		System.out.println(value+" "+value.getClass().getName());
	}	
}
public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		container<Integer> obj=new container<>();
		obj.setValue(12);
		System.out.println(obj.getValue());
		obj.show();
	}

}
