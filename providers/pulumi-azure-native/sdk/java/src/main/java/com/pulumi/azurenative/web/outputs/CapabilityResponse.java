// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapabilityResponse {
    /**
     * @return Name of the SKU capability.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Reason of the SKU capability.
     * 
     */
    private final @Nullable String reason;
    /**
     * @return Value of the SKU capability.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private CapabilityResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.reason = reason;
        this.value = value;
    }

    /**
     * @return Name of the SKU capability.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Reason of the SKU capability.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * @return Value of the SKU capability.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String reason;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CapabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.reason = defaults.reason;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public CapabilityResponse build() {
            return new CapabilityResponse(name, reason, value);
        }
    }
}
