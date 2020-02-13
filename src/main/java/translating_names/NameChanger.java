package translating_names;

public class NameChanger {

    public String translateToSnakeCase(String name) {

        StringBuilder sb = new StringBuilder();

        for (char ch : name.toCharArray()) {

            if (ch != name.charAt(0) && Character.isUpperCase(ch)) {
                sb.append("_").append(ch);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString().toLowerCase();
    }

}
