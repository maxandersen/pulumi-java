// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContainerGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContainerGroupArgs Empty = new GetContainerGroupArgs();

    /**
     * The name of the container group.
     * 
     */
    @Import(name="containerGroupName", required=true)
      private final String containerGroupName;

    public String containerGroupName() {
        return this.containerGroupName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetContainerGroupArgs(
        String containerGroupName,
        String resourceGroupName) {
        this.containerGroupName = Objects.requireNonNull(containerGroupName, "expected parameter 'containerGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetContainerGroupArgs() {
        this.containerGroupName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerGroupName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerGroupName = defaults.containerGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder containerGroupName(String containerGroupName) {
            this.containerGroupName = Objects.requireNonNull(containerGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetContainerGroupArgs build() {
            return new GetContainerGroupArgs(containerGroupName, resourceGroupName);
        }
    }
}
