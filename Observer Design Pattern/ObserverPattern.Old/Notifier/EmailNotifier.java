package ObserverPattern.Old.Notifier;

public class EmailNotifier implements INotifier {
    @Override
    public void notify(String name, String description, String fileName) {
        System.out.println(
                String.format("Notify all subscribers via EMAIL with new data" +
                                "\n\tName: %s" +
                                "\n\tDescription: %s" +
                                "\n\tFile name: %s",
                        name, description, fileName));
    }
}
