package hello;

import java.util.UUID;

public class Sensor {

    private final UUID uuid;
    private  Double x;
    private  Double y;
    private  Double z;

    public Sensor(Double x, Double y, Double z) {
        this.uuid = UUID.randomUUID();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }

    public void updateVals(double x, double y, double z) {
        this.x =x;
        this.y = y;
        this.z = z;
    }


}
