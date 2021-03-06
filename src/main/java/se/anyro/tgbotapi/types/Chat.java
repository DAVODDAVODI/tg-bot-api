package se.anyro.tgbotapi.types;

/**
 * @see <a href="https://core.telegram.org/bots/api#chat">Chat</a>
 */
public class Chat {
    public long id;
    public String type;
    public String title;
    public String username;
    public String first_name;
    public String last_name;
    public boolean all_members_are_admins;

    public enum Type {
        PRIVATE, GROUP, SUPERGROUP, CHANNEL
    }

    /**
     * Get the type field as an enum value.
     */
    public Type getType() {
        return Type.valueOf(type.toUpperCase());
    }
}