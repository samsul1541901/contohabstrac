package Latihan;
//Author Edvina Mustika

abstract class shape{
	public abstract String getArea();
	public abstract String getName();
}
class Circle extends shape{
	private String area = "Lingkaran";
	private String name = "Shape : Lingkaaran";
	@Override
	public String getArea() {
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
class Square extends shape{
	private String area = "Lingkaran";
	private String name = "Shape : Lingkaaran";
	
	@Override
	public String getArea() {
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}

public class ContohAbstract {
	public static void main(String [] args){
		Circle c = new Circle();
		Square s = new Square();	
			System.out.println(">> Contoh Abstak");
			System.out.println("--- Circle ---");
			System.out.println("Area :"+c.getArea());
			System.out.println("Nama :"+c.getName());
			System.out.println("-----------------");
			System.out.println("--- Square ---");
			System.out.println("Area :"+s.getArea());
			System.out.println("Nama :"+s.getName());
			
	}
}
