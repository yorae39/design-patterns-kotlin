package observer.api

import kotlin.random.Random

class Subject : ISubject {

    var state: Int = 0

    private var observers = ArrayList<Observer>()

    override fun attach(observer: Observer) {
        println("Subject: Attached an observer")
        this.observers.add(observer)
    }

    override fun detach(observer: Observer) {
        this.observers.remove(observer)
        println("Subject: Detached an observer.")
    }

    override fun observerNotify() {
        println("Subject: Notifying observers...")
        for (obs in this.observers) {
            obs.update(this)
        }
    }

    fun someBusinessLogic() {
        println("\nSubject: I'm doing something important")
        this.state = Random.nextInt(0, 10)
        Thread.sleep(15)
        println("Subject: My state has just changed to: ${this.state}")
        this.observerNotify()
    }
}