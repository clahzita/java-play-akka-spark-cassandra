// @GENERATOR:play-routes-compiler
// @SOURCE:/home/clarissa/eclipse-workspace/java-play-akka-spark-cassandra/conf/routes
// @DATE:Mon Dec 10 19:04:23 BRT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
