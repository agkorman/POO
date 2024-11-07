package Examenes_Viejos.Segundos.P2_2022.Ej2_Dictionary;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class MultilingualDictionary {
    private EnumMap<Language, Map<String, String>> dictionary = new EnumMap<>(Language.class);
    private final Language myLanguage;
    public MultilingualDictionary(Language language) {
        myLanguage = language;
    }

    public MultilingualDictionary addTranslation(String word, Language language, String translation) {
        if (myLanguage.equals(language)) {
            throw new IllegalArgumentException("Cannot translate to %s".formatted(language));
        }
        dictionary.putIfAbsent(language, new HashMap<>()); // Language.class es la keyType
        dictionary.get(language).putIfAbsent(word, translation);
        return this; // cuando encadena muchos .metodo es váido pq este retorna this
    }

    public String getTranslation(String word, Language language) {
        if (!dictionary.containsKey(language) || !dictionary.get(language).containsKey(word)) {
            throw new IllegalArgumentException("No %s translation for %s".formatted(language, word));
        }
        return dictionary.get(language).get(word);
    }

    public int translationsCount(Language language) {
        return dictionary.getOrDefault(language, new HashMap<>()).size();
    }

    public int removeTranslations(Language language) {
        int ans = translationsCount(language);
        dictionary.put(language, new HashMap<>());
        return ans;
    }
}
