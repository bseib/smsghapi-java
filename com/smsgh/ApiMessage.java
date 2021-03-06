package com.smsgh;

import java.util.Date;
import java.util.UUID;

import com.smsgh.json.JsonObject;
import com.smsgh.json.JsonValue;

/**
 * Represents an API message.
 * 
 * @author Michael Kwayisi
 */
public class ApiMessage {
	private int apiMessageType;
	private String clientReference;
	private String content;
	private String direction;
	private boolean flashMessage;
	private String from;
	private UUID messageId;
	private String networkId;
	private double rate;
	private boolean registeredDelivery;
	private String status;
	private Date time;
	private String to;
	private String udh;
	private double units;
	private Date updateTime;

	/**
	 * Initializes a new instance of this class.
	 */
	public ApiMessage() {}

	/**
	 * Used internally to intitialize the data fields of this instance.
	 * 
	 * @param json gauranteed instance of com.smsgh.json.JsonObject.
	 */
	public ApiMessage(JsonObject json) {
		JsonValue val;
		for (String name : json.names()) {
			val = json.get(name);
			switch (name.toLowerCase()) {
			case "apimessagetype":
				this.apiMessageType = val.asInt();
				break;
			case "clientreference":
				this.clientReference = val.asString();
				break;
			case "content":
				this.content = val.asString();
				break;
			case "direction":
				this.content = val.asString();
				break;
			case "flashmessage":
				this.flashMessage = val.asBoolean();
				break;
			case "from":
				this.from = val.asString();
				break;
			case "messageid":
				this.messageId = val.asUUID();
				break;
			case "networkid":
				this.networkId = val.asString();
				break;
			case "rate":
				this.rate = val.asDouble();
				break;
			case "registereddelivery":
				this.registeredDelivery = val.asBoolean();
				break;
			case "status":
				this.status = val.asString();
				break;
			case "time":
				this.time = val.asDate();
				break;
			case "to":
				this.to = val.asString();
				break;
			case "udh":
				this.udh = val.asString();
				break;
			case "units":
				this.units = val.asDouble();
				break;
			case "updatetime":
				this.updateTime = val.asDate();
				break;
			}
		}
	}

	/**
	 * Gets the API message type of this API message.
	 * 
	 * @return the API message type.
	 */
	public int getApiMessageType() {
		return this.apiMessageType;
	}

	/**
	 * Gets the client reference of this API message.
	 * 
	 * @return the client reference.
	 */
	public String getClientReference() {
		return this.clientReference;
	}

	/**
	 * Gets the content of this API message.
	 * 
	 * @return the content.
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * Gets the direction of this API message.
	 * 
	 * @return the direction.
	 */
	public String getDirection() {
		return this.direction;
	}

	/**
	 * Indicates whether this API message is flash.
	 * 
	 * @return the boolean state.
	 */
	public boolean getFlashMessage() {
		return this.flashMessage;
	}

	/**
	 * Gets the sender of this API message.
	 * 
	 * @return the sender.
	 */
	public String getFrom() {
		return this.from;
	}

	/**
	 * Gets the ID of this API message.
	 * 
	 * @return the ID.
	 */
	public UUID getMessageId() {
		return this.messageId;
	}

	/**
	 * Gets the network ID of this API message.
	 * 
	 * @return the network ID.
	 */
	public String getNetworkId() {
		return this.networkId;
	}

	/**
	 * Gets the rate of this API message.
	 * 
	 * @return the rate.
	 */
	public double getRate() {
		return this.rate;
	}

	/**
	 * Indicates whether this API message is registered delivery.
	 * 
	 * @return the boolean state.
	 */
	public boolean getRegisteredDelivery() {
		return this.registeredDelivery;
	}

	/**
	 * Gets the status of this API message.
	 * 
	 * @return the status.
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * Gets the time of this API message.
	 * 
	 * @return the time.
	 */
	public Date getTime() {
		return this.time;
	}

	/**
	 * Gets the recipient of this API message.
	 * 
	 * @return the recipient.
	 */
	public String getTo() {
		return this.to;
	}

	/**
	 * Gets the UDH of this API message.
	 * 
	 * @return the UDH.
	 */
	public String getUdh() {
		return this.udh;
	}

	/**
	 * Gets the units of this API message.
	 * 
	 * @return the units.
	 */
	public double getUnits() {
		return this.units;
	}

	/**
	 * Gets the update time of this API message.
	 * 
	 * @return the update time.
	 */
	public Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * Sets the API message type of this API message.
	 * 
	 * @param value the API message type.
	 * @return this instance of API message.
	 */
	public ApiMessage setApiMessageType(int value) {
		this.apiMessageType = value;
		return this;
	}

	/**
	 * Sets the client reference of this API message.
	 * 
	 * @param value the client reference.
	 * @return this instance of API message.
	 */
	public ApiMessage setClientReference(String value) {
		this.clientReference = value;
		return this;
	}

	/**
	 * Sets the content of this API message.
	 * 
	 * @param value the content.
	 * @return this instance of API message.
	 */
	public ApiMessage setContent(String value) {
		this.content = value;
		return this;
	}

	/**
	 * Sets a value indicating whether this API message is flash.
	 * 
	 * @param value the boolean state.
	 * @return this instance of API message.
	 */
	public ApiMessage setFlashMessage(boolean value) {
		this.flashMessage = value;
		return this;
	}

	/**
	 * Sets the sender of this API message.
	 * 
	 * @param value the sender.
	 * @return this instance of API message.
	 */
	public ApiMessage setFrom(String value) {
		this.from = value;
		return this;
	}

	/**
	 * Sets a value indicating whether this API message is registered delivery.
	 * 
	 * @param value the boolean state.
	 * @return this instance of API message.
	 */
	public ApiMessage setRegisteredDelivery(boolean value) {
		this.registeredDelivery = value;
		return this;
	}

	/**
	 * Sets the time of this API message.
	 * 
	 * @param value the time.
	 * @return this instance of API message.
	 */
	public ApiMessage setTime(Date value) {
		this.time = value;
		return this;
	}

	/**
	 * Sets the recipient number of this API message.
	 * 
	 * @param value the recipient number.
	 * @return this instance of API message.
	 */
	public ApiMessage setTo(String value) {
		this.to = value;
		return this;
	}

	/**
	 * Sets the UDH of this API message.
	 * 
	 * @param value the UDH.
	 * @return this instance of API message.
	 */
	public ApiMessage setUdh(String value) {
		this.udh = value;
		return this;
	}

	/**
	 * toJson
	 */
	public String toJson() {
		return new JsonObject().add("ApiMessageType", this.apiMessageType).add("ClientReference", this.clientReference).add("Content", this.content).add("FlashMessage", this.flashMessage).add("From", this.from).add("RegisteredDelivery", this.registeredDelivery).add("Time", this.time).add("To", this.to).add("Udh", this.udh).toString();
	}
}
