package observer.api

interface ISubject {
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun observerNotify()
}