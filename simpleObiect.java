class SimpleObject {
SimpleObject() {
System.out.println("No argument Constructor");
}
SimpleObject(int a) {
System.out.println("One argument Constructor");
}
}
public class Constructor {
public static void main(String arg[]) {
SimpleObject s1 = new SimpleObject();
SimpleObject s2 = new SimpleObject(100);
}
}
