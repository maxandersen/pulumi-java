// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssetModelAttribute {
    private final @Nullable String defaultValue;

    @CustomType.Constructor
    private AssetModelAttribute(@CustomType.Parameter("defaultValue") @Nullable String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }        public AssetModelAttribute build() {
            return new AssetModelAttribute(defaultValue);
        }
    }
}
