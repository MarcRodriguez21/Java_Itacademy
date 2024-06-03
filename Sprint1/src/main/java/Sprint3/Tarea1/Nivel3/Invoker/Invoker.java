package Sprint3.Tarea1.Nivel3.Invoker;

import Sprint3.Tarea1.Nivel3.Commands.Command;

public class Invoker {
        private Command start;
        private Command brake;
        private Command accelerate;

        public void setStart(Command start) {
            this.start = start;
        }

        public void setBrake(Command brake) {
            this.brake = brake;
        }

        public void setAccelerate(Command accelerate) {
            this.accelerate = accelerate;
        }

        public void executeCommands() {
            start.execute();
            brake.execute();
            accelerate.execute();
        }
    }


