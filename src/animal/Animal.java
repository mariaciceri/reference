package animal;

public class Animal
{
    public static final String[] asexualAnimals = {"flatworm","jellyfish", "sea anemone", "coral"};

    //The name you give to your pet, example: Garfield
    public String name;
    protected String scientificName;

    //constructor
    public Animal(String name)
    {
        this.name = name;
        this.scientificName = "";
    }

    //scientificName getter
    public String getScientificName()
    {
        return scientificName;
    }

    //scientificName setter
    public void setScientificName(String scientificName)
    {
        this.scientificName = scientificName;
    }

    public boolean isAsexual()
    {
        String lowerName = scientificName.toLowerCase();
        return java.util.Arrays.asList(asexualAnimals).indexOf(lowerName) != -1;
    }
}
