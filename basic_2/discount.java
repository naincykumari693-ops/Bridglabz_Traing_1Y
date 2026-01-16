 class discount
{
	public static void main(String[]args)
	{
	
	int studentfee= 125000;
	int	discountpercent= 10;
	int discount= (studentfee*discountpercent/(100));
	int final_fee= studentfee-discount;
	System.out.println("discount is:"+discount);
	System.out.println("the final fee is:"+final_fee);
	}
}