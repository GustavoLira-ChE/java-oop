class Car extends Vehicle{
    private String model;
    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
