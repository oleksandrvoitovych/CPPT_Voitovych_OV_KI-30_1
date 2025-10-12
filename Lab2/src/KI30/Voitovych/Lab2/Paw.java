package KI30.Voitovych.Lab2;

/** Клас <code>Paw</code> описує лапу пса */
public class Paw {
    private boolean moving = false;
    public void move() { moving = !moving; }
    public boolean isMoving() { return moving; }
}
