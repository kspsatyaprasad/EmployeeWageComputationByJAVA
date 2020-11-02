public class EmployeeWageComputation_UC_2
{
    public static void main(String args[])
    {
        final int WAGE_PER_HOUR = 20;
        int type_of_Employee = (int) (Math.random() * 100) % 2;
        int hours_Worked = 0;
        if (type_of_Employee == 1)
        {
            System.out.println("Employee is Present");
            hours_Worked = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = hours_Worked * WAGE_PER_HOUR;
        System.out.println("Daily Wage of Employee is " + wage);
    }
}