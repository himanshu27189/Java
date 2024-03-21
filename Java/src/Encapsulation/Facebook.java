package Encapsulation;

public class Facebook {
	private long mobno;
	private String password;
	private String email;
	
	public void setmobno(long mobno)
	{
		this.mobno = mobno;
	}
	
	public long getmobno()
	{
		return mobno;
	}
	
	public void setpassword(String password)
	{
		this.password = password;
	}
	public String getpassword()
	{
		return password;
	}
	
	public void setemail(String email)
	{
		this.email = email;
	}
	public String getemail()
	{
		return email;
	}
}
