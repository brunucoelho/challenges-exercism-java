package main.java.br.com.easy.av_InternationalCallingConnoisseur;

import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    Map<Integer, String> map= new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return map;
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code, country);
    }

    public String getCountry(Integer code) {
        //Map<Integer, String> mapEmpty= new HashMap<>();
        return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (getCodes().containsKey(code) || getCodes().containsValue(country)) {
            getCodes();
        } else {
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Integer key: getCodes().keySet()) {
            if (country.equals(getCodes().get(key)))
                return key;
        }
            return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for (Integer key: getCodes().keySet()) {
            if (country.equals(getCodes().get(key))) {
                getCodes().remove(key);
                getCodes().put(code, country);
        }
        }
            return ;
      }}