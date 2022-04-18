// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTaskDefinitionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaskDefinitionArgs Empty = new GetTaskDefinitionArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS task definition
     * 
     */
    @Import(name="taskDefinitionArn", required=true)
      private final String taskDefinitionArn;

    public String taskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    public GetTaskDefinitionArgs(String taskDefinitionArn) {
        this.taskDefinitionArn = Objects.requireNonNull(taskDefinitionArn, "expected parameter 'taskDefinitionArn' to be non-null");
    }

    private GetTaskDefinitionArgs() {
        this.taskDefinitionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String taskDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.taskDefinitionArn = defaults.taskDefinitionArn;
        }

        public Builder taskDefinitionArn(String taskDefinitionArn) {
            this.taskDefinitionArn = Objects.requireNonNull(taskDefinitionArn);
            return this;
        }        public GetTaskDefinitionArgs build() {
            return new GetTaskDefinitionArgs(taskDefinitionArn);
        }
    }
}
