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
		if(index<students.length-1 || students==null)
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
		if(index<students.length-1 || students==null)
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
		if( students==null)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{
			Student t[]=new Student[students.length+1];
			t[0]=student;
			int j=0;
			for(int i=1;i<t.length;i++)
			{
				t[i]=students[j];
				j++;
			}
			students=t;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int i=1;
		if( students==null)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{
			Student t[]=new Student[students.length+1];
			int j=0;
			for(i=0;i<students.length;i++)
			{
				t[i]=students[j];
				j++;
			}
			t[i]=student;
			students=t;		
		}
	}

	@Override
	public void add(Student student, int index) {
		if(index<students.length-1 || students==null)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{
			students[index]=student;

		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		if(index>students.length-1 || this.students==null)
		{
			throw new IllegalArgumentException("Error");
		}
		else
		{

			Student t[]=new Student[students.length-1];
			for(int j=0;j<index;j++)
			t[j]=students[j];
			for(int i=index;i<students.length-1;i++)
			t[i]=students[i+1];
			students=t;

		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		
			for(int i=0;i<students.length;i++)
			{
				if(students[i].getId()==student.getId())
				{
					Student t[]=new Student[students.length-1];
					for(int j=0;j<i;j++)
					t[j]=students[j];
					for(int j=i;j<students.length-1;j++)
					t[j]=students[j+1];
					students=t;
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
