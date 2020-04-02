package les9.practicum9A;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Utils {
    public static String euroBedrag(double bedrag) {
        if (round(bedrag, 2) % 1 == 0) {
            return "€ " + String.format("%.0f", bedrag) + ",-";
        }
        return "€ " + String.format("%.2f", bedrag);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        return "€ " + String.format("%." + precisie + "f", bedrag);
    }
}
