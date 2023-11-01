package containment_hasa_relationship;

public class Training {
	
	private String trainingName;

	public Training(String trainingName) {
		super();
		this.trainingName = trainingName;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	
	  @Override public String toString() { return "Training [trainingName=" +
	  trainingName + "]"; }
	  
	 

}
