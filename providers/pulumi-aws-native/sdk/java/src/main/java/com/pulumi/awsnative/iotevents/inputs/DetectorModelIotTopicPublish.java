// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information required to publish the MQTT message through the AWS IoT message broker.
 * 
 */
public final class DetectorModelIotTopicPublish extends com.pulumi.resources.InvokeArgs {

    public static final DetectorModelIotTopicPublish Empty = new DetectorModelIotTopicPublish();

    /**
     * The MQTT topic of the message. You can use a string expression that includes variables (`$variable.<variable-name>`) and input values (`$input.<input-name>.<path-to-datum>`) as the topic string.
     * 
     */
    @Import(name="mqttTopic", required=true)
      private final String mqttTopic;

    public String mqttTopic() {
        return this.mqttTopic;
    }

    @Import(name="payload")
      private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> payload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    public DetectorModelIotTopicPublish(
        String mqttTopic,
        @Nullable DetectorModelPayload payload) {
        this.mqttTopic = Objects.requireNonNull(mqttTopic, "expected parameter 'mqttTopic' to be non-null");
        this.payload = payload;
    }

    private DetectorModelIotTopicPublish() {
        this.mqttTopic = null;
        this.payload = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotTopicPublish defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mqttTopic;
        private @Nullable DetectorModelPayload payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotTopicPublish defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mqttTopic = defaults.mqttTopic;
    	      this.payload = defaults.payload;
        }

        public Builder mqttTopic(String mqttTopic) {
            this.mqttTopic = Objects.requireNonNull(mqttTopic);
            return this;
        }
        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }        public DetectorModelIotTopicPublish build() {
            return new DetectorModelIotTopicPublish(mqttTopic, payload);
        }
    }
}
