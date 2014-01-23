package net.cosmo0920

import org.pircbotx._
import akka.actor._, akka.pattern._, akka.event._
import org.pircbotx.hooks.{Event, Listener}
import org.pircbotx.hooks.events._
import org.pircbotx.hooks.managers.ListenerManager
import org.pircbotx.hooks.types.GenericMessageEvent
import net.cosmo0920.irc.botConfFactory._

class IRCBot {
  def logging = {
    //TODO...
  }

  def run {
    val bot = BotConfFactory.create
    try {
      bot.startBot
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}

object Main {
  def main(args: Array[String]) {
    new IRCBot().run
  }
}
