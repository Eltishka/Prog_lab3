public abstract class Passenger implements Colorable, Destinationable {
    protected Destinationable cur_local_place;
    private String name;

    public Destinationable destint(){
        return cur_local_place;
    }
    Passenger(String name, Place place) {
        this.name = name;
        this.cur_local_place = place;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return this.name;
    }
    public abstract void moveTo(Destinationable destinationable);

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger p = (Passenger) o;
        return this.name.equals(p.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
