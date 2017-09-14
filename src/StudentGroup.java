import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation{

	private Student[] students;

	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		int n=students.length,i=0;
		if(this.students.length<students.length)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{
			this.students = new Student[n];
			for(i=0;i<n;i++)
			{
				this.students[i]=students[i];
			}

		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<students.length-1)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{
			return students[index];

		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<students.length-1)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{
			students[index]=student;

		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		int n=students.length;
		if(index>n)
		{
			throw new IllegalArgumentException("Error: ");
		}
		else
		{
			
			this.students[index]=student;
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<students.length-1)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{
			for(int i=index;i<students.length-1;i++)
			students[i]=students[i+1];

		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		
			int index=0;
			for(int i=0;i<students.length;i++)
			{
				if(students[i].getId()==student.getId())
				{
					for(int j=index;j<students.length-1;j++)
					students[j]=students[j+1];
				}
			}
			

		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
