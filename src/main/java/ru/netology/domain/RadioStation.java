package ru.netology.domain;


public class RadioStation {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;
    private int minStation;
    private int minVolume;

    public RadioStation(int currentStation, int maxStation, int minStation, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;

    }

    public RadioStation() {
    }


    public void shouldIncreaseVolume() {

        if (currentVolume == maxVolume) {
            return;
        }
        ++currentVolume;
    }

    public void shouldDecreaseVolume() {

        if (currentVolume == minVolume) {
            return;
        }
        --currentVolume;
    }

    public void shouldIncreaseStation() {

        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        ++currentStation;
    }

    public void shouldDecreaseStation() {

        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        --currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation || currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume || currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }
}