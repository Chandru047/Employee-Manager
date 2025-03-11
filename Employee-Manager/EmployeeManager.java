import java.util.*;

public class EmployeeManager
{
    static Scanner in = new Scanner(System.in);
    public void start()
    {
        System.out.println("------------------------------");
        System.out.println("Welcome to the Employee Payroll System");
        loop : while (true)
        {
            System.out.println("Available options are listed below");
            System.out.println("1.Add  2.Remove  3.Search  4.Sort  5.Exit");
            int choice = Integer.parseInt(in.nextLine());

            switch (choice)
            {
                case 1:
                    add();
                    break;
                case 2 :
                    remove();
                    break;
                case 3 :
                    search();
                    break;
                case 4 :
                    sort();
                    break;
                case 5 :
                    break loop ;
                default:
                    System.out.println("Enter a valid option ");

            }
        }
    }

    private void add()
    {
        System.out.println("Enter the id of the new Employee");
        int id = Integer.parseInt(in.nextLine());


        System.out.println("Enter the name of the new Employee");
        String name = in.nextLine();

        System.out.println("Enter the Department of the Employee");
        String department = in.nextLine();

        System.out.println("Enter the salary of the Employee");
        double salary = Double.parseDouble(in.nextLine());

        EmployeeDatabase.getMap().put(id,new Employee(id,name,salary,department));
        System.out.println("Employee Added Successfully");
    }

    public void remove()
    {
        System.out.println("Enter the id of the Employee to remove : ");
        int id = Integer.parseInt(in.nextLine());
        boolean found = false ;
        for(Integer temp : EmployeeDatabase.getMap().keySet())
        {
            if(EmployeeDatabase.getMap().get(temp).getId() == id)
            {
                found = true ;
                EmployeeDatabase.getMap().remove(temp);
                System.out.println("Employee removed Successfully");
            }
        }
        if(!found)
        {
            System.out.println("No Employee found with the mentioned Id .");
        }
    }

    public void search()
    {
        System.out.println("Enter the id of the Employee to Search : ");
        int id = Integer.parseInt(in.nextLine());
        boolean found = false ;
        for(Integer temp : EmployeeDatabase.getMap().keySet())
        {
            if(EmployeeDatabase.getMap().get(temp).getId() == id)
            {
                found = true ;
                Employee emp = EmployeeDatabase.getMap().get(temp);
                System.out.println(emp);
                String formattedSalary = String.format("%,.2f", EmployeeDatabase.getMap().get(temp).getSalary());
                System.out.println("Salary = " + formattedSalary);
            }
        }
        if(!found)
        {
            System.out.println("No Employee found with the mentioned Id .");
        }

    }

    public void sort()
    {
        ArrayList<Employee> arr = new ArrayList<>();
        for(Integer temp : EmployeeDatabase.getMap().keySet())
        {
            arr.add(EmployeeDatabase.getMap().get(temp));
        }
        System.out.println("1. Order by Name  2. Order by salary");
        int choice = Integer.parseInt(in.nextLine());
        if(choice == 1)
        {
            Comparator<Employee> nameSort = (o1, o2) -> o1.getName().compareTo(o2.getName());
            Collections.sort(arr,nameSort);
        }
        else if (choice == 2)
        {
            Comparator<Employee> salarySort = (o1, o2) -> Double.compare(o2.getSalary() ,o1.getSalary());
            Collections.sort(arr,salarySort);
        }
        else
        {
            System.out.println("Invalid option");
        }
        for(Employee temp : arr)
        {
            System.out.println("----------------------------------------");
            System.out.println(temp);
            String formattedSalary = String.format("%,.2f", temp.getSalary());
            System.out.println("Salary = " + formattedSalary);

            System.out.println("----------------------------------------");
        }
    }
}
