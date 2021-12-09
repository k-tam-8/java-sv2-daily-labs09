package day03;

public class Caesar extends Encryption{
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int x = input.toLowerCase().charAt(i) + offset;
            if (x>122) {
                x -= 26;
            }
            char c = (char) x;
            sb.append(c);
        }
        return sb.toString();
    }
}
