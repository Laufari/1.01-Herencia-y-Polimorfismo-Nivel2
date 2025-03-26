
public class Smartphone extends Telephone implements Camera, Watch {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void Photo() {
        System.out.println("taking a photo");
    }
    @Override
    public void Alarm()
    {
        System.out.println("an alarm is ringing");
    }

    @Override
    public String toString() {
        return "[Smartphone]" +
                " [BRAND = " + getBrand() + "]" +
                " [MODEL = " + getModel() + "]";
    }
}
