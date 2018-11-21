package charsequence;

public class Gnirts implements CharSequence {
    String string = "";

    public Gnirts() {
        this.string = "this example";
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length()-1- index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
