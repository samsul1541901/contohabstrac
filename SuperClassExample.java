package Latihan;

class Employee {
	public String name;
	public String address;
	public int salary;

	public Employee(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

class Staff extends Employee{

	public Staff(String name, String address, int salary) {
		super(name, address, salary);
		// TODO Auto-generated constructor stub
	}
}
class Manager extends Employee{
	int bonus;
	public Manager(String name, String address, int salary) {
		super(name, address, salary);
		// TODO Auto-generated constructor stub
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}

public class SuperClassExample {
	public static void main(String[] args) {
		Manager m = new Manager("Joko", "Bandung", 10000000);
		m.setBonus(2000);
		Employee[] empl = new Employee[3];
		empl[0] = m;
		empl[1] = new Staff("Ahmad", "Bandung", 1200000);
		empl[2] = new Staff("Isabelle", "Surabaya", 2200000);
		
		System.out.println(empl[0].getName()+"   "+empl[0].getSalary());
		System.out.println(empl[1].getName()+"   "+empl[1].getSalary());
		System.out.println(empl[2].getName()+"   "+empl[2].getSalary());

	}
}

