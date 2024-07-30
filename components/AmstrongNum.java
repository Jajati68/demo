
public class AmstrongNum {
	public static void main(String[] args) {
		int num=153,rem,sum=0;
		int count=0;
		int orgNum=num;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		int am=orgNum;
		while(orgNum>0)
		{
			rem=orgNum%10;
			sum=(int) (sum+Math.pow(rem, count));
			orgNum=orgNum/10;
		}
		if(am==sum)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
		
	}
}
