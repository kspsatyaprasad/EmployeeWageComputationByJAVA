public class EmployeeWageComputation_UC_8
{
  public static void employee_TotalwageComputation(String name_of_Company, int wage_per_Hour, int maximum_Working_Days, int maximum_Working_Hours)
  {
  final int PART_TIME = 1;
  final int FULL_TIME = 2;
  int WAGE_PER_HOUR = wage_per_Hour;
  int MAX_WORKING_DAYS = maximum_Working_Days;
  int MAX_WORKING_HOURS = maximum_Working_Hours;
  String COMPANY_NAME = name_of_Company;
  int total_earned_Wage = 0;
  int workingHrs = 0;
  System.out.println("*******************************************************************************************");
  System.out.println("Employee of " + COMPANY_NAME );
  System.out.println("*******************************************************************************************");
  System.out.println("Wage per hour of employee :" +WAGE_PER_HOUR );
  System.out.println("Maximum working days of employee:" + MAX_WORKING_DAYS);
  System.out.println("Maximum working hours of employee:" + MAX_WORKING_HOURS);
  System.out.printf("WAGE BREAKDOWN OF AN EMPLOYEE IS GIVEN BELOW : \n");
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
      employee_TotalwageComputation("FLIPKART", 20, 20, 100);
      employee_TotalwageComputation("MINDTREE", 25, 20, 200);
      employee_TotalwageComputation("HEXAWARE", 30, 20, 300);

  }
}