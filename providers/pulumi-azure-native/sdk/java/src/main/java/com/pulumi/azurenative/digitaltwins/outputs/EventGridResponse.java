// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventGridResponse {
    /**
     * @return EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    private final String accessKey1;
    /**
     * @return EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    private final @Nullable String accessKey2;
    /**
     * @return Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * @return Time when the Endpoint was added to DigitalTwinsInstance.
     * 
     */
    private final String createdTime;
    /**
     * @return Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    private final @Nullable String deadLetterSecret;
    /**
     * @return Dead letter storage URL for identity-based authentication.
     * 
     */
    private final @Nullable String deadLetterUri;
    /**
     * @return The type of Digital Twins endpoint
     * Expected value is &#39;EventGrid&#39;.
     * 
     */
    private final String endpointType;
    /**
     * @return The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return EventGrid Topic Endpoint
     * 
     */
    private final String topicEndpoint;

    @CustomType.Constructor
    private EventGridResponse(
        @CustomType.Parameter("accessKey1") String accessKey1,
        @CustomType.Parameter("accessKey2") @Nullable String accessKey2,
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("deadLetterSecret") @Nullable String deadLetterSecret,
        @CustomType.Parameter("deadLetterUri") @Nullable String deadLetterUri,
        @CustomType.Parameter("endpointType") String endpointType,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("topicEndpoint") String topicEndpoint) {
        this.accessKey1 = accessKey1;
        this.accessKey2 = accessKey2;
        this.authenticationType = authenticationType;
        this.createdTime = createdTime;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = endpointType;
        this.provisioningState = provisioningState;
        this.topicEndpoint = topicEndpoint;
    }

    /**
     * @return EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    public String accessKey1() {
        return this.accessKey1;
    }
    /**
     * @return EventGrid secondary accesskey. Will be obfuscated during read.
     * 
     */
    public Optional<String> accessKey2() {
        return Optional.ofNullable(this.accessKey2);
    }
    /**
     * @return Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * @return Time when the Endpoint was added to DigitalTwinsInstance.
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    public Optional<String> deadLetterSecret() {
        return Optional.ofNullable(this.deadLetterSecret);
    }
    /**
     * @return Dead letter storage URL for identity-based authentication.
     * 
     */
    public Optional<String> deadLetterUri() {
        return Optional.ofNullable(this.deadLetterUri);
    }
    /**
     * @return The type of Digital Twins endpoint
     * Expected value is &#39;EventGrid&#39;.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return The provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return EventGrid Topic Endpoint
     * 
     */
    public String topicEndpoint() {
        return this.topicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventGridResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKey1;
        private @Nullable String accessKey2;
        private @Nullable String authenticationType;
        private String createdTime;
        private @Nullable String deadLetterSecret;
        private @Nullable String deadLetterUri;
        private String endpointType;
        private String provisioningState;
        private String topicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(EventGridResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey1 = defaults.accessKey1;
    	      this.accessKey2 = defaults.accessKey2;
    	      this.authenticationType = defaults.authenticationType;
    	      this.createdTime = defaults.createdTime;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.topicEndpoint = defaults.topicEndpoint;
        }

        public Builder accessKey1(String accessKey1) {
            this.accessKey1 = Objects.requireNonNull(accessKey1);
            return this;
        }
        public Builder accessKey2(@Nullable String accessKey2) {
            this.accessKey2 = accessKey2;
            return this;
        }
        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder deadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }
        public Builder deadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder topicEndpoint(String topicEndpoint) {
            this.topicEndpoint = Objects.requireNonNull(topicEndpoint);
            return this;
        }        public EventGridResponse build() {
            return new EventGridResponse(accessKey1, accessKey2, authenticationType, createdTime, deadLetterSecret, deadLetterUri, endpointType, provisioningState, topicEndpoint);
        }
    }
}
