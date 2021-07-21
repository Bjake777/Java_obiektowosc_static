public class Generator {
    public static String postalCodeGenerator() {
        String chars = "0123456789";
        int min = 0;
        int max = chars.length();
        int index = 0;
        StringBuilder postalCode = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            index = (int) (Math.random() * (max - min)) + min;
            if (i == 1) {
                postalCode.append(chars.charAt(index));
                postalCode.append('-');
            } else {
                postalCode.append(chars.charAt(index));
            }
        }
        return postalCode.toString();
    }
}
