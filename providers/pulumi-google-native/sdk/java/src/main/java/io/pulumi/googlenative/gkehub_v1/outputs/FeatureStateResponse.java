// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FeatureStateResponse {
    /**
     * The high-level, machine-readable status of this Feature.
     * 
     */
    private final String code;
    /**
     * A human-readable description of the current status.
     * 
     */
    private final String description;
    /**
     * The time this status and any related Feature-specific details were updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private FeatureStateResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.code = code;
        this.description = description;
        this.updateTime = updateTime;
    }

    /**
     * The high-level, machine-readable status of this Feature.
     * 
    */
    public String code() {
        return this.code;
    }
    /**
     * A human-readable description of the current status.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The time this status and any related Feature-specific details were updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String description;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public FeatureStateResponse build() {
            return new FeatureStateResponse(code, description, updateTime);
        }
    }
}
