package ObserverPattern.New.Base;

public abstract class Observer {
    protected Subject subject;
    public abstract void notify(Object arg);
}
