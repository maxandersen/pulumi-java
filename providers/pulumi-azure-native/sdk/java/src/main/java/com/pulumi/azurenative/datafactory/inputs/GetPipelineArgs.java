// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineArgs Empty = new GetPipelineArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The pipeline name.
     * 
     */
    @Import(name="pipelineName", required=true)
    private String pipelineName;

    public String pipelineName() {
        return this.pipelineName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPipelineArgs() {}

    private GetPipelineArgs(GetPipelineArgs $) {
        this.factoryName = $.factoryName;
        this.pipelineName = $.pipelineName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineArgs $;

        public Builder() {
            $ = new GetPipelineArgs();
        }

        public Builder(GetPipelineArgs defaults) {
            $ = new GetPipelineArgs(Objects.requireNonNull(defaults));
        }

        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        public Builder pipelineName(String pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPipelineArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.pipelineName = Objects.requireNonNull($.pipelineName, "expected parameter 'pipelineName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
