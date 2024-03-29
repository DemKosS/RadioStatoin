package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioStationTest {

    @Test
    public void IncreaseVolume() {
        RadioStation station = new RadioStation();
        station.setCurrentVolume(9);
        station.shouldIncreaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    public void DecreaseVolume() {
        RadioStation station = new RadioStation();
        station.setCurrentVolume(1);
        station.shouldDecreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseStation() {
        RadioStation station = new RadioStation();
        station.setCurrentStation(8);
        station.shouldIncreaseStation();
        assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        RadioStation station = new RadioStation();
        station.setCurrentStation(1);
        station.shouldDecreaseStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax() {
        RadioStation station = new RadioStation();
        station.setCurrentStation(12);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        RadioStation station = new RadioStation();
        station.setCurrentStation(9);
        assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        RadioStation station = new RadioStation();
        station.setCurrentStation(-12);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationWhenCurrent0() {
        RadioStation station = new RadioStation();
        station.shouldDecreaseStation();
        assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        RadioStation station = new RadioStation();
        station.shouldDecreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum() {
        RadioStation station = new RadioStation();
        station.setCurrentVolume(-11);
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum() {
        RadioStation station = new RadioStation();
        station.setCurrentVolume(11);
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseStation0() {
        RadioStation station = new RadioStation();
        station.setCurrentStation(9);
        station.shouldIncreaseStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioStation station = new RadioStation();
        station.setCurrentVolume(1);
        station.shouldDecreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeMinimum() {
        RadioStation station = new RadioStation();
        station.setCurrentVolume(-1);
        assertEquals(0, station.getCurrentVolume());
    }
    @Test
    public void shouldIncreaseStation1() {
        RadioStation station = new RadioStation();
        station.setCurrentStation(9);
        station.shouldIncreaseStation();
        assertEquals(0, station.getCurrentStation());

    }
    @Test
    public void IncreaseVolumeLimit() {
        RadioStation station = new RadioStation();
        station.setCurrentVolume(10);
        station.shouldIncreaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }
}