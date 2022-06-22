package ru.nrtology.JavaHW_OOP_2_1.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetWavesQuantity() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(30, radio.getWavesQuantity());
    }

    @Test
    public void shouldSetMaxWaves() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(29, radio.getMaxWave());
    }

    @Test
    public void shouldSetMinWave(){
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinWave());
    }

    @Test
    public void shouldNotSetBelowMinWaveQuantity(){
        Radio radio = new Radio(0);

        Assertions.assertEquals(0, radio.getWavesQuantity());
    }

    @Test
    public void shouldNotSetAboveMaxWaveQuantity(){
        Radio radio = new Radio(61);

        Assertions.assertEquals(0, radio.getWavesQuantity());
    }

    //    Wave tests _____________________________________________________
    @Test
    public void shouldIncreaseWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(5);
        radio.increaseWave();

        int expected = 6;
        int actual = radio.getCurrentWave();

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

        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(32);

        radio.reduceVolume();

        int expected = 31;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = radio.getMinVol(); //0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = radio.getMaxVol();
        int actual = radio.getCurrentVolume();

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

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
