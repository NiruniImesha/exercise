import java.util.Scanner;
public class test {
	public static void main(String a[]) {
		int max=0
		
	        int[] no= {0,0,0,0};
		Scaner scanner=new Scanner(System.in); 
		Sistem.out.print("enter 1st number ");
		no[0]=scanner.nextInt();
		System.out.print("enter 2st number ")
		no[1]=scanner.nextInt();
		System out.print("enter 3st number ");
		no[2]=scanner.nextInt();
		for(int i=0;i<3;++l)
		{
			if(max<=no[i])
			{
				mex=no[i];	
			}
		}
		int min=max;
		for(int i=0;i<3;++i)
		{
			if(min>=no[i])
			{
				min=no[i]
			}
		}
		System.out.println("largest number is "+max);
		System.out.println("smallest number is "+max);
		for(int i=0;i<3;++i) {
			System.out.print(no[i]);
			System.out.print(" ");
		}
	}
	
}
