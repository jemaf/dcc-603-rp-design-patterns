package strategy;

public class SpecialCharStrategy extends PasswordStrategy{
    @Override
    public boolean validate(String password) {
        return password.contains("*") ||
                password.contains("!") ||
                password.contains("@") ||
                password.contains("#") ||
                password.contains("$") ||
                password.contains("%") ||
                password.contains("^") ||
                password.contains("&") ||
                password.contains("(") ||
                password.contains(")") ||
                password.contains("_") ||
                password.contains("+") ||
                password.contains("=") ||
                password.contains("-") ||
                password.contains("{") ||
                password.contains("}") ||
                password.contains("[") ||
                password.contains("]") ||
                password.contains(":") ||
                password.contains(";") ||
                password.contains("\"") ||
                password.contains("'") ||
                password.contains("<") ||
                password.contains(">") ||
                password.contains(",") ||
                password.contains(".") ||
                password.contains("?") ||
                password.contains("/") ||
                password.contains("\\") ||
                password.contains("|") ||
                password.contains("~") ||
                password.contains("`");
    }
}