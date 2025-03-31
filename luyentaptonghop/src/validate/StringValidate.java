package validate;

public class StringValidate {
    // ràng buộc độ dài
    int maxLength;
    int minLength;

    public StringValidate(int maxLength, int minLength) {
        this.maxLength = maxLength;
        this.minLength = minLength;
    }

    public boolean isValid(String input) {
        return input.length() >= minLength && input.length() <= maxLength; // true nếu thỏa mãn
    }

    public String getErrorMessage(){
        return "The string must be between " + minLength + " and " + maxLength + " characters long.";
    }
}
