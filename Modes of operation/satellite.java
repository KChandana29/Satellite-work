import java.util.*;
import java.lang.*;
import java.time.LocalDateTime;

public class satellite extends Thread {

    public void start() {
        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException h) {
            System.out.println(h);
        }

        System.out.println("launching started");
        try {
            Thread.sleep(5000);
        }

        catch (InterruptedException s) {
            System.out.println(s);
        }
        System.out.println("");
        System.out.println(new Date() + "\n");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.println("t+" + i);
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        try {
            Thread.sleep(5000);
        }

        catch (InterruptedException u) {
            System.out.println(u);
        }
        System.out.println(" ");
        System.out.println("satellite deployed into the orbit successfully");
        killswitch();

    }

    public void killswitch() {
        System.out.println(" ");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("kill switch on");
        System.out.println(" ");
        
        System.out.println(new Date() + "\n");
        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException h) {
            System.out.println(h);
        }

        eps();

    }

    public void eps() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException k) {
                System.out.println(k);
            }
        }
        System.out.println("mode 0");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("eps activated");
        System.out.println(" ");
        System.out.println(new Date() + "\n");
        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException h) {
            System.out.println(h);
        }
        obc();
    }

    public void obc() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("");
        System.out.println("");

        System.out.println("on board computer activated");
        System.out.println(" ");
        System.out.println(new Date() + "\n");
        try {
            Thread.sleep(7000);

        }

        catch (InterruptedException h) {
            System.out.println(h);
        }
        antenna();

    }

    public void antenna() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("mode 1");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException m) {
            System.out.println(m);
        }
        System.out.println("the antennas are deployed");
        System.out.println(" ");
        System.out.println(new Date() + "\n");

        detumble();
    }

    public void detumble() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("mode 2");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("the satellite is in detumbling mode");
        System.out.println(" ");
        System.out.println(new Date() + "\n");
        try {
            Thread.sleep(7000);

        }

        catch (InterruptedException h) {
            System.out.println(h);
        }

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException d) {
                System.out.println(d);
            }
        }
        System.out.println("");
        System.out.println("");

        System.out.println("Satellite is stable and active now");
        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException t) {
            System.out.println(t);
        }
        sensors();

    }

    public void sensors() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(" ");
        System.out.println("");
        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException s) {
            System.out.println(s);
        }
        System.out.println("sun sensor activated at : " + new Date());
        System.out.println(" ");
        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException q) {
            System.out.println(q);
        }
        System.out.println("gyroscope activated at : " + new Date());
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        }

        catch (InterruptedException g) {
            System.out.println(g);
        }
        System.out.println("magnetometer activated at : " + new Date());
        System.out.println(" ");
        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException m) {
            System.out.println(m);
        }
        System.out.println("magnetotorquer activated at : " + new Date());
        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException u) {
            System.out.println(u);
        }
        controlalgo();

    }

    public void controlalgo() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("control algorithm in progress.....");
        System.out.println(" ");

        System.out.println(new Date() + "\n");
        System.out.println(" ");

        try {
            Thread.sleep(5000);

        }

        catch (InterruptedException t) {
            System.out.println(t);
        }
pointing();
    }

    public void pointing() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("mode 3");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException m) {
            System.out.println(m);
        }
        System.out.println("nadir pointing");
        System.out.println("pointing to earth");
        System.out.println(" ");
        System.out.println(new Date() + "\n");

        transmission();
    }

    public void transmission() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("mode 4");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException m) {
            System.out.println(m);
        }
        System.out.println("transmitting the information to the ground station");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException o) {
            System.out.println(o);
        }
        System.out.println("obc subsystem fuctioning normally......."+new Date()+"\n");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException p) {
            System.out.println(p);
        }
        System.out.println("eps subsystem fuctioning normally........"+ new Date()+"\n");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException f) {
            System.out.println(f);
        }
        System.out.println("obcomm subsystem fuctioning normally......"+new Date()+"\n");
        System.out.println(" ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            System.out.println(c);
        }
        System.out.println("adcs subsystem fuctioning normally......"+new Date()+"\n");
        System.out.println(" ");
        end();
    }

    public void end() {
        System.out.println(" ");

        for (int i = 1; i <= 15; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            }

            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("*****************************MISSION SUCCESSFUL****************************");
    }
    public static void main(String args[]) {

        satellite sat = new satellite();

        sat.start();

    }
}
