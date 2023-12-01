public class Sun {

    public enum SunPosition{
        DAY,
        NIGHT
    }

    SunPosition position;
    Sun(SunPosition pos){
        this.position = pos;
    }

    public SunPosition getPosition() {
        return position;
    }

    public void set(){
        this.position = SunPosition.NIGHT;
        System.out.println("Солнце садится");
    }

    @Override
    public String toString(){
        return "Солнце";
    }


}
