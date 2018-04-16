package physics;

public class KinematicsSolver {
    public static float returnTime(final float velocity_initial, final float velocity_final, final float distance) {
        float timeCalculated;
        timeCalculated = (distance*2)/(velocity_final+velocity_initial);
        return timeCalculated;
    }

    public static float velocityFinal(final float velocity_initial, final float acceleration, final float distance) {
        return 1;
    }
}