package reaktor.scct

import org.specs2.mutable._

class AppTest extends SpecificationWithJUnit {
  "App" should {
    "concatenate Strings" in {
      App.foo(Array("foo","bar")) mustEqual "foobar"
    }
    "have relevant props" in {
      println("[first] scct.basedir: "+System.getProperty("scct.basedir"))
      println("[first] scct.report.hook: "+System.getProperty("scct.report.hook"))
      println("[first] scct.project.name: "+System.getProperty("scct.project.name"))
      println("[first] scct.report.dir: "+System.getProperty("scct.report.dir"))
      println("[first] scct.source.dir: "+System.getProperty("scct.source.dir"))
      1 mustEqual 1
    }
  }
}