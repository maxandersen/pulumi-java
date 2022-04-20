// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.container_v1beta1.inputs.MaintenanceWindowArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MaintenancePolicy defines the maintenance policy to be used for the cluster.
 * 
 */
public final class MaintenancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenancePolicyArgs Empty = new MaintenancePolicyArgs();

    /**
     * A hash identifying the version of this policy, so that updates to fields of the policy won&#39;t accidentally undo intermediate changes (and so that users of the API unaware of some fields won&#39;t accidentally remove other fields). Make a `get()` request to the cluster to get the current resource version and include it with requests to set the policy.
     * 
     */
    @Import(name="resourceVersion")
      private final @Nullable Output<String> resourceVersion;

    public Output<String> resourceVersion() {
        return this.resourceVersion == null ? Codegen.empty() : this.resourceVersion;
    }

    /**
     * Specifies the maintenance window in which maintenance may be performed.
     * 
     */
    @Import(name="window")
      private final @Nullable Output<MaintenanceWindowArgs> window;

    public Output<MaintenanceWindowArgs> window() {
        return this.window == null ? Codegen.empty() : this.window;
    }

    public MaintenancePolicyArgs(
        @Nullable Output<String> resourceVersion,
        @Nullable Output<MaintenanceWindowArgs> window) {
        this.resourceVersion = resourceVersion;
        this.window = window;
    }

    private MaintenancePolicyArgs() {
        this.resourceVersion = Codegen.empty();
        this.window = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceVersion;
        private @Nullable Output<MaintenanceWindowArgs> window;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenancePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.window = defaults.window;
        }

        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = Codegen.ofNullable(resourceVersion);
            return this;
        }
        public Builder window(@Nullable Output<MaintenanceWindowArgs> window) {
            this.window = window;
            return this;
        }
        public Builder window(@Nullable MaintenanceWindowArgs window) {
            this.window = Codegen.ofNullable(window);
            return this;
        }        public MaintenancePolicyArgs build() {
            return new MaintenancePolicyArgs(resourceVersion, window);
        }
    }
}
