//      Create the HotAirBalloonApplication class and write the following instructions in its main method:
public class HotAirBalloonApplication {
    public static void main(String[] args) {
//      Create a SmallHotAirBalloon, name it smallBalloon and use its liftUp and land methods. Notice that the class
// had no code, but it’s using the code from its parent class HotAirBalloon.
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("smallBalloon --");
        smallBalloon.liftUp();
        smallBalloon.land();
//      Create a BigHotAirBalloon, name it bigBalloon and use its liftUp and land methods. Notice that the class had
// no code, but it’s using the code from its parent class HotAirBalloon.
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        System.out.println("bigBalloon --");
        bigBalloon.liftUp();
        bigBalloon.land();
//      In a new line, assign the variables smallBalloon and bigBalloon to HotAirBalloon variables called small and big
// respectively. Just use the = symbol.
        HotAirBalloon small = smallBalloon;
        HotAirBalloon big = bigBalloon;
        System.out.println("small --");
        small.liftUp();
        small.land();
        System.out.println("big --");
        big.liftUp();
        big.land();
    }
}