import org.specs2.mutable._
import reaktor.scct.App2

class App2Test extends SpecificationWithJUnit {
  "App2" should {
    "have a main" in {
      App2.main(Array("foo","bar")) mustEqual 0
    }
    "call First project code" in {
      App2.thisOneCallsProjectFirstDependency("foo") mustEqual "f"
    }
    "have relevant props" in {
      println("[second] scct.basedir: "+System.getProperty("scct.basedir"))
      println("[second] scct.report.hook: "+System.getProperty("scct.report.hook"))
      println("[second] scct.project.name: "+System.getProperty("scct.project.name"))
      println("[second] scct.report.dir: "+System.getProperty("scct.report.dir"))
      println("[second] scct.source.dir: "+System.getProperty("scct.source.dir"))
      1 mustEqual 1
    }
  }
}