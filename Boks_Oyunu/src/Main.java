//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Mehmet" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Vasat" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}