class employee
{
	private String name;
	private int id;
	private int age;
	private double salary;
	private String department;
	//constructor
	employee(String n,int i,int a,double s,String d)
	{
		name=n;
		id=i;
		age=a;
		salary=s;
		department=d;
	}
	void disp()
	{
		System.out.println("employee name="+name);
		System.out.println("employee id="+id);
		System.out.println("employee age="+age);
		System.out.println("employee salary="+salary);
		System.out.println("employee department="+department);
	}
}
class Oop
{
	public static void main(String arg[])
	{
		employee e = new employee("Muna",101,25,78000.50,"IT");
		e.disp();
	}
}
