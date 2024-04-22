package Day2;

public class Employee {
     int employeeId;
     int projectId;
     String projectName;
     String email;
     String phone;
     String domain;

    public Employee() {}

    public Employee(int employeeId, int projectId, String projectName, String email, String phone, String domain) {
        this.employeeId = employeeId;
        this.projectId = projectId;
        this.projectName = projectName;
        this.email = email;
        this.phone = phone;
        this.domain = domain;
    }


    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public int getProjectId() { return projectId; }
    public void setProjectId(int projectId) { this.projectId = projectId; }

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }



    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Employee employee = new Employee(1, 101, "Project1", "null@gmail.com", "79*****787", "it-developer");
        System.out.println(employee);
        employee.setDomain("NON IT");
        System.out.println(employee);
    }
}
