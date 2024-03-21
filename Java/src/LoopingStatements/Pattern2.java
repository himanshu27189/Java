package LoopingStatements;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if (i == 1 || j == 1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();	
		}
	}

}
