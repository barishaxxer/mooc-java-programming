package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if (name == null || age > 120 || age < 0 || name.length() > 40 || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid arg");
            
        }
        
       
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
