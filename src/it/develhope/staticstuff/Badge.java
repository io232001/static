package it.develhope.staticstuff;

import java.util.Random;

public class Badge
{
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode()
    {
        String code1="";
        String code2="";
        for(int i=0;i<=2;i++){
            Random random=new Random();
            char randomchar=(char)(random.nextInt(90-65)+'a');
            code1+=randomchar;
        }
        for(int i=0;i<=2;i++)
        {
            Random random=new Random();
            char randomchar=(char)(random.nextInt(90-65)+'a');
            code2+=randomchar;
        }
        code1=code1.toUpperCase();
        code2=code2.toUpperCase();
        return code1+this.employee.name+" "+this.employee.surname+code2;
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees: " + totalNumberOfEmployees);
        System.out.println("Employee details: " + employee.getEmployeeDetails());
        System.out.println("Badge ID code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
