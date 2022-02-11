package beans;

import lombok.Data;

@Data
public class Cat {
    private String name;
    private int age;
    private String yell = "meow";

    public void yell(String string) {
        System.out.println(string);
    }
}
