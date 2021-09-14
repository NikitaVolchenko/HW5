public class Animal implements IComparable {

    String name;
    int age;

    Animal() {

    }

    Animal(String name, int age) {
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
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean compare(Human human) {
        return false;
    }

    @Override
    public boolean compare(Animal animal) {
        return name.equals(animal.name) && age == animal.age && animal instanceof Animal;
    }
}
