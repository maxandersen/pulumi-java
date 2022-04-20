// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.outputs;

import com.pulumi.azurenative.botservice.outputs.SkypeChannelPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkypeChannelResponse {
    /**
     * The channel name
     * Expected value is &#39;SkypeChannel&#39;.
     * 
     */
    private final String channelName;
    /**
     * Entity Tag of the resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The set of properties specific to Skype channel resource
     * 
     */
    private final @Nullable SkypeChannelPropertiesResponse properties;
    /**
     * Provisioning state of the resource
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private SkypeChannelResponse(
        @CustomType.Parameter("channelName") String channelName,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("properties") @Nullable SkypeChannelPropertiesResponse properties,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.channelName = channelName;
        this.etag = etag;
        this.location = location;
        this.properties = properties;
        this.provisioningState = provisioningState;
    }

    /**
     * The channel name
     * Expected value is &#39;SkypeChannel&#39;.
     * 
    */
    public String channelName() {
        return this.channelName;
    }
    /**
     * Entity Tag of the resource
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The set of properties specific to Skype channel resource
     * 
    */
    public Optional<SkypeChannelPropertiesResponse> properties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Provisioning state of the resource
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkypeChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private @Nullable String etag;
        private @Nullable String location;
        private @Nullable SkypeChannelPropertiesResponse properties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(SkypeChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder properties(@Nullable SkypeChannelPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public SkypeChannelResponse build() {
            return new SkypeChannelResponse(channelName, etag, location, properties, provisioningState);
        }
    }
}
