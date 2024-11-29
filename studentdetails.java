class student
  {
    string name;
    int rollnumber;
    string course;

student(String n,Int r,String c)
    {
      this.name=n;
      this.rollnumber=r;
      this.course=c;
    }
  public void display()
    {
      System.out.println("Name is:" +this.name);
      System.out.println("Rollnumber is:" +this.rollnumber);
      System.out.println("Course is :" +this.course);
    }
  }
public class sampleclass
  {
    public static void main(String[] args)
    {
     student s1=new student("Mounika",80,"MCA");
      s1.display();
    }
  }
