package arrays;

public class Student {

	String name;
	char gen;
	int age;
	String clg;
	int id;
	int yop;
	double percent;
	
	Student()
	{
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gen=" + gen + ", age=" + age + ", clg=" + clg + ", id=" + id + ", yop="
				+ yop + ", percent=" + percent + "]";
	}



	public Student(String name, char gen, int age, String clg, int id, int yop, double percent) {
		super();
		this.name = name;
		this.gen = gen;
		this.age = age;
		this.clg = clg;
		this.id = id;
		this.yop = yop;
		this.percent = percent;
	}
	
}
