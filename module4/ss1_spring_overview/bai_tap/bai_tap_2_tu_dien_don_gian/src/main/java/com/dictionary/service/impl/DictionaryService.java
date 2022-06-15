package com.dictionary.service.impl;

import com.dictionary.service.IDictionaryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryService implements IDictionaryService {
    static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("duck", "con vịt");
        dictionary.put("dog", "con chó");
        dictionary.put("cat", "con mèo");
        dictionary.put("buffalo", "con trâu");
        dictionary.put("pig", "con lợn");
    }

    @Override
    public String translate(String word) {
        String result = dictionary.get(word);
        if (result == null) {
            result = "Not found this word in the dictionary!";
        }
        return result;
    }
}
