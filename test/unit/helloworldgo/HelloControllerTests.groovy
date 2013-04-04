package helloworldgo



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerTests {

    void testSomething() {
       // fail "Implement me"
       controller.index()
       assert response.text == 'Hello World!'
    }
}
