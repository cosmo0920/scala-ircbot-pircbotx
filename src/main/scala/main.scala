package scala.main

import org.pircbotx._
import akka.actor._, akka.pattern._, akka.event._
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.IncomingChatRequestEvent;
import org.pircbotx.hooks.events.MessageEvent;
import org.pircbotx.hooks.managers.ListenerManager;
import org.pircbotx.hooks.types.GenericMessageEvent;
import net.irc.botConfFactory._;

object IRCBot {
  def main(args: Array[String]) {
    val botConf = new BotConfFactory
    val bot = botConf.botConfFactory
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
