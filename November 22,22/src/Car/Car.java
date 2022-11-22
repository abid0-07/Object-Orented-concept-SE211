package Car;

public class Car {
    private String brandName;
    private String model;
    private String mileage;
    private String color;
    private String engineType;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String name){
        this.brandName = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
            this.model = model;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
            this.engineType = engineType;
    }
    public void display(){
        System.out.println("Brand Name: " +getBrandName());
        System.out.println("Model: " +getModel());
        System.out.println("Mileage: "+getMileage());
        System.out.println("Color: " +getColor());
        System.out.println("Engine Type: "+getEngineType());
    }


}
