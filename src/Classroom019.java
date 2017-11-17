import java.util.ArrayList;

public class Classroom019 {

	private String classroomName = "KVALIT17";
	private String classroomTerm = "hösten 2017";
	private ArrayList<Student019> Students = new ArrayList<Student019>();

	public Classroom019(String classroomName, String classroomTerm, ArrayList<Student019> students) {
		super();
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		Students = students;
	}

	public String getClassroomName() {
		return classroomName;
	}

	public String getClassroomTerm() {
		return classroomTerm;
	}

	public ArrayList<Student019> getStudents() {
		return Students;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}

	public void setStudents(ArrayList<Student019> students) {
		Students = students;
	}

	// addANewStudent(Student student): This method takes a Student object as a
	// parameter
	// and adds the student to the ArrayList<Student> students.
	public void addNewStudent(Student019 student) {
		this.Students.add(student);
	}

	/*
	 * removeAStudent(String firstName). This method takes in a student’s first name
	 * and search the student within the array. If the student exists, the student
	 * is removed from the list and the method prints out the message “Student”+
	 * #firstName# + ”successfully removed”. Otherwise, the method prints out the
	 * message “The student does not exist!”
	 */
	public void removeStudent(String firstName) {
		
		Student019 student = null; 
		boolean studentExists = false; 

		for (int i = 0; i < Students.size(); i++) {

			if (Students.get(i).getFirstName().equals(firstName)) {

				studentExists = true; 
				this.Students.remove(i);
				System.out.println("Student " + firstName + " sucessfully removed.");

			} else {

				System.out.println("The student " + firstName + " does not exist.");
			}
		}
	}

//Metod som skall beräkna antal elever med olika könsdefinition.
public String toString() {
		
		String genderAmount = ""; 
		int genderF = 0; 
		int genderM = 0; 
		int genderO = 0;

		for (int i = 0; i < Students.size(); i++) {

			if (Students.get(i).getGender() == 'f') {
				genderF ++;
			}else if (Students.get(i).getGender() == 'm') {
				genderM ++; 
			}else {
				genderO ++;
			}
		}
		genderAmount = "Fördelningen är " + genderF + " flickor/kvinnor, "
				+ genderM + "pojkar/män och " + genderO + "ickebinär/med annan definition. ";
		return genderAmount; 
		
	}

	/*
	 * printFullRelatory(): This method prints out a string that contains the name
	 * of the classroom, the term and a list of all students that belong to the
	 * class.
	 */


	public String printFullRelatory() {
		
		String fullRelatory = "KLassrum: " + getClassroomName() + "\tTermin: " + getClassroomTerm() + "\n\nElever: \n";
		
		for (int i = 0; i < Students.size(); i++) {
			
			fullRelatory += Students.get(i).toString() + "\n";
		}
		return fullRelatory + "\n"; 
	}
}
