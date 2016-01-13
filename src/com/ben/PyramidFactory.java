package com.ben;

/**
 * Author: Ben Olson
 * Date: 1/12/16
 * Time: 5:00 PM.
 * Course: LaunchCode Java Master Class
 * Assignment: Pset 3
 */
public class PyramidFactory {

    public static Pyramid buildPyramid (int height, Printer strategy) {
        return new Pyramid(height, strategy);
    }
}
