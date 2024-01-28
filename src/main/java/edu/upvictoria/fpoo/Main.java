package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        Menu menu = new Menu();
        menu.selectOpc();

    }
}
