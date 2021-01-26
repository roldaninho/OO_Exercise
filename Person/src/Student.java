import java.util.Date;

public class Student extends Person {
    private Date data;
    private int num;

    public Student(String name, Date dataN){
        super(name);
        this.data = dataN;
    }

    public Student(String name, Date dataN, int num){
        this(name, dataN);
        this.num = num;

    }

    @Override
    public String toString(){
        return super.toString() + "data: " + this.data;
    }

    public static void main(String[] args){
        System.out.println(new Student("Jordi", new Date()));
    }
}
