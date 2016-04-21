import javax.servlet.ServletContext
import controllers.GreetingController
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    // Mount servlets.
    context.mount(new GreetingController, "/*")
  }
} 