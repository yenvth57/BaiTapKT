//Giai phuong trinh ax + b =0;
public class Test {
	public static void main (String[] args)
	{
		int a = 5;
		int b = 10;
		if(a==0){
			if(b==0) System.out.println("PT vo so nghiem.");
			else System.out.println("PT vo nghiem.");
		}
		else
			System.out.printf("x= %d", -b/a );
	}
}
