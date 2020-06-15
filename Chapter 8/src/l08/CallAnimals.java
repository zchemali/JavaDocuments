package l08;

public class CallAnimals {

private static Animal[] animal;
	public static void main(String[] args) {
animal=new Animal[2] ;
animal[0]= new Animal ("dog", "woof"){
	
	@Override
	String speak() {
		// TODO Auto-generated method stub
		return sound;
	}
	
};

animal [1]=new Animal("cat","meow") {
	
	@Override
	String speak() {
		return sound;
	}
};
System.out.println(animal[0].speak());
	}

}
