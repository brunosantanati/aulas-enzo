package me.brunosantana;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;

        while(loop) {
            String chosenLetter = JOptionPane.showInputDialog("Letra do seu nome, ou do pai ou da mãe:");

            String[] names = {"Enzo", "Bruno", "Diciane", "Iris"};

            String namesWithTheChosenLetter = getNamesWithTheChosenLetter(chosenLetter, names);

            if (chosenLetter != null) {
                if (!"".equals(namesWithTheChosenLetter)) {
                    JOptionPane.showMessageDialog(null, "Nomes que contém a letra escolhida: " + namesWithTheChosenLetter, "Acertou!", JOptionPane.INFORMATION_MESSAGE);
                    loop = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Tente novamente.", "Erroooouuuu!!!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private static String getNamesWithTheChosenLetter(String chosenLetter, String[] names) {
        String namesWithTheChosenLetter = "";

        for (String name: names) {
            if (name.toLowerCase().contains(chosenLetter.toLowerCase())) {
                namesWithTheChosenLetter += name.concat(" ");
            }
        }

        return namesWithTheChosenLetter;
    }
}