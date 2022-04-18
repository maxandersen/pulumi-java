// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionRuntimePlatformArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionRuntimePlatformArgs Empty = new TaskDefinitionRuntimePlatformArgs();

    @Import(name="cpuArchitecture")
      private final @Nullable Output<String> cpuArchitecture;

    public Output<String> cpuArchitecture() {
        return this.cpuArchitecture == null ? Codegen.empty() : this.cpuArchitecture;
    }

    @Import(name="operatingSystemFamily")
      private final @Nullable Output<String> operatingSystemFamily;

    public Output<String> operatingSystemFamily() {
        return this.operatingSystemFamily == null ? Codegen.empty() : this.operatingSystemFamily;
    }

    public TaskDefinitionRuntimePlatformArgs(
        @Nullable Output<String> cpuArchitecture,
        @Nullable Output<String> operatingSystemFamily) {
        this.cpuArchitecture = cpuArchitecture;
        this.operatingSystemFamily = operatingSystemFamily;
    }

    private TaskDefinitionRuntimePlatformArgs() {
        this.cpuArchitecture = Codegen.empty();
        this.operatingSystemFamily = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionRuntimePlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cpuArchitecture;
        private @Nullable Output<String> operatingSystemFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionRuntimePlatformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuArchitecture = defaults.cpuArchitecture;
    	      this.operatingSystemFamily = defaults.operatingSystemFamily;
        }

        public Builder cpuArchitecture(@Nullable Output<String> cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }
        public Builder cpuArchitecture(@Nullable String cpuArchitecture) {
            this.cpuArchitecture = Codegen.ofNullable(cpuArchitecture);
            return this;
        }
        public Builder operatingSystemFamily(@Nullable Output<String> operatingSystemFamily) {
            this.operatingSystemFamily = operatingSystemFamily;
            return this;
        }
        public Builder operatingSystemFamily(@Nullable String operatingSystemFamily) {
            this.operatingSystemFamily = Codegen.ofNullable(operatingSystemFamily);
            return this;
        }        public TaskDefinitionRuntimePlatformArgs build() {
            return new TaskDefinitionRuntimePlatformArgs(cpuArchitecture, operatingSystemFamily);
        }
    }
}
