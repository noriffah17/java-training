interface Modem {

  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();

}
 

 class MindStickModem implements Modem {
                     public boolean open() {

                             // implementation
			System.out.println("Started a MindStickModem");
			return true;

                     }

                     public boolean close() {

                             // implementation
			System.out.println("Closed a MindStickModem");
			return false;

                     }

                     public int read() {

                             // implementation
			System.out.println("Reading a MindStickModem way");
			return 100;

                     }

                     public int write() {

                             // implementation
			System.out.println("Writing a MindStickModem way");
			return 100;

                     }

}

class HuaweiModem implements Modem {
                     public boolean open() {

                             // implementation
			System.out.println("Started a HuaweiModem ");
			return true;

                     }

                     public boolean close() {

                             // implementation
			System.out.println("Closed a HuaweiModem");
			return false;

                     }

                     public int read() {

                             // implementation
			System.out.println("Reading a HuaweiModem way");
			return 200;


                     }

                     public int write() {

                             // implementation
			System.out.println("Writing a HuaweiModem way");
			return 200;

                     }


}

public class ModemTesting {        //it must be public because java will call it
public static void main (String args []){ 

Modem modem1 = new MindStickModem();
modem1.open();
modem1.write();
modem1.read();
modem1.close();


Modem modem2 = new HuaweiModem();
modem2.open();
modem2.write();
modem2.read();
modem2.close();

	}
}


