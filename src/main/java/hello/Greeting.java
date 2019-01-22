package hello;

import lombok.Data;

@Data
public class Greeting {

    private final String name;
    private final String gender;
/*
PULL REQUEST DALAM STAGING

    public Greeting(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;}

    public String getName() {
        return name;
    }
*/

}