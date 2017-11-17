import java.util.ArrayList;

public class Main019Danger {

	public static void main(String[] args) {
		
		ArrayList<Student019> Students = new ArrayList<Student019>();
		Classroom019 classroom = new Classroom019("304a", "hösten 2017", Students);
		
		Student019 student1 = new Student019("Anna-Maja", "Lithner", 46, 'f');
		classroom.addNewStudent(student1);
		student1.setFirstGrade(8.5);
		student1.setSecondGrade(1.1);
		student1.setThirdGrade(1.0);
		student1.calculateAverage();
		student1.getAverageGrade();
		
		
		Student019 student2 = new Student019("Hugo", "Lithner", 11, 'm');
		classroom.addNewStudent(student2);
		student2.setFirstGrade(9.9);
		student2.setSecondGrade(8.8);
		student2.setThirdGrade(7.7);
		student2.calculateAverage(); 
		student2.getAverageGrade();
		

		Student019 student3 = new Student019("Sami", "Fouad", 46, 'm');
		classroom.addNewStudent(student3);
		student3.setFirstGrade(7.7);
		student3.setSecondGrade(6.1);
		student3.setThirdGrade(6.6);
		student3.calculateAverage(); 
		student3.getAverageGrade();
		
		Student019 student4 = new Student019("Kim", "Lithner", 9, 'o');
		classroom.addNewStudent(student4);
		student4.setFirstGrade(9.9);
		student4.setSecondGrade(8.8);
		student4.setThirdGrade(7.7);
		student4.calculateAverage(); 
		student4.getAverageGrade();
		
		Student019 student5 = new Student019("Albert", "Einstein", 76, 'm');
		classroom.addNewStudent(student5);
		student5.setFirstGrade(9.9);
		student5.setSecondGrade(8.9);
		student5.setThirdGrade(9.3);
		student5.calculateAverage(); 
		student5.getAverageGrade();
		
		
		System.out.println(classroom.printFullRelatory());
		double classAverage = (student1.getAverageGrade() + student2.getAverageGrade() + 
				student3.getAverageGrade() + student4.getAverageGrade() + student5.getAverageGrade()) / 5; 
		System.out.println("Klassens medelbetyg är " + classAverage);
		
		double classAgeAverage = (student1.getAge() + student2.getAge() + student3.getAge() 
		+ student4.getAge() + student5.getAge()) / 5;
		System.out.println("Klassens genomsnittsålder är  " + classAgeAverage);
		System.out.println(classroom.genderAmount());
	}

}
