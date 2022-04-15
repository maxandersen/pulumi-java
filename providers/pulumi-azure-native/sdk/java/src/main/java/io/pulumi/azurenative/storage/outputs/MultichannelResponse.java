// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MultichannelResponse {
    /**
     * Indicates whether multichannel is enabled
     * 
     */
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private MultichannelResponse(@CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Indicates whether multichannel is enabled
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultichannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MultichannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public MultichannelResponse build() {
            return new MultichannelResponse(enabled);
        }
    }
}
