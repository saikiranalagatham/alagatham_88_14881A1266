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
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	ArrayList<Student> al = new ArrayList<Student>(Arrays.asList(students));
	 Iterator itr = al.iterator();
	LinkedList l1 = new LinkedList(Arrays.aslist(Student);
	@Override
	public Student[] getStudents() {
		al.forEach(Sysstem.out::println);
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		al.add(students);
	}

	@Override
	public Student getStudent(int index) {
		int count=0;
		while(itr.hasNext())
		{
			count++;
			Object element = itr.next();
			if(count==index){
				System.out.println(element);
			}
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		int count=0;
		// Add your implementation here
		while(itr.hasNext())
		{
			count++;
			
			if(count==index){
				al.add(student);
			}
		}
	}

	@Override
	public void addFirst(Student student) {
		ll.addFirst(student);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		ll.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		while(itr.hasNext())
		{
			count++;
			
			if(count==index){
				al.add(student);
			}
		}
	}

	@Override
	public void remove(int index) {
		int count=0;
		while(itr.hasNext())
		{
			count++;
			
			if(count==index){
				al.remove(index);
			}
		}
		
	}

	@Override
	public void remove(Student student) {
		al.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		al.removeRange(index,al.size());
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int n=al.indexOf(student);
		removeFromIndex(n);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		a1.removeRange(0,index);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int n=al.indexOf(student);
		removeToIndex(n);
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
		int n=al.indexOf(student);
		//int c=0;
		getStudent(n+1);
		return null;
	}
}
