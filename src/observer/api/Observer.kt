package observer.api

interface Observer {
    fun update(subject: ISubject)
}