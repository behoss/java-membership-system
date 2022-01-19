public class AdvancedMember extends Subscriber {
  private String[] expertise;

  public AdvancedMember(
      int id,
      String name,
      SubscLevel subscLevel,
      boolean subscPaid) {
    super(id, name, subscLevel, subscPaid);

    this.setMemType(MemType.ADVANCED);
  }

  public String[] getExpertise() {
    return expertise;
  }

  public void setExpertise(String[] expertise) {
    this.expertise = expertise;
  }

}
