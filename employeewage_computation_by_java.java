public class EmployeeWageComputation_UC_4
{
    public static void main(String args[])
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        int type_of_Employee = (int) (Math.random() * 100) % 3;
        int hours_Worked =0;
        switch (type_of_Employee)
        {
            case FULL_TIME:
                System.out.println("Employee is Present and he worked  Full time");
                hours_Worked = 8;
                break;
            case PART_TIME:
                System.out.println("Employee is Present and he worked Part time");
                hours_Worked = 4;
                break;
            default:
                System.out.println("Employee is Absent");    
        }
        int wage = hours_Worked * WAGE_PER_HOUR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}