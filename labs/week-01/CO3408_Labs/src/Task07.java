public class Task07 {

    public static void main(String[] args) {
        printAverageMark("Simeon", 60,70,80);
    }

    static void printAverageMark(String name, int mark1, int mark2, int mark3) {
        double average = (mark1 + mark2 + mark3) / 3.0;

        System.out.println("Student: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Average: "+ average);
    }
}
