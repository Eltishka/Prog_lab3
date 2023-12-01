class MummyTroll extends Passenger {
    private Color color;
    MummyTroll(String name, Place local_place, Color color) {
        super(name, local_place);
        this.color = color;
    }

    @Override
    public void moveTo(Destinationable destinationable){
        System.out.println(this.getName() + " направляется с " + this.cur_local_place + " к " + destinationable);

        this.cur_local_place = destinationable.destint();

        System.out.println(this.getName() + " приходит к " + destinationable);
    }

    public void sit(){
        System.out.println(this.getName() + " садится");
    }

    public void lookAt(Object obj){
        System.out.println(this.getName() + " смотрит на " + obj);
    }


    public void paintIn(Color color){
        System.out.println(this.getName() + " становится " + color);
        this.color = color;
    }



}
