package les9.practicum9A;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Utils {
    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        return "€" + String.format("%." + precisie + "f", bedrag);
    }
}
