
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> Lista = new ArrayList<>();

Lista.add(new Student("Gianni",12));
Lista.add(new Student("Mario",9));
Lista.add(new Student("Iano",14));
Lista.add(new Student("Belen",8));

System.out.println(Lista);

    }
}