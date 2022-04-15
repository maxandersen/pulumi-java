// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the resource properties.
 * 
 */
public final class PlacementProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlacementProfileArgs Empty = new PlacementProfileArgs();

    /**
     * Gets or sets the ARM Id of the cluster resource on which this virtual machine will deploy.
     * 
     */
    @Import(name="clusterId")
      private final @Nullable Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId == null ? Codegen.empty() : this.clusterId;
    }

    /**
     * Gets or sets the ARM Id of the datastore resource on which the data for the virtual machine will be kept.
     * 
     */
    @Import(name="datastoreId")
      private final @Nullable Output<String> datastoreId;

    public Output<String> datastoreId() {
        return this.datastoreId == null ? Codegen.empty() : this.datastoreId;
    }

    /**
     * Gets or sets the ARM Id of the host resource on which this virtual machine will deploy.
     * 
     */
    @Import(name="hostId")
      private final @Nullable Output<String> hostId;

    public Output<String> hostId() {
        return this.hostId == null ? Codegen.empty() : this.hostId;
    }

    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will deploy.
     * 
     */
    @Import(name="resourcePoolId")
      private final @Nullable Output<String> resourcePoolId;

    public Output<String> resourcePoolId() {
        return this.resourcePoolId == null ? Codegen.empty() : this.resourcePoolId;
    }

    public PlacementProfileArgs(
        @Nullable Output<String> clusterId,
        @Nullable Output<String> datastoreId,
        @Nullable Output<String> hostId,
        @Nullable Output<String> resourcePoolId) {
        this.clusterId = clusterId;
        this.datastoreId = datastoreId;
        this.hostId = hostId;
        this.resourcePoolId = resourcePoolId;
    }

    private PlacementProfileArgs() {
        this.clusterId = Codegen.empty();
        this.datastoreId = Codegen.empty();
        this.hostId = Codegen.empty();
        this.resourcePoolId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlacementProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterId;
        private @Nullable Output<String> datastoreId;
        private @Nullable Output<String> hostId;
        private @Nullable Output<String> resourcePoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(PlacementProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.datastoreId = defaults.datastoreId;
    	      this.hostId = defaults.hostId;
    	      this.resourcePoolId = defaults.resourcePoolId;
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = Codegen.ofNullable(clusterId);
            return this;
        }
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = Codegen.ofNullable(datastoreId);
            return this;
        }
        public Builder hostId(@Nullable Output<String> hostId) {
            this.hostId = hostId;
            return this;
        }
        public Builder hostId(@Nullable String hostId) {
            this.hostId = Codegen.ofNullable(hostId);
            return this;
        }
        public Builder resourcePoolId(@Nullable Output<String> resourcePoolId) {
            this.resourcePoolId = resourcePoolId;
            return this;
        }
        public Builder resourcePoolId(@Nullable String resourcePoolId) {
            this.resourcePoolId = Codegen.ofNullable(resourcePoolId);
            return this;
        }        public PlacementProfileArgs build() {
            return new PlacementProfileArgs(clusterId, datastoreId, hostId, resourcePoolId);
        }
    }
}
