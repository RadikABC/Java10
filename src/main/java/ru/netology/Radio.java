package ru.netology;

public class Radio {
    public int numberCurrentRadioStation;
    public int currentVolume;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }
    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation){
        if ( newNumberCurrentRadioStation < 0) {
            return;
        }
        if ( newNumberCurrentRadioStation > 9) {
            return;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }
    public void nextRadioStation() {
        if (numberCurrentRadioStation < 9) {
            numberCurrentRadioStation = numberCurrentRadioStation + 1;
        }
        if (numberCurrentRadioStation == 9) {
            numberCurrentRadioStation = 0;
        }
    }
    public void prevRadioStation() {
        if (numberCurrentRadioStation > 0) {
            numberCurrentRadioStation = numberCurrentRadioStation - 1;
        }
        if (numberCurrentRadioStation == 0) {
            numberCurrentRadioStation = 9;
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
