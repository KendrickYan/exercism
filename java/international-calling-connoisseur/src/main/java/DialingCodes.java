import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> countryCodeMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return Map.copyOf(countryCodeMap);
    }

    public void setDialingCode(Integer code, String country) {
        countryCodeMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return countryCodeMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (
                !countryCodeMap.containsKey(code) &&
                !countryCodeMap.containsValue(country)
        )
            setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry: countryCodeMap.entrySet()) {
            if (country.equals(entry.getValue()))
                return entry.getKey();
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        if (oldCode != null) {
            countryCodeMap.remove(oldCode);
            countryCodeMap.put(code, country);
        }
    }
}
