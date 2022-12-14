package AssignmentPoly;

import java.util.Scanner;

public class Design{
int sum=0;

double double_series(double n){
	for(int i=1;i<=n;i++) {
		
		sum=sum+(1/i);
	}
	return sum;
}

void display1() {
	System.out.println(sum);
}

double double_series(double a,double n) {
	 for(int i=1;i<=n;i+=3) {
		 for(int a1=2;a1<=n+1;a1+=3) {
			 sum=sum+(i/a1);
		 }
}
return sum;
}
void display() {
	System.out.println(sum);
}

public void n(int i) {
	// TODO Auto-generated method stub
	
}
	
}
