package com.tellis.cursomc;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
}
