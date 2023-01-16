import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private double engineVolume;


    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        if (this.brand == null || this.brand == " " || this.brand == "") {
            this.brand = "default";
        }
        this.model = model;
        if (this.model == null || this.model == " " || this.model == "") {
            this.model = "default";
        }
        this.year = year;
        if (this.year == 0) {
            this.year = 2000;
        }
        this.country = country;
        if (this.country == null || this.country == " " || this.country == "") {
            this.country = "default";
        }
        this.color = color;
        if (this.color == null || this.color == " " || this.color == "") {
            this.country = "white";
        }
        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
    }


    @java.lang.Override
    public java.lang.String toString() {
        return brand + " " + model + " , " + year + " год выпуска, сборка в " + country + " ,  " + color + " цвет кузова, обьем двигателя -  " + engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(country, car.country) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, engineVolume);
    }

}
