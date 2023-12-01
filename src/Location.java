public class Location {
    private Point coordinates;
    private String name;

    Location(String name, Point coordinates){
        this.name = name;
        this.coordinates = coordinates;
    }
    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point p){
        this.coordinates = p;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location p = (Location)o;
        return p.coordinates.equals(this.coordinates);
    }
    @Override
    public int hashCode(){
        return name.hashCode() + coordinates.hashCode();
    }

}
