package control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import control.Function;
import java.util.*;

/**
 *
 * @author nam142857
 */
public class Substitution_Algo implements Function {

    private ArrayList<Character> originList;
    private ArrayList<Character> cipherList;
    private char character;
    private char letter[];
    private Random random;

    public Substitution_Algo() {
        this.originList = new ArrayList<>();
        this.cipherList = new ArrayList<>();
        this.character = ' ';
        this.random = new Random();
    }

    @Override
    public void setNewKey() {
        character = ' ';
        originList.clear();
        cipherList.clear();
        for (int i = 32; i < 127; i++) {
            originList.add(Character.valueOf(character));
            character++;
        }
        cipherList = new ArrayList<>(originList);
        Collections.shuffle(cipherList);
        System.out.println("New key has been created ! ");
    }

    @Override
    public void getCurrentKey() {
        for (Character x : originList) {
            System.out.print(x);
        }
        System.out.println("");
        for (Character x : cipherList) {
            System.out.print(x);
        }
        System.out.println("");
    }

    @Override
    public void encrypt() {
        String userMessage = Valid_Input.valid_message("encrypt");
        letter = userMessage.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < originList.size(); j++) {
                if (originList.get(j) == letter[i]) {
                    letter[i] = cipherList.get(j);
                    break;
                }
            }
        }
        System.out.print("Encrypted message : ");
        for (char c : letter) {
            System.out.print(c);
        }
        System.out.println();
    }

    @Override
    public void decrypt() {
        String userMessage = Valid_Input.valid_message("decrypt");
        letter = userMessage.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < cipherList.size(); j++) {
                if (cipherList.get(j) == letter[i]) {
                    letter[i] = originList.get(j);
                    break;
                }
            }
        }
        System.out.print("Decrypted message : ");
        for (char c : letter) {
            System.out.print(c);
        }
        System.out.println();
    }

}
