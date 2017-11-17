
public class Student019 extends Person019 {

	private double firstGrade;
	private double secondGrade;
	private double thirdGrade;
	private double averageGrade;

	public Student019(String firstName, String lastName, int age, char gender) {
		super(firstName, lastName, age, gender);
	}

	public Student019(String firstName, String lastName, int age, char gender, double firstGrade, double secondGrade,
			double thirdGrade, double averageGrade) {
		super(firstName, lastName, age, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
		this.averageGrade = averageGrade;
	}

	public double getFirstGrade() {
		return firstGrade;
	}

	public double getSecondGrade() {
		return secondGrade;
	}

	public double getThirdGrade() {
		return thirdGrade;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}

	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

	/*
	 * calculateAverage(): This method will access the three grades of a student and
	 * will calculate the average of the grades. The method will, thus, set the
	 * final value to the attribute averageGrade through the method
	 * setAverageGrade(double averageGrade) and also return the averageGrade as a
	 * double Utgår från att betygen är satta.
	 */
	public double calculateAverage() {
		double result = (firstGrade + secondGrade + thirdGrade) / 3;
		setAverageGrade(result);
		return result;
	}

	/*
	 * calculateAverage(double firstGrade, double secondGrade, double thirdGrade):
	 * This method will calculate the average of the grades, based on the values
	 * informed as parameters. The method will, thus, set the final value to the
	 * attribute averageGrade through the method setAverageGrade(double
	 * averageGrade) and also return the averageGrade as a double.
	 * 
	 * Utgår från att betygen inte finns eller att betygen ska uppdateras.
	 */
	public double calculateAverage(double firstGrade, double secondGrade, double thirdGrade) {
		averageGrade = (firstGrade + secondGrade + thirdGrade) / 3;
		return averageGrade;
	}

	/*
	 * hasClearedTheCourse(): This method will return a boolean value that is used
	 * to indicate if the student has cleared the course or not. The rule is; if the
	 * the averageGrade is less than 6.0, the student has not cleared the course and
	 * the method will return false. Otherwise, the method will return true.
	 * 
	 * if averageGrade <6.0 -> not cleared. hasCleared = false. else true.
	 */
	public boolean hasClearedCourse() {

		if (averageGrade < 6.0) {
			return false;
		}
		return true;
	}

	/*
	 * toString(){}: This method will return a String that contains all information
	 * about a particular student. Use the example below or implement your own in a
	 * similar fashion(non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		if (hasClearedCourse()) {

			return "Namn: " + getFirstName() + " " + getLastName() + "\nKön: " + getGender() + "\tÅlder: " + getAge()
					+ "\nBetyg: " + getFirstGrade() + ", " + getSecondGrade() + ", " + getThirdGrade()
					+ ". \nMedelbetyg: " + getAverageGrade() + "\nEleven har klarat kursen.\n";
		} else {

			return "Namn: " + getFirstName() + " " + getLastName() + "\nKön: " + getGender() + "\tÅlder: " + getAge()
					+ "\nBetyg: " + getFirstGrade() + ", " + getSecondGrade() + ", " + getThirdGrade()
					+ ". \nMedelbetyg: " + getAverageGrade() + "\nEleven har inte klarat kursen.\n";
		}

	}

}
