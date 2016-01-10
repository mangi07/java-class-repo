package com.ben;

/**
 * Author: Ben Olson
 * Date: 1/09/16
 * Time: 2:30 PM.
 * Course: LaunchCode Java Master Class
 * Assignment: Pset 2
 */
public class Pyramid {

    private int height;
    PrintStrategy strategy;
    private String pyramidText;

    Pyramid (int height) {
        this.height = height;
        buildPyramid();
    }

    Pyramid (int height, PrintStrategy strategy) {
        this.height = height;
        this.strategy = strategy;
        buildPyramid();
    }

    public void setPrintStrategy (PrintStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void print () {
        strategy.print(pyramidText);
    }

    private void buildPyramid () {

        StringBuilder sb = new StringBuilder();

        for (int spaces = height - 1, hashes = 2; spaces >= 0;
             spaces--, hashes++) {

            for (int i = 0; i < spaces; i++) {
                sb.append(" ");
            }

            for (int j = 0; j < hashes; j++) {
                sb.append("#");
            }

            sb.append(System.getProperty("line.separator"));

        }

        pyramidText = sb.toString();

    }
}
