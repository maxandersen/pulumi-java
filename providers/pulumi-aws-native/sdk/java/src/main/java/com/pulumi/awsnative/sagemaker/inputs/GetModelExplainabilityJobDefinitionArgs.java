// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetModelExplainabilityJobDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelExplainabilityJobDefinitionArgs Empty = new GetModelExplainabilityJobDefinitionArgs();

    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @Import(name="jobDefinitionArn", required=true)
    private String jobDefinitionArn;

    public String jobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    private GetModelExplainabilityJobDefinitionArgs() {}

    private GetModelExplainabilityJobDefinitionArgs(GetModelExplainabilityJobDefinitionArgs $) {
        this.jobDefinitionArn = $.jobDefinitionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelExplainabilityJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelExplainabilityJobDefinitionArgs $;

        public Builder() {
            $ = new GetModelExplainabilityJobDefinitionArgs();
        }

        public Builder(GetModelExplainabilityJobDefinitionArgs defaults) {
            $ = new GetModelExplainabilityJobDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobDefinitionArn(String jobDefinitionArn) {
            $.jobDefinitionArn = jobDefinitionArn;
            return this;
        }

        public GetModelExplainabilityJobDefinitionArgs build() {
            $.jobDefinitionArn = Objects.requireNonNull($.jobDefinitionArn, "expected parameter 'jobDefinitionArn' to be non-null");
            return $;
        }
    }

}
