// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAgentPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAgentPoolArgs Empty = new GetAgentPoolArgs();

    /**
     * The name of the agent pool.
     * 
     */
    @Import(name="agentPoolName", required=true)
      private final String agentPoolName;

    public String agentPoolName() {
        return this.agentPoolName;
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

    /**
     * The name of the managed cluster resource.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    public GetAgentPoolArgs(
        String agentPoolName,
        String resourceGroupName,
        String resourceName) {
        this.agentPoolName = Objects.requireNonNull(agentPoolName, "expected parameter 'agentPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetAgentPoolArgs() {
        this.agentPoolName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentPoolName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder agentPoolName(String agentPoolName) {
            this.agentPoolName = Objects.requireNonNull(agentPoolName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public GetAgentPoolArgs build() {
            return new GetAgentPoolArgs(agentPoolName, resourceGroupName, resourceName);
        }
    }
}
