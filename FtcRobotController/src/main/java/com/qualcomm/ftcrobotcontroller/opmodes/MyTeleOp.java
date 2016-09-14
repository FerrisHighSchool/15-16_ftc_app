public class MyTeleOp extends OPMode {
  DcMotor leftMotor; // Declares an uninitialized DcMotor variable named leftMotor
  DcMotor rightMotor; // Declares an uninitialized DcMotor variable named rightMotor
  Servo arm; // Declares an uninitialized Servo variable named arm
  TouchSensor bumper; // Declares an uninitialized TouchSensor variable named bumper
  GyroSensor gyro; // Declares an uninitialized GyroSensor variable named gyro

  public MyTeleOp() {  }

  public void init() {
    leftMotor = hardwareMap.dcMotor.get("leftMotor"); // Initializes the variable leftMotor
    rightMotor = hardwareMap.dcMotor.get("rightMotor"); // Initilizes the variable rightMotor
    leftMotor.setDirection(DcMotor.Direction.REVERSE); // Inverts the voltages on the leftMotor
    arm = hardwareMap.servo.get("servoArm"); // Initilizes the variable arm
    bumper = hardwareMap.touchSensor.get("bumper"); // Initializes the variable bumper
    gyro = hardwareMap.gyroSensor.get("gyro"); // Initilizes the variable gyro
    gyro.calibrate(); // Resets the gyro sensor so straight ahead is 0 degrees.
  }
  
  public void loop() {
    //**GYRO SENSOR CONTROLS**
      telemetry.addData("gyro", gyro.getHeading()); // Returns the current heading of the gyro in degrees.
    //**PUSH SENSOR CONTROLS**
      //if (bumper.isPressed()) {
      //  arm.setPosition(0);
      //}else{
      //  arm.setPosition(1);
      //}
    //**SERVO CONTROLS**
      //if (gamepad1.a) {
      //  arm.setPosition(0);
      //}else{
      //  arm.setPosition(1);
      //}
    //**STEERING CONTROLS**
      //double throttle = gamepad1.left_stick_y; // Declares the variable throttle with the initial value of the value of the left gamepad stick y-axis
      //double turn = gamepad1.left_stick_x; // Declares the variable turn with the initial value of the value of the left gamepad stick x-axis
    
      //double leftPower = throttle - turn; // Decalres the variable leftSpeed with the initial value of the value of variable throttle - the value of the variable turn
      //double rightPower = throttle + turn; // Decalres the variable leftSpeed with the initial value of the value of variable throttle + the value of the variable turn
    
      //leftPower = Range.clip(leftPower, -1, 1);
      //rightPower = Range.clip(rightPower, -1, 1);
      
      //leftMotor.setPower(leftPower);
      //rightMotor.setPower(righPower);
    //**TANK CONTROLS**
      //leftMotor.setPower(gamepad1.left_stick_y);
      //rightMotor.setPower(gamepad1.right_stick_y);
    //**HARD CODED CONTROLS**
      //leftMotor.setPower(0.5);
      //rightMotor.setPower(0.5);
  }

  public void stop() {
  // Cleanup to run when opmode disabled
  }
}
