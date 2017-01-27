package com.eigenroute.plumbing

import play.api.libs.json.JsValue

trait MessageBrokerMessage {

  def messageType: MessageBrokerMessageType

}