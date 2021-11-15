package Typecasting;

public class MainMethod {
public static void main(String[] args) {
ParentClass class1 = new ChildClass();
//upcasting
class1.parentmethod();
System.out.println(class1.num);


ChildClass class2 = (ChildClass) class1;
System.out.println(class2.num);
System.out.println(class2.f);
class2.childmethod();
class2.parentmethod();
//downcasting
}
}
