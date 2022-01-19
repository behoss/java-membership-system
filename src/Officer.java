public class Officer extends Subscriber {
  private String responsibility;

  public Officer(
      int id,
      String name,
      String phoneNo,
      SubscLevel subscLevel,
      boolean subscPaid) {
    super(id, name, phoneNo, subscLevel, subscPaid);

    this.setMemType(MemType.OFFICER);
  }

  public String getResponsibility() {
    return responsibility;
  }

  public void setResponsibility(String responsibility) {
    this.responsibility = responsibility;
  }

}
