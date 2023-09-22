package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	static EmployeeDAO obj ;
	String host = "localhost:3306";
    String database = "cg";
    String url = "jdbc:mysql://"+ host+"/"+database;

    Connection con;
    PreparedStatement ps;
   
    public EmployeeDAO() throws SQLException, ClassNotFoundException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,"root","admin");
        System.out.println("con "+con);
    } 
	
    public List<Employee> getAllEmployees()throws SQLException,NullPointerException
    {
    	List<Employee> outputList = new ArrayList<>();
    	
    	String query = "select * from Employee";
    	
    	PreparedStatement ps = con.prepareStatement(query);
    	ResultSet rs = ps.executeQuery();
    	
    	
    	while(rs.next())
    	{
    		int empId = rs.getInt("empId");
    		String name = rs.getString("empName");
    		long phn = rs.getLong("mobileNumber");
    		String location = rs.getString("location");
    		int salary = rs.getInt("salary");
    		
    		outputList.add(new Employee(empId, name, phn, salary, location));
    	}
    	
    	return outputList;
    }
    
    public boolean insertEmployee(Employee e)throws SQLException
    {
    	String sql = "insert into employee values(?,?,?,?,?);";
    	
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1,e.getEmpId());
    	ps.setString(2,e.getEmpName());
    	ps.setLong(3,e.getMobileNumber());
    	ps.setString(4,e.getLocation());
    	ps.setInt(5,e.getSalary());
    	
    	int x = ps.executeUpdate();
    	if(x>0)return true;
    	else return false;
    	
    	
    	
   
    }
    public static void main(String[] args){
    	try {
    		
    	obj	= new  EmployeeDAO();
    		getData();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
    
    public static void getData() {
    	try {
    		for (Employee e :obj.getAllEmployees()) {
    			System.out.println(e);
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    
    public static void insertEmployee()throws SQLException
    {
    	/*
    	System.out.println("Enter Employee Name ");
    	String name = */
    	Employee e = new Employee(110, "Shilpa", 174588662, 1500, "Chennai");
		boolean status = obj.insertEmployee(e);
		System.out.println(status);
    }
    
    
}//end class
