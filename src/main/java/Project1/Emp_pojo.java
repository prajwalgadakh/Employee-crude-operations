package Project1;

public class Emp_pojo 
{
	private int EmployeeId;
	private String Name;
	private String Address;
	private String Gender;
	private String Salary;
	private String BirthDate;
	
	
	public Emp_pojo()
	{
		
	}
	public Emp_pojo(int employeeId, String name, String address, String gender, String salary, String birthDate) {
		super();
		EmployeeId = employeeId;
		Name = name;
		Address = address;
		Gender = gender;
		Salary = salary;
		BirthDate = birthDate;
	}


	public int getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getSalary() {
		return Salary;
	}


	public void setSalary(String salary) {
		Salary = salary;
	}


	public String getBirthDate() {
		return BirthDate;
	}


	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}


	
	}


