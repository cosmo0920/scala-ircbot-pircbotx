package net.cosmo0920

import org.pircbotx._
import akka.actor._, akka.pattern._, akka.event._
import org.pircbotx.hooks.ListenerAdapter
import org.pircbotx.hooks.events.IncomingChatRequestEvent
import org.pircbotx.hooks.events.MessageEvent
import org.pircbotx.hooks.managers.ListenerManager
import org.pircbotx.hooks.types.GenericMessageEvent
import net.cosmo0920.irc.botConfFactory._

object IRCBot {
  def main(args: Array[String]) {
    val bot = BotConfFactory.create
    try {
      bot.startBot
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }

  def logging = {
    //TODO...
  }
}
