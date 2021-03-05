package StaticAndNonStatic;

public class DriveWay {
    public static int driveWaySize;

    public static void setDriveWaySize(int driveWaySize) {
        DriveWay.driveWaySize = driveWaySize;
    }
    public static void prepareDriveWay(){
        System.out.println("Prepare drive soon");
    }
}
