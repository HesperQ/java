package com.wqyproj.ui;

import javax.swing.*;
public class MainFrame extends JFrame{

    public MainFrame(){
        initJFrame();

        initMenu();

        initImage();

        this.setVisible(true);
    }

    private void initImage() {

    }

    private void initMenu() {
        // Menu Bar
        JMenuBar menu = new JMenuBar();
        JMenu functionMenu = new JMenu("Function");
        JMenu aboutMenu = new JMenu("About Us");

        JMenuItem replayItem = new JMenuItem("replay");
        JMenuItem reloginItem = new JMenuItem("relogin");
        JMenuItem closeItem = new JMenuItem("close");
        JMenuItem accountItem = new JMenuItem("follow us");

        functionMenu.add(replayItem);
        functionMenu.add(reloginItem);
        functionMenu.add(closeItem);

        aboutMenu.add(accountItem);
        menu.add(functionMenu);
        menu.add(aboutMenu);

        this.setJMenuBar(menu);
    }

    private void initJFrame() {
        // main game interface
        //JFrame mainFrame = new JFrame();
        this.setSize(603,680);
        this.setTitle("Puzzle Game");
        //position
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3); // EXIT_ON_CLOSE
    }
}
