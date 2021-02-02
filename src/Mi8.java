public class Mi8 extends Helicopter implements TakeOff{
    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Helicopter Mi8 takes of vertical");
    }
}
