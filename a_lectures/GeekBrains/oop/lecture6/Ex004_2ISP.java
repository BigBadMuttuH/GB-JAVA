package a_lectures.GeekBrains.oop.lecture6;// Interface segregation principle
// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex004_2ISP {
    public static void main(String[] args) {
        List<BasePhone> phones1 = new ArrayList<BasePhone>();
        phones1.add(new IPhone());
        phones1.add(new Nokia3311());
        for (BasePhone basePhone : phones1) {
            basePhone.Call();
        }

        List<Fax> phones2 = new ArrayList<>();
        phones2.add(new IPhone());
        // а вот так прокатить - скастовать до
//        phones2.add((Fax) new Nokia3311());
    }
}

interface BasePhone {
    void Call();
    void SendSMS();
}

interface Fax {
    void SendFax();

}

interface EMail {
    void SendEMail();
}

class IPhone implements BasePhone, Fax, EMail {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {
       

    }

    @Override
    public void SendEMail() {
        

    }

    @Override
    public void SendFax() {
    }
}

class Nokia3311 implements BasePhone {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {

    }
}