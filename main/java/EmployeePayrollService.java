import java.util.List;

public class EmployeePayrollService {
    public enum IOService {FILE_IO,DB_IO}

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {}

    public List<EmployeePayrollData> readEmployeePayrollData(IOService iOservice) {
        if (iOservice.equals(IOService.DB_IO))
            this.employeePayrollList = new EmployeePayrollDBService().readData();
        return this.employeePayrollList;
    }
}
