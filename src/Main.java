import java.util.Date;
public class Main{

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	Date currentDate=new Date();
	StudentGroup s=new StudentGroup(2);
	Student s1=new Student(111457,"Praveen Raj",currentDate,9.8);
	Student s2=new Student(111459,"Rajesh",currentDate,9.8);
	Student[] sg=new Student[2];
	sg[0]=s1;
	sg[1]=s2;
	s.setStudents(sg);
	//s.setStudent(s1,1);
	//s.addFirst(s2);
	//s.addLast(s1);
	s.remove(s1);
	//s.add(s1,1);
	Student a[]=s.getStudents();
	//Student sample=s.getStudent(1);
	//System.out.println("index 1"+sample.getId());
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
		Student b=a[i];
		System.out.println(b.getId());
	}
}
	
}
