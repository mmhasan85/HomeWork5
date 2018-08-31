package StaticVariable;

public class TestDriveWay {
    public static void main(String[] args) {
        DriveWay Hasan = new DriveWay();
        Hasan.driveWaySize = 15;
        System.out.println(Hasan.driveWaySize);

        DriveWay Rasel = new DriveWay();
        Rasel.driveWaySize = 30;
        System.out.println(Rasel.driveWaySize);

        System.out.println(Rasel.driveWaySize);

    }
}
