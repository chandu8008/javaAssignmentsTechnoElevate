
public class VEHICLE {
int price;
String name;
void startengine () {
System.out.println("startengine");
}
void stopengine() {
	System.out.println("stopengine");
}
public static void main(String[] args) {
	VEHICLE v=new VEHICLE();
	v.startengine();
	v.stopengine();
	
}
}
