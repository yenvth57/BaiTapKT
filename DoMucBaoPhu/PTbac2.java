
public class PTbac2 {
	private double a;
	private double b;
	private double c;
	private Double x1; //Nghiem x1
	private Double x2; //Nghiem x2 > x1
	private int n; //So nghiem cua pt
	
	public PTbac2(double x, double y, double z){
		a = x;
		b = y;
		c = z;
		giaiPTbac2();
	}
	
	public void giaiPTbac2(){
		if(a==0){
			if(b==0)
				if(c==0) n = 3;
				else n = 0;
			else{
				n = 1;
				if(c==0) x1 = new Double(0);
				else x1 = new Double(-c/b);
			}
		}
		else
		{
			double delta = b*b - 4*a*c;
			if(delta<0) n = 0;
			else{
				if(delta==0){
					n = 1;
					x1 = new Double(-b/(2*a));
					x2 = x1;
				}
				else{
					n = 2;
					x1 = new Double((-b - Math.sqrt(delta))/(2*a));
					x2 = new Double((-b + Math.sqrt(delta))/(2*a));
				}
			}
		}
	}
	
	public int getN(){
		return n;
	}
	
	public Double getX1(){
		return x1;
	}
	
	public Double getX2(){
		return x2;
	}
}
