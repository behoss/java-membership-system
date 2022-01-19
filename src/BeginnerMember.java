public class BeginnerMember extends Subscriber {
  public BeginnerMember(
      int id,
      String name,
      SubscLevel subscLevel,
      boolean subscPaid) {
    super(id, name, subscLevel, subscPaid);

    this.setMemType(MemType.BEGINNER);
  }

}
