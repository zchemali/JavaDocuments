package l08;
/**
 * Abstract class to demonstrate type polymorphism
 * @author zchem
 *
 */
abstract class Animal {
	protected String name,sound; //cow,pig,cat
	public Animal (String name,String sound)
	{
		this.sound =sound;
		this.name =name;
	}
	abstract String speak();

}
