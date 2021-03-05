package StaticAndNonStatic;

public class TestDriveWay {
    public static void main(String[] args) {
        DriveWay Ali = new DriveWay();
        Ali.setDriveWaySize(6);
        System.out.println("Ali's Drive Way Size: "+Ali.driveWaySize);
        DriveWay.prepareDriveWay();
    }
}
