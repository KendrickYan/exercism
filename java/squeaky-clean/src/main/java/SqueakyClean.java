import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        String result = identifier
                .replace(' ', '_')
                .replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't')
                .replace('7', 't');

        Pattern pattern = Pattern.compile("-(\\p{Alpha})");
        result = pattern.matcher(result)
                .replaceAll(m -> m.group(1).toUpperCase());

        // replace everything except letters and underscores
        result = result.replaceAll("[^A-Za-z_]", "");

        return result;
    }
}
