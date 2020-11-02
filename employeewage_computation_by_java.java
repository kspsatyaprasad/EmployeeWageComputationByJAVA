public class EmployeeWageComputation_UC_5
{
    public static void main(String args[])
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_DAYS = 20;
    
        int total_earned_Wage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int type_of_Employee = (int) (Math.random() * 100) % 3;
            int hours_Worked =0;
            switch (type_of_Employee)
            {
                case FULL_TIME:
                    hours_Worked = 8;
                    break;
                case PART_TIME:
                    hours_Worked = 4;
                    break;
                default:
            }
            int wage = hours_Worked * WAGE_PER_HOUR;
            System.out.println(" Wage earned in Day" + day + " is:" + wage);
            total_earned_Wage += wage;
        }
        System.out.println("Total wage earned in a month is " + total_earned_Wage);        
    }
}
