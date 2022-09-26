import java.util.Scanner;

class CourseCatalog {
    private Course[] courses;
    private int counter;

    public CourseCatalog()
    {
        courses = new Course[100];
        counter = 0;
        Course obj = new Course("Pre-Calculus Adv.", 0.0, "Krista Wagner", "W220", 1);
        courses[0] = obj;
        obj = new Course("Principles of Engineering", 3.0, "Mr. Nunez", "XF221", 2);
        courses[1] = obj;
        obj = new Course("AP Seminar", 3.0, "Ms. Wolnik", "C107", 3);
        courses[2] = obj;
        obj = new Course("Chemistry Adv.", 0.0, "Mr. Aldridge", "E205", 4);
        courses[3] = obj;
        obj = new Course("English II Adv.", 0.0, "Ms. Grisham", "D104", 5);
        courses[4] = obj;
        obj = new Course("AP Computer Science A", 3.0, "Mr. Best", "D103", 6);
        courses[5] = obj;
        obj = new Course("3D Modeling & Animation", 0.0, "Mrs. Wujek", "A124", 7);
        courses[6] = obj;
        obj = new Course("AP World History", 3.0, "Ms. Brown", "W105", 8);
        courses[7] = obj;
        counter = 8;
    }

    public Course[] getCourses()
    {
        return courses;
    }

    public Course getCourse(int i)
    {
        return courses[i];
    }

    public void add(Course yourCourse)
    {
        courses[counter] = yourCourse;
        counter++;
    }

}