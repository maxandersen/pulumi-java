// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * FeatureState describes the high-level state of a Feature. It may be used to describe a Feature's state at the environ-level, or per-membershop, depending on the context.
 * 
 */
public final class FeatureStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final FeatureStateResponse Empty = new FeatureStateResponse();

    /**
     * The high-level, machine-readable status of this Feature.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    /**
     * A human-readable description of the current status.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * The time this status and any related Feature-specific details were updated.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    public FeatureStateResponse(
        String code,
        String description,
        String updateTime) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private FeatureStateResponse() {
        this.code = null;
        this.description = null;
        this.updateTime = null;
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
