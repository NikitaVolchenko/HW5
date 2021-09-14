public class Human implements IComparable {

    String name;
    int age;

    Human() {

    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean compare(Human human) {
        return name.equals(human.name) && age == human.age && human instanceof Human;
    }

    @Override
    public boolean compare(Animal animal) {
        return false;
    }
}
