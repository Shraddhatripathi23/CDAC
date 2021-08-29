class Name {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I am from edac batch2021");
  }
}

// inherit from Name
class Surname extends Name {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}
public class Inheritence1 {
	 public static void main(String[] args) {

		    // create an object of the subclass
		    Surname labrador = new Surname();

		    // access field of superclass
		    labrador.name = "My name is Shraddha Tripathi";
		    labrador.display();

		    // call method of superclass
		    // using object of subclass
		    labrador.eat();

		  }

}
