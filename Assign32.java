import java.util.*;
public class Assign32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varia v = new Varia();
		v.var();
	}

}
class Varia
{
	
	boolean same=true;
	String s1 ;
	String s2 ;
	
	Scanner sc1;
	
	void var()
	{
		System.out.print("Enter the string 1 = ");
		sc1 = new Scanner(System.in);
		s1=sc1.nextLine();
		System.out.print("Enter the string 2 = ");
		s2=sc1.nextLine();
		
	if(s1.equals(s2)){
		System.out.println(same);
	}
	else
	{
		System.out.println("false");
	}
}
}