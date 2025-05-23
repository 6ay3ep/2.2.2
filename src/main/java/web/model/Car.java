package web.model;

public class Car {
    private String carModel;
    private int year;
    private int horsePower;

    public Car() {}

    public Car(String carModel, int year, int horsePower) {
        this.carModel = carModel;
        this.year = year;
        this.horsePower = horsePower;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setCarModel(String model) {
        this.carModel = carModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", year=" + year +
                ", horsepower=" + horsePower +
                '}';
    }
}
