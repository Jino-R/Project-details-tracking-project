import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     System.out.println("Enter architect details ");
     Scanner input = new Scanner(System.in); 

 //Ask questions for architect     
     System.out.println("Enter name");     
     String architectName = input.nextLine();
   
     System.out.println("Enter email");     
     String architectEmail = input.nextLine();
   
     System.out.println("Enter Physical Address");    
     String architectPhysicalAddress = input.nextLine();
     
     System.out.println("Enter telephone number");     
     String architectTelephoneNumber = input.nextLine();

// create architect object and set values to questions asked     
     Person architect = new Person( architectName,  architectEmail, architectPhysicalAddress, architectTelephoneNumber);
     architect.setName(architectName);
     architect.setEmail(architectEmail);
     architect.setPhysicalAddress(architectPhysicalAddress);
     architect.setTelephoneNumber(architectTelephoneNumber);

//print architect details     
     System.out.println(architect);
     System.out.println(" ");

// ask contractor questions      
     System.out.println("Enter Contractor's details");
     System.out.println("Enter name");
     String contractorName = input.nextLine();
     
     System.out.println("Enter email");
     String contractorEmail = input.nextLine();
     
     System.out.println("Enter physical address");
     String contractorPhysicalAddress = input.nextLine();
     
     System.out.println("Enter telephone number");
     String contractorTelephoneNumber = input.nextLine();

// create contractor object and set values to questions asked     
    Person contractor = new Person( contractorTelephoneNumber, contractorEmail, contractorPhysicalAddress,contractorName);   
     
     contractor.setName(contractorName);
     contractor.setEmail(contractorEmail);
     contractor.setPhysicalAddress(contractorPhysicalAddress);
     contractor.setTelephoneNumber(contractorTelephoneNumber);

 // print contractor details     
     System.out.println(contractor);
     System.out.println(" ");
  
// ask customer details      
     System.out.println("Enter Customers's details");
     System.out.println("Enter name");
     String customerName = input.nextLine();
     
     System.out.println("Enter email");
     String customerEmail = input.nextLine();
     
     System.out.println("Enter physical address");
     String customerPhysicalAddress = input.nextLine();
     
     System.out.println("Enter telephone number");
     String customerTelephoneNumber = input.nextLine();

// create customer object and set values to questions asked      
     Person customer =new Person(customerName, customerEmail, customerTelephoneNumber, customerPhysicalAddress);
     
     customer.setName(customerName);
     customer.setEmail(customerEmail);
     customer.setTelephoneNumber(customerTelephoneNumber);
     customer.setPhysicalAddress(customerPhysicalAddress);

// print customer details      
     System.out.println(customer);
     System.out.println(" ");

// Ask project details questions     
     System.out.println("Enter project details");
     System.out.println("Enter name");
     String projectName = input.nextLine();
     
     System.out.println("Enter project address");
     String projectAddress = input.nextLine();  
         
     
     System.out.println("Enter building type");
     String buildingType = input.nextLine();
     
     System.out.println("Enter deadline");
     String deadline = input.nextLine();
     
     System.out.println("Enter total fee in (R_,_) ");
     float totalFee = input.nextFloat();
     
     System.out.println("Enter amount paid to date in (R_,_) ");
     float amountPaid = input.nextFloat();
     
     System.out.println("Enter erf number");
     int erfNumber = input.nextInt();
     
     
     System.out.println("Enter project number");
     int projectNumber = input.nextInt();   

// create project object and set values to questions asked     
     Project project = new Project(projectNumber,  projectName,  buildingType,  projectAddress,  erfNumber, totalFee,  amountPaid, deadline);
     
     project.setProjectNumber(projectNumber);
     project.setProjectName(projectName);
     project.setBuildingType(buildingType);
     project.setProjectAddress(projectAddress);
     project.setErfNumber(erfNumber);
     project.setTotalFee(totalFee);
     project.setAmountPaid(amountPaid);
     project.setDeadline(deadline);

// print project details      
     System.out.println(project);
     input.nextLine();
     System.out.println(" ");

// ask user if they want to update details      
    System.out.println("Do you want to update any details? (yes/no) : ");
     String question = input.nextLine().toLowerCase();

// if they want to update details ask which details to update     
     if(question.equals("yes")){
    	 System.out.println("Do you want to change the deadline(d), update contractor details(u), update total amount paid(t)");
    	 String change = input.nextLine().toLowerCase();

//change details based on user input and print updated details     	 
    	 if(change.equals("d")){
    		 System.out.println("Enter new deadline");
    		 
    		 String newDeadline = input.nextLine();
    		 
    		 System.out.println("New project details are :");
    		 System.out.println(" ");
    		 
    		 project.setDeadline(newDeadline);
    		 
    		 System.out.println(project);
    	 }
    	 if(change.equals("u")) {
    		 System.out.println("Enter new email");
    		 
    		 String newEmail = input.nextLine();
    		 
    		 System.out.println("Enter new telephone Number");
    		 
    		 String newTelephoneNumber = input.nextLine();
    		 
    		 contractor.setEmail(newEmail);
    		 contractor.setTelephoneNumber(newTelephoneNumber);
    		 
    		 System.out.println("Contractor's new details are :");
    		 System.out.println(" ");
    		 System.out.println(contractor);
    		 
    	 }
    	 if(change.equals("t")) {
    		 System.out.println("Enter new total amount paid");
    		 
    		 float newTotalAmount = input.nextFloat();
    		 
    		 project.setAmountPaid(newTotalAmount);
    		 
    		 System.out.println("new Project details are :");
    		 System.out.println(" ");
    		 System.out.println(project);
    		 
    	 }
    	 
     } 
 // if user does not want to update details then tell user details have been stored     
     else if(question.equals("no")) {
    	 System.out.println("Details stored successfuly");
     }
	}

}
