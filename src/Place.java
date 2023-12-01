public class Place implements Colorable, Destinationable {
    private String name;
    private Color color;
    Place(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void paintIn(Color color){
        System.out.println(name + " становится " + color);
        this.color = color;
    }


    public Destinationable destint(){
        return this;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place p = (Place)o;
        return this.name.equals(p.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
