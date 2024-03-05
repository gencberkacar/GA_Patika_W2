//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee berk = new Employee("Berk", "ACAR", 900, 45, 1985);
        berk.tax();            //vergi metodunu çağırıyoruz
        berk.bonus();          //ek mesai metodunu çağırıyoruz
        berk.raiseSalary();    //zam metodunu çağırıyoruz
        berk.printInfoEmp();   //herşeyi ekrana bastıran metodu çağırıyoruz
    }
}