package com.ben.printStrategies;

import com.ben.Printer;
import com.ben.Pyramid;

/**
 * Author: Ben Olson
 * Date: 1/09/16
 * Time: 2:30 PM.
 * Course: LaunchCode Java Master Class
 * Assignment: Pset 2
 */
public class ConsoleOutput implements Printer {

    public void print(Pyramid p) {

        System.out.println(p.toString());
    }
}
