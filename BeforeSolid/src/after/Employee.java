package after;
public class Employee {
	private String employeeId;
    private String employeeName;
	private String employeeAddress;
	private String employeeNumber;
	private String employeeType;

    //Sudah memindahkan semua function spesifik yang ada di disini menjadi suatu class baru

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress(){
        return employeeAddress;
    }
    
    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeNumber(){
        return employeeNumber;
    }
    
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeType(){
        return employeeType;
    }
    
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}