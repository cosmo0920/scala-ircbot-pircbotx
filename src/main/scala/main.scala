package net.cosmo0920

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
      case e: Exception => e.printStackTrace
    }
  }
}

object Main {
  def main(args: Array[String]) {
    new IRCBot().run
  }
}
