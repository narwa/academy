package hello;

public class Greeting {

    private final String content;
    private final String gender;

    public Greeting(String content, String gender) {
        this.content = content;
        this.gender = gender;
    }

    public String getGender() {return gender;}

    public String getContent() {
        return content;
    }
}
