import java.util.*;

public class Course {
    private String name;
    private double hours;
    private String teacher;
    private String location;
    private int period;

    public Course(String n, double h, String t, String l, int p)
    {
        name = n;
        hours = h;
        teacher = t;
        location = l;
        period = p;
    }

    public Course(String n, double h)
    {
        name = n;
        hours = h;
    }

    public String getName()
    {
        return name;
    }

    public double getHours()
    {
        return hours;
    }

    public String getTeacher()
    {
        return teacher;
    }

    public String getLocation() {
        return location;
    }

    public int getPeriod() {
        return period;
    }

    public String toString()
    {
        String result = "Name: ";
        result += getName() + ", ";
        result += "Teacher: ";
        result += getTeacher() + ", ";
        result += "Hours: ";
        result += getHours() + ", ";
        result += "Location: ";
        result += getLocation() + ", ";
        result += "Period: ";
        result += getPeriod();

        return result;
    }

    public boolean equals(Course obj)
    {
        if(obj == null)
        return false;
        
        return obj.getName().equals(this.name);
    }
}

