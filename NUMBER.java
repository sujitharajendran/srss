package guvi;

import java.util.Scanner;

public class NUMBER {

	public static void main(String[] args) {
		 int s,R=0,t;
	        Scanner d=new Scanner(System.in);
 System.out.println("enter the number");
int k=d.nextInt();
while(k>0)
{
    t=k%10;
    R=R*10+t;
    k=k/10;
}
System.out.println(R);


	}

}
