package t1;
import java.io.*;
import java.util.*;


public class pandl
{
	


			int simpleintreast(int a,int b,int c) 
			{
			return((a*b*c)/100);	
			}
			double compoundintreast(int p,int r,int t)
			{
				double c=p*Math.pow((1+r),t);
				return c;
			}		

			public static void main(String args[]) 
			{
				int t,p,r;
				System.out.println("enter principle amount,time period and rate of intreast to calculate simple intreast");
				Scanner s=new Scanner(System.in);
				pandl t1=new pandl();
				p=s.nextInt();
				t=s.nextInt();
				r=s.nextInt();
				
				double result=t1.simpleintreast(p,t,r);
				System.out.println("simple intreast is "+ result);
			
				result=t1.compoundintreast(p, t, r);
				System.out.println("compound intreast is "+result);
				
				
				
			}
		}




