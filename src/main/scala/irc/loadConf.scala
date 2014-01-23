package net.cosmo0920.irc.loadConf

import java.util.Properties
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

class LoadConfig extends Properties {
  def loadConf: Properties = {
    val confFile = "conf.properties"
    checkFileExists(confFile) match {
      case Some(file) => ()
      case None => println("config file not found.")
                   sys.exit()
    }
    val prop = new java.util.Properties()
    val fis = new FileInputStream(confFile)
    val isr = new InputStreamReader(fis, "UTF-8");
    prop.load(isr)
    return prop
  }

  def checkFileExists(filename: String): Option[File] = {
    val file = new File(filename)
    if(file.exists) Some(file)
    else None
  }
}
