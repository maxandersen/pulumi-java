// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticDeliveryAttributeMappingResponse {
    /**
     * Boolean flag to tell if the attribute contains sensitive information .
     * 
     */
    private final @Nullable Boolean isSecret;
    /**
     * Name of the delivery attribute or header.
     * 
     */
    private final @Nullable String name;
    /**
     * Type of the delivery attribute or header name.
     * Expected value is &#39;Static&#39;.
     * 
     */
    private final String type;
    /**
     * Value of the delivery attribute.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private StaticDeliveryAttributeMappingResponse(
        @CustomType.Parameter("isSecret") @Nullable Boolean isSecret,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.isSecret = isSecret;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * Boolean flag to tell if the attribute contains sensitive information .
     * 
    */
    public Optional<Boolean> isSecret() {
        return Optional.ofNullable(this.isSecret);
    }
    /**
     * Name of the delivery attribute or header.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Type of the delivery attribute or header name.
     * Expected value is &#39;Static&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Value of the delivery attribute.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticDeliveryAttributeMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSecret;
        private @Nullable String name;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticDeliveryAttributeMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSecret = defaults.isSecret;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder isSecret(@Nullable Boolean isSecret) {
            this.isSecret = isSecret;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public StaticDeliveryAttributeMappingResponse build() {
            return new StaticDeliveryAttributeMappingResponse(isSecret, name, type, value);
        }
    }
}
