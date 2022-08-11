package com.example.spring_auth.demo.regisration;

import java.util.function.Predicate;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //TODO: Regex to validate email
        return true;
    }
}
