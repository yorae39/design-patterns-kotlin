package observer.api

class ConcreteObserverB : Observer {
    override fun update(subject: ISubject) {
        if((subject as Subject).state == 0  || subject.state > 2) {
            println("ConcreteObserverB: Reacted to the event.")
        }
    }
}