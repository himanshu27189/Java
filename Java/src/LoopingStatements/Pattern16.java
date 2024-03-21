package LoopingStatements;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n*2-1;j++)
			{
				if(i*j==i+j)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("s ");
				}
			
		}
			System.out.println();
	}

}
}
