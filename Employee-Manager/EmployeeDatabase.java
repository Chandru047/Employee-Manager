import java.util.HashMap;

public class   EmployeeDatabase
{
    private static final HashMap<Integer , Employee> map = new HashMap<>();

    static public HashMap<Integer, Employee> getMap()
    {
        return map;
    }


}
