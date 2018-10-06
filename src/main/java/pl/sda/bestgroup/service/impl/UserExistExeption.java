package pl.sda.bestgroup.service.impl;

public class UserExistExeption extends RuntimeException {
    public UserExistExeption(String message) {
        super(message);    }
}
