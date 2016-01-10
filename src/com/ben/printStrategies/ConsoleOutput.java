package com.ben.printStrategies;

import com.ben.PrintStrategy;

/**
 * Author: Ben Olson
 * Date: 1/09/16
 * Time: 2:30 PM.
 * Course: LaunchCode Java Master Class
 * Assignment: Pset 2
 */
public class ConsoleOutput implements PrintStrategy {

    public void print(String text) {
        System.out.println(text);
    }
}
