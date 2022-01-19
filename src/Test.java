public class Test {

  private static int getRandomInt() {
    var min = 10000;
    var max = 99999;
    int i = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return i;
  }

  private static MembersList populateList() {
    var list = new MembersList();

    var m1 = new AdvancedMember(getRandomInt(), "John Doe", SubscLevel.JUNIOR, true);
    var m2 = new BeginnerMember(getRandomInt(), "Jane Doe", SubscLevel.RETIRED, false);
    var m3 = new JuniorMember(getRandomInt(), "George Washington", SubscLevel.JUNIOR, true);
    var m4 = new Officer(getRandomInt(), "Will Smith", SubscLevel.RETIRED, false);
    var m5 = new AdvancedMember(getRandomInt(), "Homer Simpson", SubscLevel.RETIRED, true);
    var m6 = new Officer(getRandomInt(), "Alan Turing", SubscLevel.NORMAL, true);
    var m7 = new BeginnerMember(getRandomInt(), "Fred Flintstone", SubscLevel.NORMAL, false);
    var m8 = new Officer(getRandomInt(), "Hedy Lamarr", SubscLevel.NORMAL, true);
    var m9 = new Officer(getRandomInt(), "Guido Van Rassum", SubscLevel.NORMAL, false);
    var m10 = new JuniorMember(getRandomInt(), "Mickey Mouse", SubscLevel.RETIRED, false);
    var m11 = new Officer(getRandomInt(), "Cruella de Vil", SubscLevel.JUNIOR, true);
    var m12 = new BeginnerMember(getRandomInt(), "Carl Sassenrath", SubscLevel.NORMAL, true);
    var m13 = new Officer(getRandomInt(), "Dave Coder", SubscLevel.NORMAL, true);
    var m14 = new AdvancedMember(getRandomInt(), "Barbara Liskov", SubscLevel.NORMAL, false);
    var m15 = new BeginnerMember(getRandomInt(), "Buggs Bunny", SubscLevel.NORMAL, true);
    var m16 = new JuniorMember(getRandomInt(), "Rolling Potato", SubscLevel.RETIRED, true);
    var m17 = new JuniorMember(getRandomInt(), "Brendan Eich", SubscLevel.NORMAL, false);
    var m18 = new Officer(getRandomInt(), "Elon Musk", SubscLevel.RETIRED, true);
    var m19 = new BeginnerMember(getRandomInt(), "Portless Mac", SubscLevel.JUNIOR, true);
    var m20 = new AdvancedMember(getRandomInt(), "Larry Page", SubscLevel.NORMAL, true);
    var m21 = new AdvancedMember(getRandomInt(), "Lisa Simpson", SubscLevel.NORMAL, true);
    var m22 = new AdvancedMember(getRandomInt(), "Betty Boop", SubscLevel.NORMAL, true);

    list.add(m1);
    list.add(m2);
    list.add(m3);
    list.add(m4);
    list.add(m5);
    list.add(m6);
    list.add(m7);
    list.add(m8);
    list.add(m9);
    list.add(m10);
    list.add(m11);
    list.add(m12);
    list.add(m13);
    list.add(m14);
    list.add(m15);
    list.add(m16);
    list.add(m17);
    list.add(m18);
    list.add(m19);
    list.add(m20);
    list.add(m21);
    list.add(m22);

    // Here adding 2 more than the initial capacity of ArrayListCustom
    // To test it can expand when reaching the capacity

    return list;
  }

  public static void addMembers() {
    System.err.println("\n======== Adding Members ========");
    var list = populateList();
    System.out.println("[addMembers] Number of members added: " + list.size());
  }

  public static void removeMembers() {
    System.err.println("\n======== Removing Members ========");
    var list = new MembersList();

    var t1 = new AdvancedMember(1001, "Larry Page", SubscLevel.NORMAL, false);
    var t2 = new BeginnerMember(1002, "Lisa Simpson", SubscLevel.RETIRED, true);
    var t3 = new Officer(1003, "Betty Boop", SubscLevel.NORMAL, true);

    list.add(t1);
    list.add(t2);
    list.add(t3);

    System.out.println("[removeMembers] Current number of members: " + list.size());
    System.out.println("[removeMembers] Current list items: " + list.display());
    list.removeById(9999);
    list.removeById(1002);
    System.out.println("[removeMembers] Size after removing 1 member: " + list.size());
    System.out.println("[removeMembers] List items after removing 1 member: " + list.display());
  }

  public static void sort() {
    System.err.println("\n======== Sorted List ========");

    var list = populateList();
    list.sort();
    list.report();
    System.out.println("Size: " + list.size());
  }

  public static void advancedSort() {
    System.err.println("\n======== Advanced Sort (Paid -> Id) ========");

    var list = populateList();
    list.sortAdvanced();
    list.report();
    System.out.println("Size: " + list.size());
  }
}
