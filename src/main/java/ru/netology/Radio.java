package ru.netology;

public class Radio {

    public int minRadioStation = 0;
    public int maxRadioStation = 9;
    public int numberCurrentRadioStation;
    public int currentVolume;

    public Radio(int size) {
        maxRadioStation = minRadioStation + size - 1;
    }
    public Radio() {

    }

    public int getMinRadioStation() {
        return minRadioStation;
    }
    public int getMaxQuantityRadioStation() {
        return maxRadioStation;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }
    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation){
        if ( newNumberCurrentRadioStation < minRadioStation) {
            return;
        }
        if ( newNumberCurrentRadioStation > maxRadioStation) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }
    public void nextRadioStation() {
        if (numberCurrentRadioStation < maxRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
        if (numberCurrentRadioStation == maxRadioStation) {
            numberCurrentRadioStation = minRadioStation;
        }
    }
    public void prevRadioStation() {
        if (numberCurrentRadioStation > minRadioStation) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
        if (numberCurrentRadioStation == minRadioStation) {
            numberCurrentRadioStation = maxRadioStation;
        }
    }
    public int getCurrentVolume() {

        return currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
