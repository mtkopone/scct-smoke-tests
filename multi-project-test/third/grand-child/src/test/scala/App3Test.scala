import org.specs2.mutable._
import reaktor.scct.App2
import reaktor.scct.App3

class App3Test extends SpecificationWithJUnit {
  "App3" should {
    "have a main" in {
      val arr = Array("foo","bar")
      val result = App3.main(arr)
      result mustEqual 0
    }
    "be able to call App2 dependency" in {
      App2.heresAMethodThatGetsCalledByADependentProjectDuringItsTests(Array("Its", "a", "fucking", "crime")) mustEqual "/Its/a/fucking/crime"
    }
    "have relevant props" in {
      println("[grand-child] scct.basedir: "+System.getProperty("scct.basedir"))
      println("[grand-child] scct.report.hook: "+System.getProperty("scct.report.hook"))
      println("[grand-child] scct.project.name: "+System.getProperty("scct.project.name"))
      println("[grand-child] scct.report.dir: "+System.getProperty("scct.report.dir"))
      println("[grand-child] scct.source.dir: "+System.getProperty("scct.source.dir"))
      println("[grand-child] class-path: "+System.getProperty("java.class.path"))
      1 mustEqual 1
    }
  }
}