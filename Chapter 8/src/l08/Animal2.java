package l08;
/**
 * 
 * @author zchem
 *Example of interface polymorphisim
 */
public class Animal2 implements Speak{
private String name="dog";
	@Override
public String toString() {
	return "This Animal"+name+" makes the sound"+sound() ;
}

	public static void main(String[] args) {
Animal2 animal=new Animal2();
		System.out.println(animal.toString());
	}
/**
 */
	@Override
	public String sound() {
		if(name.equalsIgnoreCase("cat"))
		return "meow";
		else if (name.equalsIgnoreCase("Dog"))
				return "woof";
		return "Animal doesnt exist";
	}

}
