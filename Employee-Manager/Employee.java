public class Employee
{
    private final int id ;
    private final String name ;
    private final double salary ;
    private final String department ;

    Employee(int id , String name , double salary , String department)
    {
        this.id = id ;
        this.name = name ;
        this.salary = salary ;
        this.department = department ;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getDepartment()
    {
        return department;
    }

    public String toString()
    {
        return  "ID = " +this.getId() +"\n"+ "Name = "+ this.getName() +"\n"+ "Department = "+this.getDepartment() ;
    }
}
