import java.util.Objects;

public class Point {
    private double latitude, longtitude;

    Point(double latitude, double longtitude){
        if(latitude <=  90 && latitude >= -90){
            this.latitude = latitude;
        }
        if(latitude <=  180 && latitude >= -180){
            this.latitude = latitude;
        }
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongtitude(){
        return this.longtitude;
    }

    @Override
    public String toString(){
        return Double.toString(this.latitude) + ", " + Double.toString(this.latitude);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point p = (Point)o;
        return (this.latitude == p.latitude && this.longtitude == p.longtitude);
    }

    @Override
    public int hashCode(){
        return (int)(this.latitude + this.longtitude);
    }
}
