public class App {

    public static void main(String[] args) throws Exception {

        try {

            Test.addMembers();
            Test.removeMembers();
            Test.sort();
            Test.advancedSort();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
