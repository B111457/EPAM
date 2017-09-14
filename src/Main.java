import java.util.Date;
public class Main{

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	Date currentDate=new Date();
	StudentGroup s=new StudentGroup(2);
	String g="Praveen Raj";
	Student s1=new Student(111457,g,currentDate,9.8);
	Student[] sg=new Student[2];
	sg[0]=s1;
	sg[1]=s1;
	s.setStudents(sg);
	Student a[]=s.getStudents();
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
		Student b=a[i];
		System.out.println(b.getId());
	}
}
	
}
