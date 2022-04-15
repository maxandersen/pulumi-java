// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.OriginGroupOverrideActionParametersResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the origin group override action for the delivery rule.
 * 
 */
public final class OriginGroupOverrideActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final OriginGroupOverrideActionResponse Empty = new OriginGroupOverrideActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'OriginGroupOverride'.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
      private final OriginGroupOverrideActionParametersResponse parameters;

    public OriginGroupOverrideActionParametersResponse parameters() {
        return this.parameters;
    }

    public OriginGroupOverrideActionResponse(
        String name,
        OriginGroupOverrideActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private OriginGroupOverrideActionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginGroupOverrideActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private OriginGroupOverrideActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginGroupOverrideActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(OriginGroupOverrideActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public OriginGroupOverrideActionResponse build() {
            return new OriginGroupOverrideActionResponse(name, parameters);
        }
    }
}
