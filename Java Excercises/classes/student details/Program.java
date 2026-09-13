
public class Program {

	public static void main(String[] args) {
	
        Student obj = new Student();
        

		obj.setName("John");
		obj.setRoll_no(2);
		obj.setPhone_no("9876543210");
		obj.setAdress("Mumbai");
		
		Student obj2 = new Student();
		obj2.setName("sam");
		obj2.setRoll_no(4);
		obj2.setPhone_no("9967896543");
		obj.setAdress("Pune");
		
		
     	System.out.println("Details of the first student");
     	System.out.println("Name : "+ obj.getName());
     	System.out.println("Roll_No :" +obj.getRoll_no());
     	System.out.println("Phone_no :" +obj.getPhone_no());
     	System.out.println("Adress :" +obj.getAdress());
     	
     	System.out.println("Details of the Second student");
     	System.out.println("Name : "+ obj2.getName());
     	System.out.println("Roll_No :" +obj2.getRoll_no());
     	System.out.println("Phone_no :" +obj2.getPhone_no());
     	System.out.println("Adress :" +obj2.getAdress());

		
	}
	

}
 