// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * FeatureResourceState describes the state of a Feature *resource* in the GkeHub API. See `FeatureState` for the "running state" of the Feature in the Hub and across Memberships.
 * 
 */
public final class FeatureResourceStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final FeatureResourceStateResponse Empty = new FeatureResourceStateResponse();

    /**
     * The current state of the Feature resource in the Hub API.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public FeatureResourceStateResponse(String state) {
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private FeatureResourceStateResponse() {
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureResourceStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureResourceStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public FeatureResourceStateResponse build() {
            return new FeatureResourceStateResponse(state);
        }
    }
}
