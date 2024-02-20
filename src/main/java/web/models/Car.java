package web.models;

import java.util.Objects;

public class Car {

    private String model;
    private String series;
    private String region;

    public Car(String model, String series, String region) {
        this.model = model;
        this.series = series;
        this.region = region;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(series, car.series) && Objects.equals(region, car.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, region);
    }

}
