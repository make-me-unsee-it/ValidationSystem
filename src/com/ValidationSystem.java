package com;

class ValidationSystem {
    static void validate(String input) throws ValidationFailedException {
        Validator<String> validator = new StringValidator();
        validator.validate(input);
    }

    static void validate(Integer input) throws ValidationFailedException {
        Validator<Integer> validator = new IntegerValidator();
        validator.validate(input);
    }
}