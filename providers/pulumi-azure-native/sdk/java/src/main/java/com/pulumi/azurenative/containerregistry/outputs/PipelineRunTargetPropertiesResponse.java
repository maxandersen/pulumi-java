// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineRunTargetPropertiesResponse {
    /**
     * The name of the target.
     * 
     */
    private final @Nullable String name;
    /**
     * The type of the target.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private PipelineRunTargetPropertiesResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * The name of the target.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The type of the target.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRunTargetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRunTargetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public PipelineRunTargetPropertiesResponse build() {
            return new PipelineRunTargetPropertiesResponse(name, type);
        }
    }
}
