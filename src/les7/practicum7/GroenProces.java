package les7.practicum7;

public class GroenProces implements OpmaakProces {
    public String maakOp(String input) {
        return "\033[32m" + input + "\033[30m";
    }
}
