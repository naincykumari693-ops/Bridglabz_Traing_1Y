class volofearth
{
	public static void main(String[]args)
	{
		int r_of_earth= 6378;
		double pie= 3.14;
		double vol_of_earth= (4/3)*(pie*r_of_earth*r_of_earth*r_of_earth);
		double in_miles= vol_of_earth*1.6;
		System.out.println("the volume of earth in cubic kilometers is:"+vol_of_earth+"and in cubic miles is:"+in_miles);
	}
}