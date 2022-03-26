package observer.main

import observer.api.Broker
import observer.api.ConcreteObserverA
import observer.api.ConcreteObserverB
import observer.api.StockExchangeAction
import observer.api.Subject

fun main() {
    //testObserver()
    testObserver2()
}

fun testObserver() {

    val sea = StockExchangeAction("PETR4", 32.30 )
    val broker1 = Broker("BrokerA")
    val broker2 = Broker("BrokerB")
    val broker3 = Broker("BrokerC")

    sea.registerInterested(broker1)
    sea.registerInterested(broker2)
    sea.registerInterested(broker3)

    sea.cancelInterest(broker2)

    sea.updateValue(50.0)
}

fun testObserver2() {
    val subject = Subject()
    val observerA = ConcreteObserverA()
    subject.attach(observerA)

    val observerB = ConcreteObserverB()
    subject.attach(observerB)

    subject.someBusinessLogic()
    subject.someBusinessLogic()

    subject.detach(observerB)
    subject.someBusinessLogic()
}