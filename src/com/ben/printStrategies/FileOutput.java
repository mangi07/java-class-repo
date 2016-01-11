package com.ben.printStrategies;

import com.ben.Printer;
import com.ben.Pyramid;

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
public class FileOutput implements Printer {

    public void print(Pyramid p) {
        File file = new File("mario.txt");

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(file.getAbsoluteFile()))) {
            bw.write(p.toString());
        } catch (IOException e) {
            System.out.println("Could not find this file:" + e.getMessage());
        }
    }
}
