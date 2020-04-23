package _9_small_projects.QuizApp;

import _c_types_comparison._c_1_hashcode.HashTest;

import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Question {

    Set<Question> allQuestions = HashTest<>();

    public void question1(){
        System.out.println("What does “HTTP” stand for?");
        System.out.println();
        System.out.println("a.HyperText Transfer Protocol:);
                System.out.println("b. ksachbds");
        System.out.println("c. dsfgsth");
        System.out.println("d. fbmdxsdfb");

    }

    public void uestion2(){
        System.out.println("Which sentence is correct:");
        System.out.println("HashSet does not include duplicates");
        System.out.println("HashTest retrives data in a sequesnce of its addition");
        System.out.println("If in a Map you attempt to save 2 records under the same key, only the second will be saved(value overrriden)");
        System.out.println("If you try to get from the java.util.Map a value that is assigned to a key which does not exist, a NoSuchElementException will be thrown");

}

    public void uestion3(){
        System.out.println("What is an interface in Java:");
        System.out.println("Abstract class");
        System.out.println("HashTest retrives data in a sequesnce of its addition");
        System.out.println("If in a Map you attempt to save 2 records under the same key, only the second will be saved(value overrriden)");
        System.out.println("If you try to get from the java.util.Map a value that is assigned to a key which does not exist, a NoSuchElementException will be thrown");

    }

    public void uestion4(){
        System.out.println("Which of the below are correct List's implementation:");
        System.out.println("Segregated List");
        System.out.println("ArrayList");
        System.out.println("LinkedList");
        System.out.println("ComparableList");
        System.out.println("SimpleList");

    }

    public void uestion5(){
        System.out.println("Can one interface implement another interface:");
        System.out.println("Always");
        System.out.println("No");
        System.out.println("Yes, but interfaces have to be in the same package");
        System.out.println("yes, if interface has a protected access modifier");

    }
}
