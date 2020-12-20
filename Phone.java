//I first start by declaring my package of this java file


//Next, I will make a class//
public class Phone {
    // Let's now put our 3 private instance variables//
    private String model;
    private int modelNumber;
    private String phoneBrand;

    public String getModel() {
        this.model = model;
    }

    public int getModelNumber() {
        return this.modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getPhoneBrand() {
        return this.PhoneBrand;
    }

    public void setPhoneBrand(String PhoneBrand) {
        this.PhoneBrand = phoneBrand;
    }

    // Here, this constructor will not have an argument//
    public Phone() {
        model = "E-XX";
        modelNumber = 6;
    }

    // Here, this constructor will have two arguments//
    public Phone(String model, int number) {
        this.model = model;
        this.modelNumber = number;
    }

    // Here, this constructor will have 3 arguments//
    public Phone(String model, int number, String brand) {
        this.model = model;
        this.modelNumber = 5;
        this.phoneBrand = "iPhone";
    }

    //Here, these other methods will remain as they are//

    public void on() {
        System.out.println("Phone is turned on");
    }

    public void off() {
        System.out.println("Phone is turned off");
    }

    public void ring() {
        System.out.println("Phone is ringing");
    }

    public boolean isBrandNew() {
        if (modelNumber > 8) {
            return true;
        }
        return false;
    }
}