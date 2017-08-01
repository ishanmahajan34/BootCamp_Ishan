/**
 * Created by mahajani on 7/25/2017.
 */
public class Person implements Comparable<Person>{
    int uid;
    String name;
    int age;

    public Person(int uid, String name, int age) {

        this.uid = uid;
        this.name = name;
        this.age = age;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (uid != person.uid) return false;
        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        Person p1 = new Person(100, "ISHAN" , 61) ;
        Person p2 = new Person(100, "ISHAN" , 31) ;
        if(p1.equals(p2)) {
            System.out.println("EQUAL");
        } else if(p1.compareTo(p2)>0) {
            System.out.println("ISHAN");
        }
        else {
            System.out.println("ARYAN");
        }
    }

    @Override
    public int compareTo(Person person) {
        if(this.uid == person.uid) {
            return 0;
        }
        else if(this.uid > person.uid) {
            return 1;
        }
        return -1;
    }
}
