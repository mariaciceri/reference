package animal;

public class Mammal extends Animal
{
    public static enum FurQuantity
    {
        NONE,
        LITTLE,
        MEDIUM,
        A_lOT
    }

    protected FurQuantity fur;
    protected String furColor;
    protected int numPaws;
    protected String sound;

    public Mammal(String name)
    {
        super(name);
    }

    public void setUp(FurQuantity fur, String furColor, int numPaws, String sound, String scientificName)
    {
        this.fur = fur;
        this.furColor = furColor;
        this.numPaws = numPaws;
        this.sound = sound;
        this.scientificName = scientificName;
    }

    public void speak()
    {
        System.out.println(name + " says " + sound + "!");
    }

    public String toString()
    {
        return  "Name: " + name + "\n" +
                "Scientific name: " + scientificName + "\n" +
                "Fur quantity: " + fur + "\n" +
                "Fur Color: " + furColor + "\n" +
                "Num paws: " + numPaws + "\n" +
                "Sound: " + sound + "\n" +
                "Is asexual: " + isAsexual();
    }
}
