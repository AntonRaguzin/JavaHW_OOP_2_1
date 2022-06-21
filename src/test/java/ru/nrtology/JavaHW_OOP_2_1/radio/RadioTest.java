package ru.nrtology.JavaHW_OOP_2_1.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //    Wave tests _____________________________________________________
    @Test
    public void shouldIncreaseWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(5); //currentWave = 5;

        radio.increaseWave();

        int expected = 6;
        int actual = radio.getCurrentWave(); //currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(5); //currentWave = 5;

        radio.reduceWave();

        int expected = 4;
        int actual = radio.getCurrentWave(); //currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseWaveAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentWave(9); //currentWave = 9;

        radio.increaseWave();

        int expected = 0;
        int actual = radio.getCurrentWave(); //currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceWaveBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentWave(0); //currentWave = 0;

        radio.reduceWave();

        int expected = 9;
        int actual = radio.getCurrentWave(); //currentWave;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(10);

        int expexted = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNotReduceWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(-1);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    //    Volume tests _____________________________________________________
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);//currentVolume = 5;

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume(); //currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5); //currentVolume = 5;

        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume(); //currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0); //currentVolume = 0;

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume(); //currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10); //currentVolume = 10;

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume(); //currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVol() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVol() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
