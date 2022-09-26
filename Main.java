import java.io.Console;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    public static void main(String[] args)
    {
        CourseCatalog y = new CourseCatalog();
        System.out.println(ANSI_CYAN + "This is your Course Catalog for the school year of 2022-23!" + ANSI_RESET);
        for(int a = 0; a < y.getCourses().length; a++)
        {
            if(y.getCourse(a) == null)
                break;
            System.out.println(y.getCourse(a));
        }
        System.out.println();
        y.add(new Course("AP Physics", 3.0, "Ms. Random","E206", 5));
        Student ayush = new Student("Ayush Verma", 010101);
        add(ayush, y.getCourse(1));
        add(ayush, y.getCourse(4));
        add(ayush, y.getCourse(8));
    }

    private static void add(Student a, Course b)
    {
        Scanner console = new Scanner(System.in);
        int added = a.addCourse(b);
        switch(added)
        {
            case 2: {
                System.out.print(ANSI_YELLOW + "Would you like to replace " + b.getName() + "? (1 - Yes, 2 - No)" + ANSI_RESET);
                int ans = console.nextInt();
                if(ans == 1)
                {
                    a.replace(b);
                }
                break;
            }
            case 1:
            case 0:
        }
    }
    
   
}