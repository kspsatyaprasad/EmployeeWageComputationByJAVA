public class EmployeeWageComputation
{
    // class constants
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;
    // instance constants
    final String COMPANY_NAME;
    final int WAGE_PER_HOUR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HOURS;
    // instance variable
    int total_earned_Wage;

    EmployeeWageComputation(String name_of_Company, int wage_per_Hour, int maximum_Working_Days, int maximum_Working_Hours)
    {
    WAGE_PER_HOUR = wage_per_Hour;
    MAX_WORKING_DAYS = maximum_Working_Days;
    MAX_WORKING_HOURS = maximum_Working_Hours;
    COMPANY_NAME = name_of_Company;
    total_earned_Wage = 0;
    }
    void employee_TotalwageComputation() {
    int workingHrs = 0;
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
        System.out.printf("For Day %d %s Employee Dailywage is %d for %d Hours worked and He worked %d Hours in a month until now\n", day, COMPANY_NAME, wage, workingHrs, total_hours_Worked + workingHrs);
        System.out.println("------------------------------------------------------------------------------------------");
    }
    
    }
    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour of "+COMPANY_NAME+ " Employee is " + WAGE_PER_HOUR);
        System.out.println("Maximum working days of "+COMPANY_NAME+ " Employee is "  + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours of "+COMPANY_NAME+ " Employee is "  + MAX_WORKING_HOURS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + total_earned_Wage + "\n";
    }

    public static void main(String args[])
    {
        EmployeeWageComputation TCS = new EmployeeWageComputation("TCS", 10, 25, 200);
        EmployeeWageComputation MPHASIS = new EmployeeWageComputation("MPHASIS", 5, 30, 100);
        EmployeeWageComputation TESLA = new EmployeeWageComputation("TESLA", 4, 25, 150);

        TCS.employee_TotalwageComputation();
        System.out.println(TCS);
        MPHASIS.employee_TotalwageComputation();
        System.out.println(MPHASIS);
        TESLA.employee_TotalwageComputation();
        System.out.println(TESLA);
        
    }
}