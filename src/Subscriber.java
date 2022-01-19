enum SubscLevel {
  JUNIOR,
  NORMAL,
  RETIRED;
}

enum MemType {
  JUNIOR,
  BEGINNER,
  ADVANCED,
  OFFICER;
}

public abstract class Subscriber implements Comparable<Subscriber> {

  private int id;
  private String name;
  private String phoneNo;
  private SubscLevel subscLevel;
  private boolean subscPaid;
  private MemType memType;

  public Subscriber(
      int id,
      String name,
      SubscLevel subscLevel,
      boolean subscPaid) {
    this.id = id;
    this.name = name;
    this.subscLevel = subscLevel;
    this.subscPaid = subscPaid;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public SubscLevel getSubscLevel() {
    return subscLevel;
  }

  public void setSubscLevel(SubscLevel subscLevel) {
    this.subscLevel = subscLevel;
  }

  public boolean isSubscPaid() {
    return subscPaid;
  }

  public void setSubscPaid(boolean subscPaid) {
    this.subscPaid = subscPaid;
  }

  public MemType getMemType() {
    return memType;
  }

  public void setMemType(MemType memType) {
    this.memType = memType;
  }

  @Override
  public int compareTo(Subscriber s) {
    if (getId() > s.getId())
      return 1;
    if (getId() < s.getId())
      return -1;
    return 0;
  }

}
