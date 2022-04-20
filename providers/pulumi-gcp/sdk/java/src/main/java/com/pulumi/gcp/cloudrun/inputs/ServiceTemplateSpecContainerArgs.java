// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerPortArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerResourcesArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerVolumeMountArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerArgs Empty = new ServiceTemplateSpecContainerArgs();

    /**
     * Arguments to the entrypoint.
     * The docker image&#39;s CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container&#39;s
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> args() {
        return this.args == null ? Codegen.empty() : this.args;
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The docker image&#39;s ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container&#39;s
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="commands")
      private final @Nullable Output<List<String>> commands;

    public Output<List<String>> commands() {
        return this.commands == null ? Codegen.empty() : this.commands;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * List of sources to populate environment variables in the container.
     * All invalid keys will be reported as an event when the container is starting.
     * When a key exists in multiple sources, the value associated with the last source will
     * take precedence. Values defined by an Env with a duplicate key will take
     * precedence.
     * Structure is documented below.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @Import(name="envFroms")
      private final @Nullable Output<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms;

    @Deprecated /* Not supported by Cloud Run fully managed */
    public Output<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms() {
        return this.envFroms == null ? Codegen.empty() : this.envFroms;
    }

    /**
     * List of environment variables to set in the container.
     * Structure is documented below.
     * 
     */
    @Import(name="envs")
      private final @Nullable Output<List<ServiceTemplateSpecContainerEnvArgs>> envs;

    public Output<List<ServiceTemplateSpecContainerEnvArgs>> envs() {
        return this.envs == null ? Codegen.empty() : this.envs;
    }

    /**
     * Docker image name. This is most often a reference to a container located
     * in the container registry, such as gcr.io/cloudrun/hello
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> image() {
        return this.image;
    }

    /**
     * List of open ports in the container.
     * More Info:
     * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
     * Structure is documented below.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<ServiceTemplateSpecContainerPortArgs>> ports;

    public Output<List<ServiceTemplateSpecContainerPortArgs>> ports() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    /**
     * Compute Resources required by this container. Used to set values such as max memory
     * More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
     * Structure is documented below.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<ServiceTemplateSpecContainerResourcesArgs> resources;

    public Output<ServiceTemplateSpecContainerResourcesArgs> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    /**
     * Volume to mount into the container&#39;s filesystem.
     * Only supports SecretVolumeSources.
     * Structure is documented below.
     * 
     */
    @Import(name="volumeMounts")
      private final @Nullable Output<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts;

    public Output<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts() {
        return this.volumeMounts == null ? Codegen.empty() : this.volumeMounts;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * Container&#39;s working directory.
     * If not specified, the container runtime&#39;s default will be used, which
     * might be configured in the container image.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @Import(name="workingDir")
      private final @Nullable Output<String> workingDir;

    @Deprecated /* Not supported by Cloud Run fully managed */
    public Output<String> workingDir() {
        return this.workingDir == null ? Codegen.empty() : this.workingDir;
    }

    public ServiceTemplateSpecContainerArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> commands,
        @Nullable Output<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms,
        @Nullable Output<List<ServiceTemplateSpecContainerEnvArgs>> envs,
        Output<String> image,
        @Nullable Output<List<ServiceTemplateSpecContainerPortArgs>> ports,
        @Nullable Output<ServiceTemplateSpecContainerResourcesArgs> resources,
        @Nullable Output<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts,
        @Nullable Output<String> workingDir) {
        this.args = args;
        this.commands = commands;
        this.envFroms = envFroms;
        this.envs = envs;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.ports = ports;
        this.resources = resources;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    private ServiceTemplateSpecContainerArgs() {
        this.args = Codegen.empty();
        this.commands = Codegen.empty();
        this.envFroms = Codegen.empty();
        this.envs = Codegen.empty();
        this.image = Codegen.empty();
        this.ports = Codegen.empty();
        this.resources = Codegen.empty();
        this.volumeMounts = Codegen.empty();
        this.workingDir = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> commands;
        private @Nullable Output<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms;
        private @Nullable Output<List<ServiceTemplateSpecContainerEnvArgs>> envs;
        private Output<String> image;
        private @Nullable Output<List<ServiceTemplateSpecContainerPortArgs>> ports;
        private @Nullable Output<ServiceTemplateSpecContainerResourcesArgs> resources;
        private @Nullable Output<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts;
        private @Nullable Output<String> workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.envFroms = defaults.envFroms;
    	      this.envs = defaults.envs;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Codegen.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder commands(@Nullable Output<List<String>> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(@Nullable List<String> commands) {
            this.commands = Codegen.ofNullable(commands);
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder envFroms(@Nullable Output<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms) {
            this.envFroms = envFroms;
            return this;
        }
        public Builder envFroms(@Nullable List<ServiceTemplateSpecContainerEnvFromArgs> envFroms) {
            this.envFroms = Codegen.ofNullable(envFroms);
            return this;
        }
        public Builder envFroms(ServiceTemplateSpecContainerEnvFromArgs... envFroms) {
            return envFroms(List.of(envFroms));
        }
        public Builder envs(@Nullable Output<List<ServiceTemplateSpecContainerEnvArgs>> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(@Nullable List<ServiceTemplateSpecContainerEnvArgs> envs) {
            this.envs = Codegen.ofNullable(envs);
            return this;
        }
        public Builder envs(ServiceTemplateSpecContainerEnvArgs... envs) {
            return envs(List.of(envs));
        }
        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
            return this;
        }
        public Builder ports(@Nullable Output<List<ServiceTemplateSpecContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<ServiceTemplateSpecContainerPortArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(ServiceTemplateSpecContainerPortArgs... ports) {
            return ports(List.of(ports));
        }
        public Builder resources(@Nullable Output<ServiceTemplateSpecContainerResourcesArgs> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable ServiceTemplateSpecContainerResourcesArgs resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder volumeMounts(@Nullable Output<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(@Nullable List<ServiceTemplateSpecContainerVolumeMountArgs> volumeMounts) {
            this.volumeMounts = Codegen.ofNullable(volumeMounts);
            return this;
        }
        public Builder volumeMounts(ServiceTemplateSpecContainerVolumeMountArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public Builder workingDir(@Nullable Output<String> workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = Codegen.ofNullable(workingDir);
            return this;
        }        public ServiceTemplateSpecContainerArgs build() {
            return new ServiceTemplateSpecContainerArgs(args, commands, envFroms, envs, image, ports, resources, volumeMounts, workingDir);
        }
    }
}
