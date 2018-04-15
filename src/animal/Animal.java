package animal;

public class Animal
{
    public static final String[] asexualAnimals = {"flatworm","jellyfish", "sea anemone", "coral"};

    public String name;
    protected String scientificName;

    //constructor
    public Animal(String name)
    {
        this.name = name;
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
        String lowerName = name.toLowerCase();
        return java.util.Arrays.asList(asexualAnimals).indexOf(lowerName) != -1;
    }
}
