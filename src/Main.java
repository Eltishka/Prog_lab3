public class Main {
    public static void main(String[] args) {
        Place boatNose = new Place("Нос");
        Place sail = new Place("Парус");
        MummyTroll mummyTroll = new MummyTroll("Муми-троль", boatNose, Color.GOLD);
        MummyTroll she = new MummyTroll("Фрекен Снорк", sail, Color.GOLD);
        Sun sun = new Sun(Sun.SunPosition.DAY);
        Island hattifantIsland = new Island("Остров хаттифантов", new Point(0, 10));
        Island nativeShores = new Island("Родные берега", new Point(0, 100));
        Location somewhereInOcean = new Location("Где-то в океане", new Point(-10, -10));
        Watercraft boat = new Watercraft("Лодка", new Place[]{boatNose, sail}, somewhereInOcean, nativeShores, new Passenger[]{mummyTroll, she});
        mummyTroll.lookAt(she);
        mummyTroll.moveTo(she);
        mummyTroll.sit();
        boat.paintIn(Color.GOLDENEST);
        hattifantIsland.burnInSunshine(sun);
        mummyTroll.lookAt(sun);
        she.lookAt(sun);
        sun.set();
        boat.paintIn(Color.PURPLE);
        boat.sway();
        boat.goTo(nativeShores);

    }
}