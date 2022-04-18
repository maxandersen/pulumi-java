// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class KubernetesDashboardResponse {
    /**
     * Whether the Kubernetes Dashboard is enabled for this cluster.
     * 
     */
    private final Boolean disabled;

    @CustomType.Constructor
    private KubernetesDashboardResponse(@CustomType.Parameter("disabled") Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * Whether the Kubernetes Dashboard is enabled for this cluster.
     * 
    */
    public Boolean disabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesDashboardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesDashboardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }        public KubernetesDashboardResponse build() {
            return new KubernetesDashboardResponse(disabled);
        }
    }
}
