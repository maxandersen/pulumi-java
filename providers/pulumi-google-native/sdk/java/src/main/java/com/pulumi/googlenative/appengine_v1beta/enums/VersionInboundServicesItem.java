// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum VersionInboundServicesItem {
        /**
         * Not specified.
         * 
         */
        InboundServiceUnspecified("INBOUND_SERVICE_UNSPECIFIED"),
        /**
         * Allows an application to receive mail.
         * 
         */
        InboundServiceMail("INBOUND_SERVICE_MAIL"),
        /**
         * Allows an application to receive email-bound notifications.
         * 
         */
        InboundServiceMailBounce("INBOUND_SERVICE_MAIL_BOUNCE"),
        /**
         * Allows an application to receive error stanzas.
         * 
         */
        InboundServiceXmppError("INBOUND_SERVICE_XMPP_ERROR"),
        /**
         * Allows an application to receive instant messages.
         * 
         */
        InboundServiceXmppMessage("INBOUND_SERVICE_XMPP_MESSAGE"),
        /**
         * Allows an application to receive user subscription POSTs.
         * 
         */
        InboundServiceXmppSubscribe("INBOUND_SERVICE_XMPP_SUBSCRIBE"),
        /**
         * Allows an application to receive a user&#39;s chat presence.
         * 
         */
        InboundServiceXmppPresence("INBOUND_SERVICE_XMPP_PRESENCE"),
        /**
         * Registers an application for notifications when a client connects or disconnects from a channel.
         * 
         */
        InboundServiceChannelPresence("INBOUND_SERVICE_CHANNEL_PRESENCE"),
        /**
         * Enables warmup requests.
         * 
         */
        InboundServiceWarmup("INBOUND_SERVICE_WARMUP");

        private final String value;

        VersionInboundServicesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VersionInboundServicesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
