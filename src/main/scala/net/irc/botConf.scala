package net.irc.botConfig
import java.util.Properties
import java.io.FileInputStream
import scala.util.control.Exception._
import net.irc.loadConf._

class BotConfig {
  def nick: String = {
    loadConfig.get("nick").toString
  }

  def loginName: String = {
    loadConfig.get("login").toString
  }

  def server: String = {
    loadConfig.get("server").toString
  }

  def port: Int = {
    loadConfig.get("port").toString.toInt
  }

  def channel: String = {
    loadConfig.get("channel").toString
  }

  def usessl: Boolean = {
    loadConfig.get("usessl").toString.toBoolean
  }

  def password: Option[String] = {
    return catching(classOf[NullPointerException]) opt
      loadConfig.get("password").toString
  }

  def loadConfig: Properties = {
    val prop = new LoadConfig
    return prop.loadConf
  }
}
