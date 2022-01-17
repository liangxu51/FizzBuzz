package com.gradle.tutorial;

import org.junit.Test;

import org.junit.Assert;

public class FizzBuzzTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assert.assertEquals("1", FizzBuzzProcessor.convert(1));
        Assert.assertEquals("2", fb.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assert.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assert.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assert.assertEquals("Buzz", fb.convert(5));
    }
}