public class JuniorMember extends Subscriber {
  private int assignedOfficerId;

  public JuniorMember(
      int id,
      String name,
      SubscLevel subscLevel,
      boolean subscPaid) {
    super(id, name, subscLevel, subscPaid);

    this.setMemType(MemType.JUNIOR);
  }

  public int getAssignedOfficerId() {
    return assignedOfficerId;
  }

  public void setAssignedOfficerId(int assignedOfficerId) {
    this.assignedOfficerId = assignedOfficerId;
  }

}
