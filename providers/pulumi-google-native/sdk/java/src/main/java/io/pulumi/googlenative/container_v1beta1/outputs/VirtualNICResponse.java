// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class VirtualNICResponse {
    /**
     * Whether gVNIC features are enabled in the node pool.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor
    private VirtualNICResponse(@OutputCustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether gVNIC features are enabled in the node pool.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNICResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNICResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public VirtualNICResponse build() {
            return new VirtualNICResponse(enabled);
        }
    }
}
