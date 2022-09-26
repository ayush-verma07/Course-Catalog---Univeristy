public class Student {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private String name;
    private int id;
    private Course[] schedule = new Course[8];

    public Student(String n, int i)
    {
        name = n;
        id = i;
    }

    public String toString()
    {
        String result = "Name: ";
        result += name + ", ";
        result += "Student ID: ";
        result += id + ", ";
        return result;
    }

    public int addCourse(Course x)
    {
        int added = 0;
        for(int i = 0; i < schedule.length; i++)
        {
            if(schedule[i] == null)
            {
                schedule[i] = x;
                System.out.println(ANSI_GREEN + x.getName() + " has been added to your schedule." + ANSI_RESET);
                added = 0;
                break;
            }
            else if(schedule[i].equals(x))
            {
                added = 1;
                System.out.println(ANSI_RED + "You cannot add " + x.getName() + " because you already have it." + ANSI_RESET);
                break;
            }
            else if(schedule[i].getPeriod() == x.getPeriod())
            {
                added = 2;
                System.out.println(ANSI_RED + "You cannot add " + x.getName() + " due to a time conflict with " + schedule[i].getName() + " ." + ANSI_RESET);
                break;
            }

        }
        return added;
    }

    public void replace(Course b)
    {
        for(int i = 0; i < schedule.length; i++)
        {
            if(schedule[i].getPeriod() == b.getPeriod())
            {
                schedule[i] = b;
                System.out.println(ANSI_GREEN + b.getName() + " has been added to your schedule." + ANSI_RESET);
                break;
            }
        }
    }
}
