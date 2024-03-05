//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Tuba Üstün", "90555888888", "MAT");
        Teacher t2 = new Teacher("Mert Bayer", "9055599999", "FZK");
        Teacher t3 = new Teacher("Burak Gürses", "9055777777", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali Emre", 4, "456458", mat, fizik, kimya);
        s1.addBulkExamNote(70,60,50);
        s1.isPass();

        Student s2 = new Student("Erdi Atanç", 4, "5468678", mat, fizik, kimya);
        s2.addBulkExamNote(100,90,80);
        s2.isPass();

        Student s3 = new Student("Batuhan Özkan", 4, "8765488", mat, fizik, kimya);
        s3.addBulkExamNote(30,20,10);
        s3.isPass();

    }
}