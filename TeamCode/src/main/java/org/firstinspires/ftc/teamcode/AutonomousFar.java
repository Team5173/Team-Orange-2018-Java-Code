package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Auton Far")
public class AutonomousFar extends LinearOpMode {
    public DcMotor leftDrive;
    public DcMotor rightDrive;
    public DcMotor liftMotor;
    public Servo wristServo;
    public Servo clampServo;

    public void runOpMode() throws InterruptedException {
        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        liftMotor = hardwareMap.dcMotor.get("liftMotor");
        wristServo = hardwareMap.servo.get("wristServo");
        clampServo = hardwareMap.servo.get("clampServo");

        waitForStart();

        //Lift goes up for 3 seconds to detatch from the lander

        wristServo.setPosition(0);
        clampServo.setPosition(0);

        liftMotor.setPower(-1);

        leftDrive.setPower(0);
        rightDrive.setPower(0);

        sleep(3000);

        //Zero Everything

        wristServo.setPosition(0);
        clampServo.setPosition(0);

        leftDrive.setPower(0);
        rightDrive.setPower(0);

        sleep(1000);
        //.75 seconds to  16 inches

        wristServo.setPosition(0);
        clampServo.setPosition(0);

        leftDrive.setPower(-1);
        rightDrive.setPower(1);

        sleep(950);

        //Zero everything

        wristServo.setPosition(0);
        clampServo.setPosition(0);

        leftDrive.setPower(0);
        rightDrive.setPower(0);

        sleep(1000);

        //Drop the arm

        wristServo.setPosition(0.55);
        clampServo.setPosition(0);

        leftDrive.setPower(0);
        rightDrive.setPower(0);

        sleep(1000);

        //releases totem

        wristServo.setPosition(0.55);
        clampServo.setPosition(0.25);

        leftDrive.setPower(0);
        rightDrive.setPower(0);

        sleep(1000);

    }

}
