public class Person {
    private static int lastId;

    private int id;
    private String name;
    protected int id2;

    public Person(String name){
        this.id = lastId++;
        this.name = name;
    }

    @Override
    public String toString(){
        return "id: " + this.id + "\nname: " +this.name+ "\n";
    }

    public static void main(String[] args){
        Person p1 = new Person("Jessica");
        Person p2 = new Person("Alex");
        Person p3 = new Person("Marc");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
