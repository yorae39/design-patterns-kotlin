package observer.api

class ConcreteObserverA : Observer {
    override fun update(subject: ISubject) {
        if ((subject as Subject).state < 3) {
            println("ConcreteObserverA: Reacted to the event.")
        }
    }
}