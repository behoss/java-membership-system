public class JuniorMember extends Subscriber {
  private int assignedOfficerId;

  public JuniorMember(
      int id,
      String name,
      String phoneNo,
      SubscLevel subscLevel,
      boolean subscPaid) {
    super(id, name, phoneNo, subscLevel, subscPaid);

    this.setMemType(MemType.JUNIOR);
  }

  public int getAssignedOfficerId() {
    return assignedOfficerId;
  }

  public void setAssignedOfficerId(int assignedOfficerId) {
    this.assignedOfficerId = assignedOfficerId;
  }

}
