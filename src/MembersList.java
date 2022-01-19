public class MembersList {

  private ArrayListCustom<Subscriber> list;

  public MembersList() {
    list = new ArrayListCustom<>();
  }

  public int size() {
    return list.size();
  }

  public Subscriber get(int index) {
    return list.get(index);
  }

  public void add(Subscriber s) {
    list.add(s);
  }

  public Subscriber remove(int index) {
    var removedItem = list.delete(index);
    return removedItem;
  }

  private int findById(int id) {
    for (int i = 0; i < list.size(); i++) {
      var s = list.get(i);
      if (s.getId() == id)
        return i;
    }

    // Not found
    return -1;
  }

  public void removeById(int id) {
    // First find the index number
    var index = findById(id);

    if (index >= 0) {
      // If the item is found
      var removedItem = list.delete(index);
      System.out.println("[removeById: " + id + "] Item removed: " + removedItem);
    } else {
      System.out.println("[removeById: " + id + "] ID not found.");
    }
  }

  public String display() {
    return list.toStringCustom();
  }

  private void print(Subscriber s) {
    var id = s.getId();
    var name = s.getName();
    var type = s.getMemType();
    var level = s.getSubscLevel();
    var paid = s.isSubscPaid();

    System.out.println(id + ", " + type + ", " + name + ", " + level + ", " + paid);
  }

  public void report() {
    for (int i = 0; i < list.size(); i++) {
      var s = list.get(i);
      print(s);
    }
  }

  public void sort() {
    Sort.normal(list);
  }

  public void sortAdvanced() {
    Sort.advanced(list);
  }

}
