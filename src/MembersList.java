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

  private int findById(int id) {
    var subscribers = list.getAll();

    for (int i = 0; i < subscribers.length; i++) {
      if (subscribers[i] != null) {
        Subscriber s = (Subscriber) subscribers[i];
        if (s.getId() == id)
          return i;
      }
    }

    return -1;
  }

  public void add(Subscriber s) {
    list.add(s);
  }

  public Subscriber remove(int index) {
    var removedItem = list.remove(index);
    return removedItem;
  }

  public Subscriber removeById(int id) {
    var index = findById(id);
    var removedItem = list.remove(index);
    return removedItem;
  }

  public void display() {
    var subscribers = list.getAll();

    for (Object o : subscribers) {
      if (o != null) {
        Subscriber s = (Subscriber) o;
        System.out.println(s.getName() + ", " + s.getMemType());
      }
    }
  }

}
