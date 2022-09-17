package b_practice.seminarOOP07SOLID.Ex04;


interface Callable {
    void call();
}

interface Send {
    void send();
}

interface SMS extends Send{
    @Override
    void send();
}

interface Mail extends Send{
    @Override
    void send();
}

interface Fax extends Send{
    @Override
    void send();
}

abstract class Phone implements Callable{
    abstract void Mail();
    abstract void SMS();
    abstract void Fax();
}

class Nokia3310 extends Phone{

    @Override
    public void call() {

    }

    @Override
    void Mail() {

    }

    @Override
    void SMS() {

    }

    @Override
    void Fax() {

    }
}