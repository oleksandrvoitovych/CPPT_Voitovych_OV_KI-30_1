package KI30.Voitovych.Lab2;

/** Клас <code>Tail</code> описує хвіст пса */
public class Tail {
    private String state = "спокійний";
    public void wag() { state = "махання"; }
    public String getState() { return state; }
}
