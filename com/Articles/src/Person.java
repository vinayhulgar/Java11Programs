

public class Person{

private static final int ADULT_AGE = 18;


private int age;

public Person(int age){
    this.age = age;
}

public boolean isAdult(){
    return age >= ADULT_AGE;
}

public String toString(){
    return "Age: "+age;
}

}