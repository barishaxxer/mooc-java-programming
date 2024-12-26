/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author bariscankaya
 */
public class SaveableDictionary {

    private HashMap<String, String> dict;
    private String file;
    private PrintWriter writer;
    private Scanner fileReader;

    public SaveableDictionary() {
        this.dict = new HashMap<>();
    }

    public SaveableDictionary(String file) {

        this.file = file;

    }

    public void add(String words, String translation) {
        if (this.dict.containsKey(words)) {
            return;
        }
        this.dict.put(words, translation);
    }

    public String translate(String word) {
        for (String item : this.dict.keySet()) {
            if (this.dict.get(item).equals(word)) {
                return item;
            } else if (this.dict.get(word) != null) {
                return this.dict.get(word);
            }
        }

        return null;
    }

    public void delete(String word) {
        this.dict.remove(word);
    }

    public boolean load() {
        try {
            fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String[] words = fileReader.nextLine().split(":");
                String word = words[0];
                String translation = words[1];
                this.dict.put(word, translation);
                fileReader.close();

            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            writer = new PrintWriter(file);
            for (String key : this.dict.keySet()) {
                writer.println(key + ":" + this.dict.get(key));
            }

            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
