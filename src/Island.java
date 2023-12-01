public class Island extends Location{
    Island(String name, Point coordinates){
        super(name, coordinates);
    }
    public void burnInSunshine(Sun sun){
        if(sun.getPosition() != Sun.SunPosition.NIGHT){
            System.out.println(this.getName() + " пылает в лучах солнца");
        }
        else{
            System.out.println(this.getName() + " тёмен, как ночь");
        }
    }

}
