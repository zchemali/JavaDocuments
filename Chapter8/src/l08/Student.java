package l08;
/**
 * Demostrating Type 1 polymorphisim
 * @author zchem
 *
 */
public class Student {

	protected String name;
	public Student( String s) {
		this.name=s;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My name is"+ name+" and Iam a student";
	}
	

	/**@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	if(obj instanceof  Student)
		return this.name.equalsIgnoreCase(((Student) obj).name);
	else return false;
	}
**/
	public static void main(String[] args) {

		Student st1= new Student ("Ziad");
		Student st2= new Student ("zIad");
		System.out.println(st1.equals(st2));
		
	}

}
