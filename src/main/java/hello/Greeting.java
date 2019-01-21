package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String gender;

    public Greeting(long id, String content, String gender) {
        this.id = id;
        this.content = content;
        this.gender = gender;
    }

    public String getGender() {return gender;}

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
