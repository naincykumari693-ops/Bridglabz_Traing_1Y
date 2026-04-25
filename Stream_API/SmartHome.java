interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        LightAction motionDetected = () -> System.out.println("Lights ON (Motion detected)");
        LightAction nightTime = () -> System.out.println("Dim lights (Night mode)");
        LightAction voiceCommand = () -> System.out.println("Lights OFF (Voice command)");

        // Simulating triggers
        triggerAction("motion", motionDetected);
        triggerAction("night", nightTime);
        triggerAction("voice", voiceCommand);
    }

    static void triggerAction(String trigger, LightAction action) {
        System.out.print("Trigger: " + trigger + " -> ");
        action.execute();
    }
}