package animal;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends Mammal
{
    public Cat(String name)
    {
        super(name);

        this.fur = FurQuantity.MEDIUM;
        this.numPaws = 4;
        this.sound = "meow";
        this.scientificName = "felis catus";
    }

    public void hunt()
    {
        String[] preyList = {"bird", "rat", "cockroach"};
        int min = 0;
        int max = preyList.length;
        int index = ThreadLocalRandom.current().nextInt(min, max);
        System.out.println(name + " brought a " + preyList[index] + ".");
    }
}
