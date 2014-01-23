package net.csomo0920.irc.eventListener

import org.pircbotx.PircBotX
import org.pircbotx.hooks.ListenerAdapter
import org.pircbotx.hooks.events._
import java.util.Date

class eventListener extends ListenerAdapter[PircBotX] {
  override def onMessage(event: MessageEvent[PircBotX]) {
    if (event.getMessage().equals("?hello"))
      event.respond("Hello World!");
    if (event.getMessage().equals(".time"))
      event.respond("The current time is " + new Date())
  }
}