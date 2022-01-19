class ArrayListCustom<E> {

  private static final int CAP = 20; // Initial capacity
  private int size = 0; // Number of items currently in the list
  private Object[] list; // Can't create array of generic classes

  public ArrayListCustom() {
    // Creates an array of objects with the length of initial capacity
    list = new Object[CAP];
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
      increaseCap();
    }

    // Updates size & assigns data to the last index (empty)
    list[size++] = e;
  }

  public void set(E e, int index) {
    list[index] = e;
  }

  public void insert(E e, int index) {
    // Each next index after index param gets the value of the current index
    // Moving from the end of array until the index param
    for (int i = size - 1; i > index; i--) {
      list[i + 1] = list[i];
    }

    // After shifting is done, assign the value
    list[index] = e;

    // Update size
    size++;
  }

  @SuppressWarnings("unchecked")
  public E delete(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(index);
    }

    Object removedItem = list[index];

    for (int i = index; i < size - 1; i++) {
      // Shifts every item greater than index to the left
      list[i] = list[i + 1];
    }

    // Updates size
    size--;

    return (E) removedItem;
  }

  private void cloneArrayWith(int capacity) {
    var tmp = new Object[capacity];

    for (int i = 0; i < list.length; i++) {
      tmp[i] = list[i];
    }

    list = tmp;
  }

  private void increaseCap() {
    int newCapacity = list.length * 2; // Doubling the capacity for efficiency
    cloneArrayWith(newCapacity);
  }

  public String toStringCustom() {
    var result = "[";

    // Only for assigned indices: i < size
    for (int i = 0; i < size; i++) {
      result += list[i];
      // Check if not last item
      if (i != size - 1)
        result += ", ";
    }

    result += "]";

    return result;
  }

}
