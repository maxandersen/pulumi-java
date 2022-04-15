// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.workflowexecutions_v1beta.enums.ExecutionCallLogLevel;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExecutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecutionArgs Empty = new ExecutionArgs();

    /**
     * Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `'{"argument":"{\"firstName\":\"FIRST\",\"lastName\":\"LAST\"}"}'`
     * 
     */
    @Import(name="argument")
      private final @Nullable Output<String> argument;

    public Output<String> argument() {
        return this.argument == null ? Codegen.empty() : this.argument;
    }

    /**
     * The call logging level associated to this execution.
     * 
     */
    @Import(name="callLogLevel")
      private final @Nullable Output<ExecutionCallLogLevel> callLogLevel;

    public Output<ExecutionCallLogLevel> callLogLevel() {
        return this.callLogLevel == null ? Codegen.empty() : this.callLogLevel;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="workflowId", required=true)
      private final Output<String> workflowId;

    public Output<String> workflowId() {
        return this.workflowId;
    }

    public ExecutionArgs(
        @Nullable Output<String> argument,
        @Nullable Output<ExecutionCallLogLevel> callLogLevel,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        Output<String> workflowId) {
        this.argument = argument;
        this.callLogLevel = callLogLevel;
        this.location = location;
        this.project = project;
        this.workflowId = Objects.requireNonNull(workflowId, "expected parameter 'workflowId' to be non-null");
    }

    private ExecutionArgs() {
        this.argument = Codegen.empty();
        this.callLogLevel = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.workflowId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> argument;
        private @Nullable Output<ExecutionCallLogLevel> callLogLevel;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private Output<String> workflowId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argument = defaults.argument;
    	      this.callLogLevel = defaults.callLogLevel;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.workflowId = defaults.workflowId;
        }

        public Builder argument(@Nullable Output<String> argument) {
            this.argument = argument;
            return this;
        }
        public Builder argument(@Nullable String argument) {
            this.argument = Codegen.ofNullable(argument);
            return this;
        }
        public Builder callLogLevel(@Nullable Output<ExecutionCallLogLevel> callLogLevel) {
            this.callLogLevel = callLogLevel;
            return this;
        }
        public Builder callLogLevel(@Nullable ExecutionCallLogLevel callLogLevel) {
            this.callLogLevel = Codegen.ofNullable(callLogLevel);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder workflowId(Output<String> workflowId) {
            this.workflowId = Objects.requireNonNull(workflowId);
            return this;
        }
        public Builder workflowId(String workflowId) {
            this.workflowId = Output.of(Objects.requireNonNull(workflowId));
            return this;
        }        public ExecutionArgs build() {
            return new ExecutionArgs(argument, callLogLevel, location, project, workflowId);
        }
    }
}
