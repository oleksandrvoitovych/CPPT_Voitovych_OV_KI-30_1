package KI30.Voitovych.Lab3;

import KI30.Voitovych.Lab2.Dog;
import java.io.FileNotFoundException;

/**
 * Піддослідний пес — підклас Dog, реалізує ExperimentSubject
 */
public class TestDog extends Dog implements ExperimentSubject {
    private String lastReport = "";

    public TestDog(String name) throws FileNotFoundException {
        super(name);
        log.println("TestDog created: " + name);
        log.flush();
    }

    @Override
    public void prepareForExperiment(String settings) {
        System.out.println(name + " preparing: " + settings);
        log.println("prepare: " + settings);
        log.flush();
    }

    @Override
    public void performExperiment(String protocol) {
        System.out.println("Performing " + protocol + " on " + name);
        log.println("perform: " + protocol);
        lastReport = "protocol=" + protocol + "; result=OK; subject=" + name;
        log.println("result: " + lastReport);
        log.flush();
    }

    @Override
    public String getLastExperimentReport() {
        log.println("getLastExperimentReport");
        log.flush();
        return lastReport;
    }

    @Override
    public void dispose() {
        log.println("TestDog dispose: " + name);
        super.dispose();
    }
}
