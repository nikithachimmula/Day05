import java.util.Scanner;

public class PrimeFactors {
	
            void printFact(int Num)
            {
            	for(int i=1;i<=Num;)
            	{
            		if(Num%i==0)
            			{
            			System.out.println(i+" ");
            			Num=Num/i;
            			
            			}
            		else
            		{
            			i++;
            		}
            			
            	}
            }
	public static void main(String[] args) {
		int Num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		Num=sc.nextInt();
		PrimeFactors obj=new PrimeFactors();
		obj.printFact(Num);
	}

}
