package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void showGetNumberCurrentRadioStation() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(1);

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
    public void showNextRadioStation8() {
        Radio next = new Radio();
        next.setNumberCurrentRadioStation(8);
        next.nextRadioStation();

        int expected = 9;
        int actual = next.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showNextRadioStation10() {
        Radio next = new Radio();
        next.setNumberCurrentRadioStation(10);
        next.nextRadioStation();

        int expected = 1;
        int actual = next.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showNextRadioStationUpperBound() {
        Radio next = new Radio();
        next.setNumberCurrentRadioStation(9);
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
        prev.setNumberCurrentRadioStation(9);
        prev.prevRadioStation();

        int expected = 8;
        int actual = prev.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showGetCurrentVolume() {
        Radio volume = new Radio();
        volume.getCurrentVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showSetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showSetCurrentVolumeUpperBound() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showSetCurrentVolumeBottomLine() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showIncreaseVolume1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.increaseVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolume2() {
        Radio volume = new Radio();
        volume.setCurrentVolume(2);
        volume.increaseVolume();

        int expected = 3;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolume98() {
        Radio volume = new Radio();
        volume.setCurrentVolume(98);
        volume.increaseVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolume99() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolume101() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolume0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showIncreaseVolumeUpperBound() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
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
    public void showReduceVolume100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.reduceVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showReduceVolume1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showReduceVolume101() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
