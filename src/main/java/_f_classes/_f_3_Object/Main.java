package _f_classes._f_3_Object;

public class Main {

    public static void main(String[] args) {
        ObjectsClass objectsClass1 = new ObjectsClass();
        ObjectsClass objectsClass2 = new ObjectsClass();
        Test test = new Test();
        System.out.println(test.compareObjects(objectsClass1,objectsClass2));
    }
}