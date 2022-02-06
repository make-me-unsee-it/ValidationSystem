package com;

public interface Validator<T> {
    void validate(T input) throws ValidationFailedException;
}
