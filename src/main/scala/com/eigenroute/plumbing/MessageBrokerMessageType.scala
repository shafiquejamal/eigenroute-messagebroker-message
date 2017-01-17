package com.eigenroute.plumbing

import play.api.libs.json.JsValue

trait MessageBrokerMessageType {

  def toMessageBrokerMessage(msg: JsValue): Option[MessageBrokerMessage]

}