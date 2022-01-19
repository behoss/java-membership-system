public class Officer extends Subscriber {
  private String responsibility;

  public Officer(
      int id,
      String name,
      SubscLevel subscLevel,
      boolean subscPaid) {
    super(id, name, subscLevel, subscPaid);

    this.setMemType(MemType.OFFICER);
  }

  public String getResponsibility() {
    return responsibility;
  }

  public void setResponsibility(String responsibility) {
    this.responsibility = responsibility;
  }

}
