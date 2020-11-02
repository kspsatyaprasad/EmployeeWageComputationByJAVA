public class EmployeeWageComputation_UC_7
{
    public static void employee_TotalwageComputation()
    {
    final int PART_TIME = 1;
    final int FULL_TIME = 2;
    final int WAGE_PER_HOUR = 20;
    final int MAX_WORKING_DAYS = 20;
    final int MAX_WORKING_HOURS = 100;

    int total_earned_Wage = 0;
    int workingHrs = 0;
    System.out.printf("WAGE BREAKDOWN OF AN EMPLOYEE IS GIVEN BELOW \n");
    System.out.println("------------------------------------------------------------------------------------------");
    
    for (int day = 1, total_hours_Worked = 0; day <= MAX_WORKING_DAYS
            && total_hours_Worked < MAX_WORKING_HOURS; day++ )
    {

        int type_of_Employee = (int) (Math.random() * 100) % 3;
        switch (type_of_Employee)
        {
        case FULL_TIME:
            workingHrs = 8;
            break;
        case PART_TIME:
            workingHrs = 4;
            break;
        default:
            workingHrs = 0;
            break;
        }
        int wage = workingHrs * WAGE_PER_HOUR;
        total_earned_Wage += wage;
        total_hours_Worked += workingHrs;
        System.out.printf("For Day %d Dailywage is %d for %d Hours worked and He worked %d Hours in a month until now\n", day, wage, workingHrs, total_hours_Worked + workingHrs);
        System.out.println("------------------------------------------------------------------------------------------");

    }
    System.out.println("Total wage of the employee for the work he done in a month is " + total_earned_Wage);
    }

    public static void main(String args[])
    {
        employee_TotalwageComputation();
    }
}