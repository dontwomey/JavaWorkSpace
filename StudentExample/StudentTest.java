import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		//Get array size from user and create student array
		
		//Step 2
		Student[] students = createArray();
		//step 4
		populateArray(students);
		//step 6
		System.out.println("\nList of students:");
		displayArray(students);
	}

	//Step 1
	public static Student[] createArray(){
		
		//Get array size from user and create student array
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int choice = input.nextInt();
		Student[] array = new Student[choice];
		return array;
	}
	
	//step 3
	public static void populateArray(Student[] array){
		//use counter-controlled loop to populate

		for(int i = 0; i < array.length; i++){
			
			//get input from user
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter student name: ");
			String username = input.next();
			System.out.print("Enter student ID number: ");
			long studentID = input.nextLong();
			
			Student student = new Student(username, studentID);
			//Assign values to each instance in array
			array[i] = student;
		}
	}
	
	//step 5
	public static void displayArray(Student[] array){
		
		//use getters to display in enhanced for loop
		for(Student student : array){
			System.out.println(student.getName());
			System.out.println(student.getIdNumber());
			
		}
		
		
	}
}
