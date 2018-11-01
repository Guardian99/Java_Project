
public class Data {
	private String name;
	private int score;
	
	public void setdata(String n, int s)
	{
		name=n;
		score=s;
	}
	
	public void setname(String n)
	{
		name=n;
	}
	
	public void setscore(int s)
	{
		score=s;
	}
	
	public int getscore()
	{
		return score;
	}
	
	public String getname()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return name+" "+score;
	}

}
