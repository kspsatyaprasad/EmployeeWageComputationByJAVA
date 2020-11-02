public class EmployeeWageComputation_UC_1
{
    public static void main(String args[])
    {
        
        int employee_Attendance = (int) (Math.random() * 100) % 2;
        if (employee_Attendance == 1)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }
    }
}