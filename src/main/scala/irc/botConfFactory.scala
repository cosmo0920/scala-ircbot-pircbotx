package net.cosmo0920.irc.botConfFactory

import javax.net.ssl.SSLSocketFactory
import java.nio.charset.Charset
import net.csomo0920.irc.eventListener._
import org.pircbotx._
import net.cosmo0920.irc.botConfig._

object BotConfFactory {
  def create: PircBotX = {
    val charCode = Charset.forName("UTF-8")
    val conf = new BotConfig
    val config = new Configuration.Builder()
    config.setName(conf.nick)
    config.setLogin(conf.loginName)
    config.setAutoNickChange(true)
    config.getListenerManager().addListener(new eventListener)
    conf.password match {
      case Some(password) =>
        config.setServerPassword(password)
      case None => ()
    }
    config.setServer(conf.server, conf.port)
    if (conf.usessl) {
      config.setSocketFactory(SSLSocketFactory.getDefault())
    }
    config.setEncoding(charCode)
    config.addAutoJoinChannel(conf.channel)
    config.setAutoReconnect(true)
    return new PircBotX(config.buildConfiguration())
  }
}