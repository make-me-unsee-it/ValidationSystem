package com;

public class IntegerValidator implements Validator<Integer> {

    @Override
    public void validate(Integer input) throws ValidationFailedException {
        if ((input < 1) || (input > 10))
            throw new ValidationFailedException("Числа целого типа должны принадлежать интервалу [1,10]");
    }
}
