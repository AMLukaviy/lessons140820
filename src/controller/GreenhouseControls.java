package controller;

public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) {super(delayTime);}
        public void action() {
            light = true;
        }
        public String toString() { return "Light On";}
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime);}
        public void action() {
            light = false;
        }
        public String toString() { return "Light Off";}
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime);}
        public void action() {
            water = true;
        }
        public String toString() {
            return "Watering On";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) { super(delayTime);}
        public void action() {
            water = false;
        }
        public String toString() {
            return "Watering Off";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) { super(delayTime);}
        public void action() {
            thermostat = "Night";
        }
        public String toString() {
            return "Thermostat in night mode";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) { super(delayTime);}
        public void action() {
            thermostat = "Day";
        }

        public String toString() {
            return "Thermostat in day mode";
        }
    }

    //Example of method action()? that insert a new copy of itself in event list:
    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime);}
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Boom!";}
    }

    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString() {
            return "Restart of the system";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime);}
        public void action() { System.exit(0);}
        public String toString() {return "Shutdown";}
    }
}
