package homework2;

public interface MobileDevice {
    public void addContact(String contactId, String phoneNumber, String firstName, String lastName);

    public void listContacts();

    public void sendMessages(String phoneNumber, String messageContent);

    public void listMessages(String phoneNumber);

    public void phoneCall(String phoneNumber);

    public void viewHistory();
}
