package oops.inheritence.multipleInheritence;

// SmartPhone class implements multiple interfaces: Camera, MusicPlayer, and Phone.
// This demonstrates multiple inheritance using interfaces in Java.

public class SmartPhone implements Camera, MusicPlayer, Phone {

    // Implementation of Camera interface method to take a photo.
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smart phone.");
    }

    // Implementation of Camera interface method to record a video.
    @Override
    public void recordVideo() {
        System.out.println("Recording video with smart phone.");
    }

    // Implementation of MusicPlayer interface method to play music.
    @Override
    public void playMusic() {
        System.out.println("Playing music on smart phone.");
    }

    // Implementation of MusicPlayer interface method to stop music.
    @Override
    public void stopMusic() {
        System.out.println("Stopping music on smart phone.");
    }

    // Implementation of Phone interface method to make a call.
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " from smart phone.");
    }

    // Implementation of Phone interface method to end a call.
    @Override
    public void endCall() {
        System.out.println("Ending call on smart phone.");
    }
}
