package dph01

import org.specs2.mutable._

class UserTest extends SpecificationWithJUnit {
  "Box.Full" should {
    "access only one side" in {
      User.f mustEqual 1
    }
  }
}
