package demo

import scala.scalajs.js.annotation.JSExport
import scalacss.Defaults._
import scalacss.js._

@JSExport("Main")
object Main {

  @JSExport("main")
  def main(): Unit = {
    Styles.addToDocument()
    println(Styles.blahtable.colp.className)
  }
}
