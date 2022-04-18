// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.extendedlocation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomLocationPropertiesResponseAuthentication {
    /**
     * The type of the Custom Locations authentication
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private CustomLocationPropertiesResponseAuthentication(@CustomType.Parameter("type") @Nullable String type) {
        this.type = type;
    }

    /**
     * The type of the Custom Locations authentication
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLocationPropertiesResponseAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLocationPropertiesResponseAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public CustomLocationPropertiesResponseAuthentication build() {
            return new CustomLocationPropertiesResponseAuthentication(type);
        }
    }
}
