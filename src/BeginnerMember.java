public class BeginnerMember extends Subscriber {
  public BeginnerMember(
      int id,
      String name,
      String phoneNo,
      SubscLevel subscLevel,
      boolean subscPaid) {
    super(id, name, phoneNo, subscLevel, subscPaid);

    this.setMemType(MemType.BEGINNER);
  }

}
