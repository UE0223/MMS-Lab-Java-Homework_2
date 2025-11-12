public class Java_2
{ //CH3_p26
    public static void main(String args[])
    {
        Car car1 = new Car();		
		car1.show();
		
    }
}

class Car
{
    private int num;
    private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
    public void show()
    {
        System.out.println("車號: " + this.num);
        System.out.println("汽油量: " + this.gas);
    }
	
    
}