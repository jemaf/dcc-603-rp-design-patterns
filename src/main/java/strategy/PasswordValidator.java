package strategy;

public class PasswordValidator {

    private PasswordStrategy password;

    public PasswordValidator(){
        password=new LengthStrategy();
    }
    
    public void setStrategy(PasswordStrategy p){
        password=p;
    }
    public boolean validate(String word){

        boolean resultOfValidation = password.validate(word);

        return resultOfValidation;
    }

}
