package ru.nrtology.JavaHW_OOP_2_1.radio;

public class Radio {

    private int wavesQuantity;
    private int maxWave;
    private int minWave = 0;
    private int currentWave;

    private int minVol = 0;
    private int maxVol = 100;
    private int currentVolume;

    public Radio(int wavesQuantity) {
        if (wavesQuantity < 1) {
            return;
        }
        if (wavesQuantity > 60) {
            return;
        }
        this.wavesQuantity = wavesQuantity;
        this.maxWave = wavesQuantity - 1;
    }

    public Radio() {
        this.wavesQuantity = 10;
        this.maxWave = wavesQuantity - 1;
    }

    public int getWavesQuantity() {
        return wavesQuantity;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVol() {
        return minVol;
    }

    public int getMaxVol() {
        return maxVol;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVol) {
            return;
        }
        if (newCurrentVolume > maxVol) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < minWave) {
            return;
        }
        if (newCurrentWave > maxWave) {
            return;
        }
        currentWave = newCurrentWave;
    }

    public void increaseWave() {
        if (currentWave < maxWave) {
            currentWave = currentWave + 1;
        } else {
            currentWave = minWave;
        }
    }

    public void reduceWave() {
        if (currentWave > minWave) {
            currentWave = currentWave - 1;
        } else {
            currentWave = maxWave;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVol) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVol;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVol) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVol;
        }
    }

}
