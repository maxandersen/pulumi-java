// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineTopologyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPipelineTopologyArgs Empty = new GetPipelineTopologyArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Pipeline topology unique identifier.
     * 
     */
    @Import(name="pipelineTopologyName", required=true)
      private final String pipelineTopologyName;

    public String pipelineTopologyName() {
        return this.pipelineTopologyName;
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

    public GetPipelineTopologyArgs(
        String accountName,
        String pipelineTopologyName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.pipelineTopologyName = Objects.requireNonNull(pipelineTopologyName, "expected parameter 'pipelineTopologyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPipelineTopologyArgs() {
        this.accountName = null;
        this.pipelineTopologyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String pipelineTopologyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineTopologyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.pipelineTopologyName = defaults.pipelineTopologyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder pipelineTopologyName(String pipelineTopologyName) {
            this.pipelineTopologyName = Objects.requireNonNull(pipelineTopologyName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetPipelineTopologyArgs build() {
            return new GetPipelineTopologyArgs(accountName, pipelineTopologyName, resourceGroupName);
        }
    }
}
