// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineArgs Empty = new GetPipelineArgs();

    /**
     * The name of the Pipeline.
     * 
     */
    @Import(name="pipelineName", required=true)
    private String pipelineName;

    public String pipelineName() {
        return this.pipelineName;
    }

    private GetPipelineArgs() {}

    private GetPipelineArgs(GetPipelineArgs $) {
        this.pipelineName = $.pipelineName;
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

        public Builder pipelineName(String pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        public GetPipelineArgs build() {
            $.pipelineName = Objects.requireNonNull($.pipelineName, "expected parameter 'pipelineName' to be non-null");
            return $;
        }
    }

}
