package KI30.Voitovych.Lab2;


/** Клас <code>Fur</code> описує шерсть пса */
public class Fur {
    private String state = "брудна";
    public void clean() { state = "чиста"; }
    public String getState() { return state; }
}
