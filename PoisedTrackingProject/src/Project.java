
public class Project {
// Attributes
	int projectNumber;
	String projectName;
	String buildingType;
	String projectAddress;
	String deadline;
	int erfNumber;
	float totalFee;
	float amountPaid;

	// constructor
	public Project(int projectNumber,  String projectName,  String buildingType, String projectAddress,  int erfNumber,float totalFee, float amountPaid,String deadline) {

		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.projectAddress = projectAddress;
		this.erfNumber = erfNumber;
		this.totalFee = totalFee;
		this.amountPaid = amountPaid;
		this.deadline = deadline;
	}

	// methods

	public int getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public String getProjectAddress() {
		return projectAddress;
	}

	public void setProjectAddress(String physicalAddress) {
		this.projectAddress = physicalAddress;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public int getErfNumber() {
		return erfNumber;
	}

	public void setErfNumber(int erfNumber) {
		this.erfNumber = erfNumber;
	}

	public float getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(float totalFee) {
		this.totalFee = totalFee;
	}

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float totalAmountPaid) {
		this.amountPaid = totalAmountPaid;
	}

	// this is where we get our out out for each value
	public String toString() {
		String output = "Project Number: " + projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nBuilding Type: " + buildingType;
		output += "\nPhysical Address: " + projectAddress;
		output += "\nERF Number : " + erfNumber;
		output += "\nTotal Fee :" + totalFee;
		output += "\nTotal Amount Paid: " + amountPaid;
		output += "\nDeadline :" + deadline;

		return output;
	}
}
