package net.irc.loadConf

import java.util.Properties
import java.io.File
import java.io.FileNotFoundException
import java.io.FileInputStream

class LoadConfig extends Properties {
  def loadConfig: Properties = {
    val confFile = "conf.properties"
    checkFileExists(confFile) match {
      case Some(file) => ()
      case None => println("config file not found.")
                   sys.exit()
    }
    val prop = new java.util.Properties()
    val fis = new FileInputStream(confFile)
    prop.load(fis)
    return prop
  }

  def checkFileExists(filename: String): Option[File] = {
    val file = new File(filename)
    if(file.exists) Some(file)
    else None
  }
}
