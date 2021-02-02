public class Boeing737 extends Aircraft implements TakeOff{
    @Override
    public void fly() {
        System.out.println("Boeing737");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Boeing737 is going to vertical take off");
    }
}
