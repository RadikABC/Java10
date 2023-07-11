package ru.netology;

public class Radio {
    private int numberCurrentRadioStation;
    private int currentVolume;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < 0) {
            return;
        }
        if (newNumberCurrentRadioStation > 9) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (numberCurrentRadioStation == 9) {
            numberCurrentRadioStation = 0;

        } else {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = 9;
        } else {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        } else {


        }
    }

    public void reduceVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {

        }

    }
}