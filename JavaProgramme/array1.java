class array1
{
	public static void main(String arg[])
	{
		int arr[]={5,3,6,2,4,1};
		int s=0;
		int index;
		for(index=0;index<arr.length;index++)
		{
			s=s+arr[index];
		}
		System.out.println("sum of element="+s);
	}
}