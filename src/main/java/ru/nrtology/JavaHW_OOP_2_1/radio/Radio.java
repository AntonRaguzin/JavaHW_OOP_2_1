package ru.nrtology.JavaHW_OOP_2_1.radio;

public class Radio {
    private int currentVolume;
    private int currentWave;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            return;
        }
        if (newCurrentWave > 9) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void increaseWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }
    }

    public void reduceWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
