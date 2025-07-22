package zairastra.u5w2d2.entities;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Blog {
    @Setter(AccessLevel.NONE)
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;

    public Blog(String category, String title, String cover, String content, double readingTime) {
        //non essendoci db uso Random
        Random rndm = new Random();
        this.id = rndm.nextInt();
        this.category = category;
        this.title = title;
        this.cover = cover;
        this.content = content;
        this.readingTime = readingTime;
    }
}
