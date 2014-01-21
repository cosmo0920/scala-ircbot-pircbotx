package net.irc.botConfig
import java.util.Properties
import java.io.FileInputStream
import scala.util.control.Exception._
import net.irc.loadConf._

class BotConfig {
  def nick: String = {
    return loadConfig.get("nick").toString
  }

  def realname: String = {
    return loadConfig.get("realname").toString
  }

  def server: String = {
    return loadConfig.get("server").toString
  }

  def port: Int = {
    return loadConfig.get("port").toString.toInt
  }

  def channel: String = {
    return loadConfig.get("channel").toString
  }

  def usessl: Boolean = {
    return loadConfig.get("usessl").toString.toBoolean
  }

  def password: Option[String] = {
    return catching(classOf[NullPointerException]) opt
      loadConfig.get("password").toString
  }

  def loadConfig: Properties = {
    val prop = new LoadConfig
    return prop.loadConfig
  }
}
