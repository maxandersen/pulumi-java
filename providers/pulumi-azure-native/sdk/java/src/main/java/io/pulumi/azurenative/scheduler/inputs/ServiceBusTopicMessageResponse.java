// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.ServiceBusAuthenticationResponse;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusBrokeredMessagePropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusTopicMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceBusTopicMessageResponse Empty = new ServiceBusTopicMessageResponse();

    /**
     * Gets or sets the Service Bus authentication.
     * 
     */
    @Import(name="authentication")
      private final @Nullable ServiceBusAuthenticationResponse authentication;

    public Optional<ServiceBusAuthenticationResponse> authentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
    }

    /**
     * Gets or sets the brokered message properties.
     * 
     */
    @Import(name="brokeredMessageProperties")
      private final @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties;

    public Optional<ServiceBusBrokeredMessagePropertiesResponse> brokeredMessageProperties() {
        return this.brokeredMessageProperties == null ? Optional.empty() : Optional.ofNullable(this.brokeredMessageProperties);
    }

    /**
     * Gets or sets the custom message properties.
     * 
     */
    @Import(name="customMessageProperties")
      private final @Nullable Map<String,String> customMessageProperties;

    public Map<String,String> customMessageProperties() {
        return this.customMessageProperties == null ? Map.of() : this.customMessageProperties;
    }

    /**
     * Gets or sets the message.
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> message() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Gets or sets the namespace.
     * 
     */
    @Import(name="namespace")
      private final @Nullable String namespace;

    public Optional<String> namespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    /**
     * Gets or sets the topic path.
     * 
     */
    @Import(name="topicPath")
      private final @Nullable String topicPath;

    public Optional<String> topicPath() {
        return this.topicPath == null ? Optional.empty() : Optional.ofNullable(this.topicPath);
    }

    /**
     * Gets or sets the transport type.
     * 
     */
    @Import(name="transportType")
      private final @Nullable String transportType;

    public Optional<String> transportType() {
        return this.transportType == null ? Optional.empty() : Optional.ofNullable(this.transportType);
    }

    public ServiceBusTopicMessageResponse(
        @Nullable ServiceBusAuthenticationResponse authentication,
        @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties,
        @Nullable Map<String,String> customMessageProperties,
        @Nullable String message,
        @Nullable String namespace,
        @Nullable String topicPath,
        @Nullable String transportType) {
        this.authentication = authentication;
        this.brokeredMessageProperties = brokeredMessageProperties;
        this.customMessageProperties = customMessageProperties;
        this.message = message;
        this.namespace = namespace;
        this.topicPath = topicPath;
        this.transportType = transportType;
    }

    private ServiceBusTopicMessageResponse() {
        this.authentication = null;
        this.brokeredMessageProperties = null;
        this.customMessageProperties = Map.of();
        this.message = null;
        this.namespace = null;
        this.topicPath = null;
        this.transportType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusTopicMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceBusAuthenticationResponse authentication;
        private @Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties;
        private @Nullable Map<String,String> customMessageProperties;
        private @Nullable String message;
        private @Nullable String namespace;
        private @Nullable String topicPath;
        private @Nullable String transportType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusTopicMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.brokeredMessageProperties = defaults.brokeredMessageProperties;
    	      this.customMessageProperties = defaults.customMessageProperties;
    	      this.message = defaults.message;
    	      this.namespace = defaults.namespace;
    	      this.topicPath = defaults.topicPath;
    	      this.transportType = defaults.transportType;
        }

        public Builder authentication(@Nullable ServiceBusAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder brokeredMessageProperties(@Nullable ServiceBusBrokeredMessagePropertiesResponse brokeredMessageProperties) {
            this.brokeredMessageProperties = brokeredMessageProperties;
            return this;
        }
        public Builder customMessageProperties(@Nullable Map<String,String> customMessageProperties) {
            this.customMessageProperties = customMessageProperties;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder topicPath(@Nullable String topicPath) {
            this.topicPath = topicPath;
            return this;
        }
        public Builder transportType(@Nullable String transportType) {
            this.transportType = transportType;
            return this;
        }        public ServiceBusTopicMessageResponse build() {
            return new ServiceBusTopicMessageResponse(authentication, brokeredMessageProperties, customMessageProperties, message, namespace, topicPath, transportType);
        }
    }
}
