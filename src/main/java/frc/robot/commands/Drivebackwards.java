// package frc.robot.commands;

// import edu.wpi.first.math.kinematics.ChassisSpeeds;
// import edu.wpi.first.wpilibj.Timer;
// import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.subsystems.drivingSystem;

// import java.util.function.DoubleSupplier;

// public class Drivebackwards extends CommandBase {

//     // From what I can see, the values need to be read globally from the defiitions below, and we define them by just calling Drivebackwards and passing
//     //  the values.
//     private final drivingSystem m_drivetrainSubsystem;
//     private Timer movementTimer = new Timer();

//     private double m_translationXSupplier;
//     private double m_translationYSupplier;
//     private double m_rotationSupplier;

//     private boolean timerSet = false;

//     public Drivebackwards(drivingSystem drivetrainSubsystem) {
//         // The 'script'
        
//         // Reset and start timer, 'start of autonomous'
        
//         if (!timerSet) {
//             movementTimer.reset();
//             movementTimer.start();
//             timerSet = true;
//         }

//         // Set drivetrain values
//         this.m_drivetrainSubsystem = drivetrainSubsystem;
//         this.m_translationXSupplier = 0;
//         this.m_translationYSupplier = 0;
//         this.m_rotationSupplier = 0;
//         addRequirements(drivetrainSubsystem);

//         // If less then 2 seconds
//         if (movementTimer.get() < 2.0) {
//             this.m_translationXSupplier = 0;
//             this.m_translationYSupplier = 0;
//             this.m_rotationSupplier = 0.5;
//         }
//         else {
//             this.m_translationXSupplier = 0;
//             this.m_translationYSupplier = 0;
//             this.m_rotationSupplier = 0;
//         }
//     }
// }

// /* Provided Code From ChiefDelphi
// public class DefaultDriveCommand extends TimedCommand {
//     private final drivingSystem m_drivetrainSubsystem;

//     public Drivebackwards(drivingSystem drivetrainSubsystem) {
//         super(2, drivetrainSubsystem); // Run for 2 seconds
//         this.m_drivetrainSubsystem = drivetrainSubsystem;
//     }

//     @Override
//     public void execute() {
//         m_drivetrainSubsystem.drive(
//             ChassisSpeeds.fromFieldRelativeSpeeds(0, 0, 0.5
//                 m_drivetrainSubsystem.getGyroscopeRotation()
//             )
//         );
//     }

//     @Override
//     public void end(boolean interrupted) {
//         m_drivetrainSubsystem.drive(new ChassisSpeeds(0.0, 0.0, 0.0));
//     }
// }
// */