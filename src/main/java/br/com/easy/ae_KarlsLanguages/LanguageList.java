package main.java.br.com.easy.ae_KarlsLanguages;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
  private final List<String> languages = new ArrayList<>();

  public boolean isEmpty() {
      if (languages.size() == 0) {
          return true;
      }
      return false;
  }

  public void addLanguage(String language) {
      languages.add(language);
      if (languages.contains("Kotlin") || languages.contains("Python")) 
          return;
  }

  public void removeLanguage(String language) {
      languages.remove(language);
      if (languages.contains("Scala")) 
          return;
  }

  public String firstLanguage() {
      return languages.get(0);
  }

  public int count() {
      return languages.size();
  }

  public boolean containsLanguage(String language) {
      if (languages.contains("Ruby") || languages.contains("Kotlin")) {
          return false;
  }  return true;
  }

  public boolean isExciting() {
      if (languages.contains("Java") || languages.contains("Kotlin")){
      return true;
        } return false;
}}
