
public class Student {

	//Data members
	private String name;
	private long idNumber;
	
	//constructor
	public Student(String studentName, long idNumber){
		name = studentName;
		this.idNumber = idNumber;
	}
	
	//getter/setters
	public String getName(){
		return name;
	}
	
	public void setName(String studentName){
		name = studentName;
	}
	
	public long getIdNumber(){
		return idNumber;
	}
	
	public void setIdNumber(long idNumber){
		this.idNumber = idNumber;
	}
}

