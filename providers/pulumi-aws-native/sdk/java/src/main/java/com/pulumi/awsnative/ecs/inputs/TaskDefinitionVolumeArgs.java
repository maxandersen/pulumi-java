// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.inputs.TaskDefinitionDockerVolumeConfigurationArgs;
import com.pulumi.awsnative.ecs.inputs.TaskDefinitionEFSVolumeConfigurationArgs;
import com.pulumi.awsnative.ecs.inputs.TaskDefinitionHostVolumePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeArgs Empty = new TaskDefinitionVolumeArgs();

    @Import(name="dockerVolumeConfiguration")
      private final @Nullable Output<TaskDefinitionDockerVolumeConfigurationArgs> dockerVolumeConfiguration;

    public Output<TaskDefinitionDockerVolumeConfigurationArgs> dockerVolumeConfiguration() {
        return this.dockerVolumeConfiguration == null ? Codegen.empty() : this.dockerVolumeConfiguration;
    }

    @Import(name="eFSVolumeConfiguration")
      private final @Nullable Output<TaskDefinitionEFSVolumeConfigurationArgs> eFSVolumeConfiguration;

    public Output<TaskDefinitionEFSVolumeConfigurationArgs> eFSVolumeConfiguration() {
        return this.eFSVolumeConfiguration == null ? Codegen.empty() : this.eFSVolumeConfiguration;
    }

    @Import(name="host")
      private final @Nullable Output<TaskDefinitionHostVolumePropertiesArgs> host;

    public Output<TaskDefinitionHostVolumePropertiesArgs> host() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public TaskDefinitionVolumeArgs(
        @Nullable Output<TaskDefinitionDockerVolumeConfigurationArgs> dockerVolumeConfiguration,
        @Nullable Output<TaskDefinitionEFSVolumeConfigurationArgs> eFSVolumeConfiguration,
        @Nullable Output<TaskDefinitionHostVolumePropertiesArgs> host,
        @Nullable Output<String> name) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        this.eFSVolumeConfiguration = eFSVolumeConfiguration;
        this.host = host;
        this.name = name;
    }

    private TaskDefinitionVolumeArgs() {
        this.dockerVolumeConfiguration = Codegen.empty();
        this.eFSVolumeConfiguration = Codegen.empty();
        this.host = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TaskDefinitionDockerVolumeConfigurationArgs> dockerVolumeConfiguration;
        private @Nullable Output<TaskDefinitionEFSVolumeConfigurationArgs> eFSVolumeConfiguration;
        private @Nullable Output<TaskDefinitionHostVolumePropertiesArgs> host;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockerVolumeConfiguration = defaults.dockerVolumeConfiguration;
    	      this.eFSVolumeConfiguration = defaults.eFSVolumeConfiguration;
    	      this.host = defaults.host;
    	      this.name = defaults.name;
        }

        public Builder dockerVolumeConfiguration(@Nullable Output<TaskDefinitionDockerVolumeConfigurationArgs> dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = dockerVolumeConfiguration;
            return this;
        }
        public Builder dockerVolumeConfiguration(@Nullable TaskDefinitionDockerVolumeConfigurationArgs dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = Codegen.ofNullable(dockerVolumeConfiguration);
            return this;
        }
        public Builder eFSVolumeConfiguration(@Nullable Output<TaskDefinitionEFSVolumeConfigurationArgs> eFSVolumeConfiguration) {
            this.eFSVolumeConfiguration = eFSVolumeConfiguration;
            return this;
        }
        public Builder eFSVolumeConfiguration(@Nullable TaskDefinitionEFSVolumeConfigurationArgs eFSVolumeConfiguration) {
            this.eFSVolumeConfiguration = Codegen.ofNullable(eFSVolumeConfiguration);
            return this;
        }
        public Builder host(@Nullable Output<TaskDefinitionHostVolumePropertiesArgs> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable TaskDefinitionHostVolumePropertiesArgs host) {
            this.host = Codegen.ofNullable(host);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public TaskDefinitionVolumeArgs build() {
            return new TaskDefinitionVolumeArgs(dockerVolumeConfiguration, eFSVolumeConfiguration, host, name);
        }
    }
}
