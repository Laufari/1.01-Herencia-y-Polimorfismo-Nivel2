public abstract class Telephone
{
    private final String    brand;
    private final String    model;

    public Telephone(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}
