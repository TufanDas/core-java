package oops.inheritence.multipleInheritence;

// Camera interface defines a contract that any class implementing it must fulfill.
// It ensures that every "Camera" must be able to take photos and record videos.

public interface Camera {

    // Method to take a photo. Must be implemented by the class.
    void takePhoto();

    // Method to record a video. Must be implemented by the class.
    void recordVideo();
}
