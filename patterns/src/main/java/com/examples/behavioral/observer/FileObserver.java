package com.examples.behavioral.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        File f;
        try {
            f = File.createTempFile("WeatherMeasurement", "_txt", new File("C:\\Users\\Lenovo\\IdeaProjects\\tutorials"));
            PrintWriter pw = new PrintWriter(f);
            pw.print("The weather has changed: temperature = " + temperature + ", pressure = " + pressure + ";");
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
