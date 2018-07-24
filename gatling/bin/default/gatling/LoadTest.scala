import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class LoadTest extends Simulation {
   private val baseUrl = "http://localhost:9000"
   private val apiUrl = "http://localhost:9000/api/service"
   private val contentType = "application/json"
   private val endpoint = "/api/service"
   private val requestCount = 1000


 val httpProtocol: HttpProtocolBuilder = http
   .baseURL(baseUrl)
   .inferHtmlResources()
   .acceptHeader("*/*")
   .contentTypeHeader(contentType)
   .userAgentHeader("curl/7.54.0")

 val headers_0 = Map("Expect" -> "1000-continue")

 val scn: ScenarioBuilder = scenario("RecordedSimulation")
   .exec(http("request_0")
     .get(endpoint)
     .headers(headers_0)
     .check(status.is(200)))

 setUp(scn.inject(atOnceUsers(requestCount))).protocols(httpProtocol)
}