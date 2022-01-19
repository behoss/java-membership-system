class ArrayListCustom<E> {

  private static final int initialCapacity = 20;
  private int size = 0; // Number of items currently in the list
  private Object[] list;

  public ArrayListCustom() {
    // Creates a generic array of objects with the length of initial capacity
    list = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    // Check for negative index or larger than current size
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(index);
    }

    // Cast the value to the object type and return
    return (E) list[index];
  }

  public void add(E e) {
    // Checks if we've reached the capacity
    if (size == list.length) {
      addCapacity();
    }

    // Adds data to the last unassigned index
    // Increases the size by 1
    list[size++] = e;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(index);
    }

    Object removedItem = list[index];

    for (int i = index; i < size - 1; i++) {
      // Shifts every item greater than index to the left
      list[i] = list[i + 1];
    }

    // Reduces size by 1
    size--;

    return (E) removedItem;
  }

  private void copyTo(int capacity) {
    var tmp = new Object[capacity];

    for (int i = 0; i < list.length; i++) {
      tmp[i] = list[i];
    }

    list = tmp;
  }

  private void addCapacity() {
    int newCapacity = list.length * 2;
    copyTo(newCapacity);
  }

  public Object[] getAll() {
    return list;
  }

}
