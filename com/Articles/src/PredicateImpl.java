import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateImpl{


public static void main(String [] args){
    List<Person> persons = Arrays.asList(new Person(1), new Person(18), new Person(2));
    // Before java 11
    // Get the Adult Persons
    List<Person> output = persons.stream().filter(Person::isAdult)
    .collect(Collectors.toList());
    System.out.println(output.toString());

    // Get the Non Adult persons
    List<Person> output1 = persons.stream().filter(person -> !person.isAdult())
    .collect(Collectors.toList());
    System.out.println("Non Adults: "+output1.toString());

    // Using java 11
   List<Person> output2 = persons.stream()
    .filter(Predicate.not(Person::isAdult))
    .collect(Collectors.toList());
    System.out.println("Using Java 11: "+output2);

    //List<Person> output3 = persons.stream()
    //.filter(not(Person::isAdult))
    //.collect(Collectors.toList());
    //System.out.println("Using Java 11 using not: "+output3);





}

}