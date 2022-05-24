package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean emailCheck(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("([a-zA-Z0-9-_]{3,})[a-zA-Z0-9.-_]*[@][a-zA-Z0-9]*[a-zA-Z0-9.-_]{3,}[a-zA-Z0-9.-_]*", name);
        return check;
    }

    public boolean firstName(String name) throws UserRegistrationException {
        try {
            if (name.length() < 1) {
                throw new UserRegistrationException("Contains Empty value ");
            } else {
                boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
                return check;
            }

        } catch (NullPointerException nullPointerException) {
            throw new UserRegistrationException("Is Null");
        }
    }

    public boolean lastName(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
        return check;
    }

    public boolean numberCheck(String number) throws UserRegistrationException {
        if (number == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (number.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("[9][1][\s][0-9]{10}", number);
        return check;
    }

    public boolean checkPassword(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (password.length() < 1) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9]{8,}[@$!%*?&]{1}$", password);
        return check;
    }
}
