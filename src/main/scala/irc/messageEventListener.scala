package net.cosmo0920.irc.messageEventListener

import org.pircbotx.PircBotX
import org.pircbotx.hooks.ListenerAdapter
import org.pircbotx.hooks.events._
import net.cosmo0920.irc.version._
import net.cosmo0920.irc.botConfig._
import java.util.Date

class messageEventListener extends ListenerAdapter[PircBotX] {
  override def onMessage(event: MessageEvent[PircBotX]) {
    if (event.getMessage.equals("?hello"))
      event.respond("Hello World!")
    if (event.getMessage.equals(".time"))
      event.respond("The current time is " + new Date)
    if (event.getMessage.equals("?version")) {
      val conf = new BotConfig
      event.respond(conf.nick + " version is " + Version.string + " now.")
    }
  }
}
