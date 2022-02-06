package com;

import com.exception.ValidationFailedException;

public class ValidationSystem {
    public static void validate(String input) throws ValidationFailedException {
        Validator<String> validator = new StringValidator();
        validator.validate(input);
    }

    public static void validate(Integer input) throws ValidationFailedException {
        Validator<Integer> validator = new IntegerValidator();
        validator.validate(input);
    }
}