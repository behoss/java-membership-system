public class App {
    public static void main(String[] args) throws Exception {

        var list = new MembersList();
        list.add(new AdvancedMember(1234, "John Doe", "7751082129", SubscLevel.JUNIOR, true));
        list.add(new BeginnerMember(9876, "Jane Doe", "8765434567", SubscLevel.RETIRED, false));

        System.out.println(list.size());
        // list.display();

        list.removeById(1234);
        System.out.println(list.size());
        list.display();

        // var x = new AdvancedMember(1234, "John Doe", "7751082129", SubscLevel.JUNIOR,
        // true);
        // System.out.println(x.getId() + ", " + x.getName() + ", " + x.getPhoneNo() +
        // ", " + x.getSubscLevel() + ", "
        // + x.isSubscPaid());
    }
}
