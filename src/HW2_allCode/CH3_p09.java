public class Java_2
{ //CH3_p9
    public static void main(String args[])
    {
        Car car1 = new Car();
		
        car1.num = 1234;
        car1.gas = 20.5;
		
		Car car2 = new Car();
		
		car2.num = 2345;
        car2.gas = 30.5;
		
        car1.show();
		car2.show();
    }
}

class Car
{
    int num;
    double gas;
	
	void show()
    {
        System.out.println("車號: " + this.num);
        System.out.println("汽油量: " + this.gas);
    }
}