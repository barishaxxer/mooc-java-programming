
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bariscankaya
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> wordList;

    public DictionaryOfManyTranslations() {

        this.wordList = new HashMap<>();

    }

    public void add(String word, String translation) {
        if (this.wordList.containsKey(word)) {
            ArrayList<String> translate = new ArrayList<>();
            translate.addAll(this.wordList.get(word));
            translate.add(translation);
            this.wordList.put(word, translate);

        } else{
            ArrayList<String> newList = new ArrayList<>();
            newList.add(translation);
            wordList.put(word, newList);
        }

    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> a = this.wordList.get(word);
        if (a == null) {
            return new ArrayList<>();

        }
        return a;
    }

    public void remove(String word) {
        this.wordList.remove(word);
    }
}
