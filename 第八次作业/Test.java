package eighth;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test
{
    public static void main(String[] args)
    {
        Set<Student> stuSet = saveStudentInfo();
        Iterator<Student> it = stuSet.iterator();
        while (it.hasNext())
        {
            String info = it.next().toString();
            System.out.println(info);
        }
    }
    private static Set<Student> saveStudentInfo()
    {
        Scanner input = new Scanner(System.in);
        Set<Student> stuSet = new TreeSet<Student>();
        while (true)
        {
            System.out.println("please input student's infomation:(number#name#age)");
            String inputData = input.nextLine();
            if ("exit".equals(inputData))
            {
                break;
            }
            String[] info = inputData.split("#");
            Student stu = new Student();
            stuSet.add(stu);
        }
        return stuSet;
    }
}

