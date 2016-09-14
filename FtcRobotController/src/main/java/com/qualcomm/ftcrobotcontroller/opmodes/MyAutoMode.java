public class MyTeleOp extends LinearOpMode {
  DcMotor leftMotor; // Declares an uninitialized DcMotor variable named leftMotor
  DcMotor rightMotor; // Declares an uninitialized DcMotor variable named rightMotor

  public void runOpMode() throws InterruptedException {
    leftMotor = hardwareMap.dcMotor.get("leftMotor"); // Initializes the variable leftMotor
    rightMotor = hardwareMap.dcMotor.get("rightMotor"); // Initilizes the variable rightMotor
    leftMotor.setDirection(DcMotor.Direction.REVERSE); // Inverts the voltages on the leftMotor
    
    waitForStart();
    leftMotor.setPower(0.5);
    rightMotor.setPower(0.5);
    sleep(2000);
    leftMotor.setPower(0);
    rightMotor.setPower(0);
  }

  public void stop() {
  // Cleanup to run when opmode disabled
  }
}
