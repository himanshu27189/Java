package LoopingStatements;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=1;i<=n;i++) 
		{
			for(j=1;j<=n*2-1;j++)
			{
				if(i+j>=n+1 && j-1<=n-1)
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
