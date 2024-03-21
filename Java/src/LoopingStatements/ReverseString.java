package LoopingStatements;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "NAYA";
		String d="";
		for(int i=s.length()-1;i>=0;i--)
		{
			d=d+s.charAt(i);
		}
		System.out.println(d);
	}

}
