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
        String code1 = "XYZ";
        String code2 = "ZYX";
        return code1 + employee.name + employee.surname + code2;
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
