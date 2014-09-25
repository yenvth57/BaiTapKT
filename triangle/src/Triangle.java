
public class Triangle {

	public int check(int a,int b,int c){

		if(a+b<c||b+c<a||c+a<b) return 0;  //không là tam giác
		if(a<0||b<0||c<0) return -1; //input lỗi
		else {
			if(a==b){
				if(b==c) return 3; //đều
				else return 2; //cân
			}
			else{
				if(b==c) return 2; //cân
				else return 1; //thường
			}
		}

	}

}
