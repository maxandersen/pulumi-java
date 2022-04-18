// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.MaintenanceWindowResponse;
import java.lang.String;
import java.util.Objects;


/**
 * MaintenancePolicy defines the maintenance policy to be used for the cluster.
 * 
 */
public final class MaintenancePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final MaintenancePolicyResponse Empty = new MaintenancePolicyResponse();

    /**
     * A hash identifying the version of this policy, so that updates to fields of the policy won't accidentally undo intermediate changes (and so that users of the API unaware of some fields won't accidentally remove other fields). Make a `get()` request to the cluster to get the current resource version and include it with requests to set the policy.
     * 
     */
    @Import(name="resourceVersion", required=true)
      private final String resourceVersion;

    public String resourceVersion() {
        return this.resourceVersion;
    }

    /**
     * Specifies the maintenance window in which maintenance may be performed.
     * 
     */
    @Import(name="window", required=true)
      private final MaintenanceWindowResponse window;

    public MaintenanceWindowResponse window() {
        return this.window;
    }

    public MaintenancePolicyResponse(
        String resourceVersion,
        MaintenanceWindowResponse window) {
        this.resourceVersion = Objects.requireNonNull(resourceVersion, "expected parameter 'resourceVersion' to be non-null");
        this.window = Objects.requireNonNull(window, "expected parameter 'window' to be non-null");
    }

    private MaintenancePolicyResponse() {
        this.resourceVersion = null;
        this.window = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenancePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceVersion;
        private MaintenanceWindowResponse window;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenancePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.window = defaults.window;
        }

        public Builder resourceVersion(String resourceVersion) {
            this.resourceVersion = Objects.requireNonNull(resourceVersion);
            return this;
        }
        public Builder window(MaintenanceWindowResponse window) {
            this.window = Objects.requireNonNull(window);
            return this;
        }        public MaintenancePolicyResponse build() {
            return new MaintenancePolicyResponse(resourceVersion, window);
        }
    }
}
