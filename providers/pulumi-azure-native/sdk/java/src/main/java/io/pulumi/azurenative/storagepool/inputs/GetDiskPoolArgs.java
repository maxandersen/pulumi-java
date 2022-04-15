// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiskPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiskPoolArgs Empty = new GetDiskPoolArgs();

    /**
     * The name of the Disk pool.
     * 
     */
    @Import(name="diskPoolName", required=true)
      private final String diskPoolName;

    public String diskPoolName() {
        return this.diskPoolName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDiskPoolArgs(
        String diskPoolName,
        String resourceGroupName) {
        this.diskPoolName = Objects.requireNonNull(diskPoolName, "expected parameter 'diskPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDiskPoolArgs() {
        this.diskPoolName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskPoolName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskPoolName = defaults.diskPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder diskPoolName(String diskPoolName) {
            this.diskPoolName = Objects.requireNonNull(diskPoolName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetDiskPoolArgs build() {
            return new GetDiskPoolArgs(diskPoolName, resourceGroupName);
        }
    }
}
