package LoopingStatements;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n||i==j||j==1)
				{
					
				
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				}
				System.out.println();
		}
	}

}
