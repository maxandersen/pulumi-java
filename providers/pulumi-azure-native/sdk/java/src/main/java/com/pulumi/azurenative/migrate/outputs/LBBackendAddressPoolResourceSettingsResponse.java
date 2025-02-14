// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LBBackendAddressPoolResourceSettingsResponse {
    /**
     * @return Gets or sets the backend address pool name.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private LBBackendAddressPoolResourceSettingsResponse(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * @return Gets or sets the backend address pool name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LBBackendAddressPoolResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(LBBackendAddressPoolResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public LBBackendAddressPoolResourceSettingsResponse build() {
            return new LBBackendAddressPoolResourceSettingsResponse(name);
        }
    }
}
