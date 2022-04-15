// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DscConfigurationAssociationPropertyResponse {
    /**
     * Gets or sets the name of the Dsc configuration.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private DscConfigurationAssociationPropertyResponse(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * Gets or sets the name of the Dsc configuration.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DscConfigurationAssociationPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DscConfigurationAssociationPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public DscConfigurationAssociationPropertyResponse build() {
            return new DscConfigurationAssociationPropertyResponse(name);
        }
    }
}
