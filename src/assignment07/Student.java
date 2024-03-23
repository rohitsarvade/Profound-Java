package assignment07;

public class Student {
	
	public String name;
	private int id;
	protected String branch;
	String section;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public String getSection()
	{
		return section;
	}
	public void setSection(String section)
	{
		this.section=section;
	}


}
