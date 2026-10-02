
public class Task04 {

    public static void main(String[] args) {
        int mark = 65;

        if (mark >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        int[] zahlen = {0, 39, 40, 41, 65, 100};
        for (int m : zahlen) {
            String biggerEq = (m >= 40) ? "Pass" : "Fail";
            String bigger    = (m >  40) ? "Pass" : "Fail";
            System.out.println(m +" "+ biggerEq +" "+ bigger);
        }
    }
}
