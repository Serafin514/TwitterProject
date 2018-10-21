package pl.sda.bestgroup.exeptions;

public class UserExistExeption extends RuntimeException {
    public UserExistExeption(String message) {
        super(message);    }
}
