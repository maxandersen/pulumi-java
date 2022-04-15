// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationvCenterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicationvCenterArgs Empty = new GetReplicationvCenterArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
      private final String fabricName;

    public String fabricName() {
        return this.fabricName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    /**
     * vCenter name.
     * 
     */
    @Import(name="vCenterName", required=true)
      private final String vCenterName;

    public String vCenterName() {
        return this.vCenterName;
    }

    public GetReplicationvCenterArgs(
        String fabricName,
        String resourceGroupName,
        String resourceName,
        String vCenterName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.vCenterName = Objects.requireNonNull(vCenterName, "expected parameter 'vCenterName' to be non-null");
    }

    private GetReplicationvCenterArgs() {
        this.fabricName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
        this.vCenterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationvCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricName;
        private String resourceGroupName;
        private String resourceName;
        private String vCenterName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationvCenterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.vCenterName = defaults.vCenterName;
        }

        public Builder fabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder vCenterName(String vCenterName) {
            this.vCenterName = Objects.requireNonNull(vCenterName);
            return this;
        }        public GetReplicationvCenterArgs build() {
            return new GetReplicationvCenterArgs(fabricName, resourceGroupName, resourceName, vCenterName);
        }
    }
}
