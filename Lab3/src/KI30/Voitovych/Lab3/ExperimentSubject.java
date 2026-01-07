package KI30.Voitovych.Lab3;

/**
 * Інтерфейс для піддослідних об'єктів
 */
public interface ExperimentSubject {
    void prepareForExperiment(String settings);
    String getLastExperimentReport();
}
