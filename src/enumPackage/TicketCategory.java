package enumPackage;

public enum TicketCategory {

	//Ticket Category is of enum type with 4 predefined values-CRITICAL, HIGH,MEDIUM,LOW
	CRITICAL("Critical Ticket"), HIGH("High ticket"), MEDIUM("Medium ticket"), LOW("Low ticket");

	private String description;

	private TicketCategory(String description) {

		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
