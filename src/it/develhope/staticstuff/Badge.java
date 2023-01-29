package it.develhope.staticstuff;

public class Badge
{
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        return "XYZ" + employee.name + employee.surname + "ZYX";
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees: " + totalNumberOfEmployees);
        System.out.println("Employee details: " + employee.getEmployeeDetails());
        System.out.println("Badge ID code: " + badgeIdCode);
    }

    Badge(Employee employeeThatNeedsBadge)
    {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
