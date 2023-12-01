public class Watercraft implements Colorable {
    private Location curLocation;
    private String name;
    private Color color;
    private Location destination;
    private Place[] parts;
    private Passenger[] passengers;

    Watercraft(String name, Place[] parts, Location location, Location destination, Passenger[] passengers){
        this.curLocation = location;
        this.name = name;
        this.destination = destination;
        this.passengers = passengers;
        this.parts = parts;
    }

    public void setCurLocation(Location loc){
        this.curLocation = loc;
    }

    public void goTo(Location destination){
        this.destination = destination;
        System.out.println(name + " идет к " + destination);
    }

    public void sway(){
        System.out.println(name + " покачивается ");
    }

    public void paintIn(Color color){
        this.color = color;
        System.out.println(name + " окрашивается " + color);
        for(Place part: parts){
            part.paintIn(color);
        }
        for(Passenger passenger: passengers){
            passenger.paintIn(color);
        }
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Watercraft w = (Watercraft) o;
        return this.name.equals(w.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode() + parts.length;
    }
}
