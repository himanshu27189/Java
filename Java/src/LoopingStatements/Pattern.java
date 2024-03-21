package LoopingStatements;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i%2==0) 
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(i+j+" ");
				}
	
			}
		System.out.println();
	}

}
}
