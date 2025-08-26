package Day_6;
//enum_priorityLevel
public enum enum_priorityLevel {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);
    private final int severityCode;

    enum_priorityLevel(int severityCode) {
        this.severityCode = severityCode;
    }

    public int getSeverityCode() {
        return severityCode;
    }

    public boolean isUrgent() {
        // Assuming a threshold of 3 for urgency (HIGH or CRITICAL)
        return this.severityCode >= 2;
    }
    public static void main(String[] args) {
    	for(enum_priorityLevel level:enum_priorityLevel.values()) {
    		System.out.println("priority:"+level.name() +",Severity: "+ level.getSeverityCode()+",Urgent:" +level.isUrgent());
    	}
		
	}
}
