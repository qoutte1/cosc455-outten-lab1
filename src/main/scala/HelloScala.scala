/**
  * Created by quint on 9/2/2017.
  */
object HelloScala extends App{
  //Anonymous Functions

  def oncePerSecond(callback: () => Unit): Unit ={
    while (true) { callback(); Thread sleep 1000}
  }

  oncePerSecond(() => println("Hello, Scala!"))

}
