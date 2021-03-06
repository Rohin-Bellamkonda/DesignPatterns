package com.epam7.DesignPatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat implements Animal {
	private static final Logger LOGGER=LogManager.getLogger(Cat.class);
    @Override
    public void eat() {
        LOGGER.debug("Cat is eating, meow!");
    }   
}