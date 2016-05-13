public class Diva {
  private String requirements;
  private int numberOfAssistants;

  public Diva(){
    this("",0);
  }

  public Diva(String requirements, int numberOfAssistants){
    setRequirements(requirements);
    setNumberOfAssistants(numberOfAssistants);
  }

  public void setRequirements(String requirements){
    this.requirements = requirements;
  }

  public void setNumberOfAssistants(int numberOfAssistants){
    this.numberOfAssistants = numberOfAssistants;
  }

  public String getRequirements(){
    return requirements;
  }

  public int getNumberOfAssistants(){
    return numberOfAssistants;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Requirements: " + getRequirements());
    sb.append("Assistants: " + getNumberOfAssistants());
    return sb.toString();
    //return "Requirements: " + getRequirements() + "Assistants: " + getNumberOfAssistants();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Diva)) return false;
    if (this == obj) return true;
    Diva anotherOne = (Diva) obj;
    return (this.getRequirements().equals(anotherOne.getRequirements()))
    && this.getNumberOfAssistants() == (anotherOne.getNumberOfAssistants());
    // failfast - single "&" for "evaluate both wings" for side-effects
  }

  @Override
  public int hashCode() {
    return getNumberOfAssistants() + getRequirements().length();
    // anything that creates a unique code... probably not what is above
  }
}
