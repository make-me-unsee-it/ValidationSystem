package com;

import com.exception.ValidationFailedException;

public interface Validator<T> {
    void validate(T input) throws ValidationFailedException;
}
