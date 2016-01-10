package com.ben.printStrategies;

import com.ben.PrintStrategy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: Ben Olson
 * Date: 1/09/16
 * Time: 2:30 PM.
 * Course: LaunchCode Java Master Class
 * Assignment: Pset 2
 */
public class FileOutput implements PrintStrategy {

    public void print(String text) {
        File file = new File("mario.txt");

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(file.getAbsoluteFile()))) {
            bw.write(text);
        } catch (IOException e) {
            System.out.println("Could not find this file:" + e.getMessage());
        }
    }
}
