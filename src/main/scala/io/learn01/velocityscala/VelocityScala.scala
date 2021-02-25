package io.learn01.velocityscala

import com.google.inject.Inject
import com.velocitypowered.api.proxy.ProxyServer
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.event.connection.ConnectionHandshakeEvent
import com.velocitypowered.api.event.Subscribe
import org.slf4j.Logger


class VelocityScala @Inject() (server: ProxyServer, logger: Logger) {
  logger.info("This works?")

  @Subscribe
  def onProxyInitialization(event: ProxyInitializeEvent): Unit =
    logger.info("We initialized!")

  @Subscribe
  def onConnectionHandshakeEvent(event: ConnectionHandshakeEvent): Unit =
    logger.info(event.toString)
}
