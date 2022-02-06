package com;

import com.exception.ValidationFailedException;

public class StringValidator implements Validator<String> {

    @Override
    public void validate(String input) throws ValidationFailedException {
        if (!input.matches("^[A-ZА-ЯЁ].+"))
            throw new ValidationFailedException("Строка должна начинаться с заглавной буквы");
    }
}
