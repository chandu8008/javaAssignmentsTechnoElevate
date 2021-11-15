package VehicleEngine;

public class Vehical {
String colour;
String name;
public Vehical(String colour,String name) {
	super();
	this.colour=colour;
	this.name=name;
}
public void status() {
	// TODO Auto-generated method stub
	System.out.println(this.colour+" "+this.name);
	System.out.println("vehicle is ready");


}
}
