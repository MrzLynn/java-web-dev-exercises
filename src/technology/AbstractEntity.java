package technology;

import java.util.concurrent.ThreadLocalRandom;

public class AbstractEntity {
    private int Id;

    public AbstractEntity() {
        this.Id = ThreadLocalRandom.current().nextInt(0,100+1);

    }

    public int getId() {
        return Id;
    }
}

