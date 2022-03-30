package mypack;
import java.util.*;

class student
{
	private int Id,Roll;
	private String Sname,Course,Address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,r;
		String c,a;
		System.out.println("Enter Your Id : ");
		i=sc.nextInt();
		System.out.println("Enter Your Roll Number : ");
		r=sc.nextInt();
		System.out.println("Enter Your Course : ");
		c=sc.next();
		System.out.println("Enter Your Address : ");
		a=sc.next();
		student s=new student();
		s.setId(i);
		s.setRoll(r);
		s.setCourse(c);
		s.setAddress(a);
		System.out.println("Your Details :\nId : "+s.getId()+"\nRoll Number : "+s.getRoll()+"\nCourse : "+s.getCourse()+"\nAddress : "+s.getAddress());
	}

}
