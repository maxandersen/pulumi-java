// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRestorePointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRestorePointArgs Empty = new GetRestorePointArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the restore point collection.
     * 
     */
    @Import(name="restorePointCollectionName", required=true)
      private final String restorePointCollectionName;

    public String restorePointCollectionName() {
        return this.restorePointCollectionName;
    }

    /**
     * The name of the restore point.
     * 
     */
    @Import(name="restorePointName", required=true)
      private final String restorePointName;

    public String restorePointName() {
        return this.restorePointName;
    }

    public GetRestorePointArgs(
        String resourceGroupName,
        String restorePointCollectionName,
        String restorePointName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName, "expected parameter 'restorePointCollectionName' to be non-null");
        this.restorePointName = Objects.requireNonNull(restorePointName, "expected parameter 'restorePointName' to be non-null");
    }

    private GetRestorePointArgs() {
        this.resourceGroupName = null;
        this.restorePointCollectionName = null;
        this.restorePointName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestorePointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String restorePointCollectionName;
        private String restorePointName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestorePointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointCollectionName = defaults.restorePointCollectionName;
    	      this.restorePointName = defaults.restorePointName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder restorePointCollectionName(String restorePointCollectionName) {
            this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName);
            return this;
        }
        public Builder restorePointName(String restorePointName) {
            this.restorePointName = Objects.requireNonNull(restorePointName);
            return this;
        }        public GetRestorePointArgs build() {
            return new GetRestorePointArgs(resourceGroupName, restorePointCollectionName, restorePointName);
        }
    }
}
