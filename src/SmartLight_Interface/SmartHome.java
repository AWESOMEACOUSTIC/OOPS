package SmartLight_Interface;

import java.util.*;

public class SmartHome {

    interface SmartDevice {
        void turnOn();
        void turnOff();
        void showStatus();
    }

    static class SmartLight implements SmartDevice {
        public boolean isOn;
        public int brightness;

        public SmartLight() {
            this.brightness = 0;
            this.isOn = false;
        }

        public void turnOn() {
            System.out.println("Light has turned on..");
            this.isOn = true;
            this.brightness = 100;
        }

        public void turnOff() {
            System.out.println("Light has turned off..");
            this.isOn = false;
            this.brightness = 0;
        }

        public void showStatus() {
            if (this.isOn) {
                System.out.println("The light is currently ON with brightness " + brightness + "%");
            } else {
                System.out.println("The light is currently OFF");
            }
        }
    }

    static class SmartThermostat implements SmartDevice {
        public boolean isOn;
        private double temperature;

        public SmartThermostat() {
            this.isOn = true;
            this.temperature = 22.4;
        }

        public SmartThermostat(boolean isOn, double temperature) {
            this.isOn = isOn;
            this.temperature = temperature;
        }

        public void turnOn() {
            System.out.println("Thermostat is turned ON");
            this.isOn = true;
        }

        public void turnOff() {
            System.out.println("Thermostat is turned OFF");
            this.isOn = false;
        }

        public void showStatus() {
            if (this.isOn) {
                System.out.printf("Thermostat is ON and the current temperature is %.2f°C\n", this.temperature);
            } else {
                System.out.println("Thermostat is OFF");
            }
        }
    }

    public static void main(String[] args) {
        List<SmartDevice> devices = new ArrayList<>();

        SmartDevice light = new SmartLight();
        SmartDevice thermostat = new SmartThermostat();

        devices.add(light);
        devices.add(thermostat);

        // Turn on all devices and show status
        for (SmartDevice device : devices) {
            device.turnOn();
            device.showStatus();
        }

        System.out.println("\nTurning all devices off...\n");

        // Turn off all devices and show status again
        for (SmartDevice device : devices) {
            device.turnOff();
            device.showStatus();
        }
    }
}
