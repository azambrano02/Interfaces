package principal;

import gui.MenuPrincipal;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal();
            }
        });
    }
}
