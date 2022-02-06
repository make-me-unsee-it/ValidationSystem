package com;

class ValidationSystem {
    static void validate(Object input) throws ValidationFailedException {
        if (input.getClass() == String.class) {
            Validator<String> validator = new StringValidator();
            validator.validate((String) input);
        }
        if (input.getClass() == Integer.class) {
            Validator<Integer> validator = new IntegerValidator();
            validator.validate((Integer) input);
        }
    }
}