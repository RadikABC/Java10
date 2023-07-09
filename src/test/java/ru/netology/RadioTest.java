package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void showGetNumberCurrentRadioStation() {
        Radio number = new Radio();
        number.numberCurrentRadioStation = 1;

        int expected = 1;
        int actual = number.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showSetNumberCurrentRadioStation() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(9);

        int expected = 9;
        int actual = number.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showSetNumberCurrentRadioStationMoreLimit() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = number.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showSetNumberCurrentRadioStationLessLimit() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = number.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showNextRadioStation() {
        Radio next = new Radio();
        next.nextRadioStation();

        int expected = 1;
        int actual = next.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showNextRadioStationUpperBound() {
        Radio next = new Radio();
        next.numberCurrentRadioStation = 9;
        next.nextRadioStation();

        int expected = 0;
        int actual = next.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showPrevRadioStationBottomLine() {
        Radio prev = new Radio();
        prev.prevRadioStation();

        int expected = 9;
        int actual = prev.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showPrevRadioStation() {
        Radio prev = new Radio();
        prev.numberCurrentRadioStation = 9;
        prev.prevRadioStation();

        int expected = 8;
        int actual = prev.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showGetCurrentVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 1;

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolume() {
        Radio volume = new Radio();
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolumeUpperBound() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showReduceVolumeBottomLine() {
        Radio volume = new Radio();
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showReduceVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        volume.reduceVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
