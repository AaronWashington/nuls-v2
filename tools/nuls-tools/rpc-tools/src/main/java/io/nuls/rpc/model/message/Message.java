/*
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package io.nuls.rpc.model.message;



/**
 * 所有消息都应该用该对象进行传输
 * All messages should be transmitted with this object
 *
 * @author tangyi
 * @date 2018/11/15
 * @description
 */

public class Message {

    /**
     * 消息号 / Message ID
     */
    private String MessageId;

    /**
     * 消息发送时间 / Message sending time
     */
    private String Timestamp;

    /**
     * 消息发送时区 / Message sending Timezone
     */
    private String Timezone;

    /**
     * 消息类型，共9种 / Message type, 9 types
     */
    private String MessageType;

    /**
     * 消息体，根据MessageType有不同的结构
     */
    private Object MessageData;

    public String getMessageId() {
        return MessageId;
    }

    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public String getTimezone() {
        return Timezone;
    }

    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    public Object getMessageData() {
        return MessageData;
    }

    public void setMessageData(Object MessageData) {
        this.MessageData = MessageData;
    }
}
