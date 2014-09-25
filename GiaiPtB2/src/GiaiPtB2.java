
public class GiaiPtB2 {

	/**
	 * @param args
	 */
		public String Giai(int a, int b, int c){
			int D = b*b - 4*a*c;
			double x = (double)-c/b;
			String Nghiem = "";		
			if( a == 0 ){
				return Double.toString((double)Math.round(x*10)/10);
			}	
			if( a!= 0 && D > 0 ){
				double x1= ( -b + Math.sqrt(D) ) / (2*a);
				double x2= ( -b - Math.sqrt(D) ) / (2*a);
				Nghiem = (double)Math.round(x1*10)/10 + ";" + (double)Math.round(x2*10)/10;
				return Nghiem;
			}
			if(  a!= 0 && D < 0 ){
				return "err";
			}
			
			if( a!= 0 && D == 0 ){
				x = (double)-b/(2*a);
				Nghiem = Double.toString((double)Math.round(x*10)/10);
				return Nghiem;
			}
			return "11";
		}

}
