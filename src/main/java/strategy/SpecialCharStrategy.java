package strategy;

import java.lang.annotation.Inherited;

public class SpecialCharStrategy extends PasswordStrategy{
    private static final String CARACTERES_ESPECIAIS = "!@#$%^&*()_+-=[]{};':\"\\|,.<>/?~`";
    @Override
    public boolean validate(String password){
        if (password == null || password.isEmpty()) {
            return false;
        }
        return password.chars().anyMatch(charCode -> CARACTERES_ESPECIAIS.indexOf(charCode) != -1);
    }
}
