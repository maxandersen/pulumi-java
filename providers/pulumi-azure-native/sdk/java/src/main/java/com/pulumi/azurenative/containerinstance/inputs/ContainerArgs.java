// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.azurenative.containerinstance.inputs.ContainerPortArgs;
import com.pulumi.azurenative.containerinstance.inputs.ContainerProbeArgs;
import com.pulumi.azurenative.containerinstance.inputs.EnvironmentVariableArgs;
import com.pulumi.azurenative.containerinstance.inputs.ResourceRequirementsArgs;
import com.pulumi.azurenative.containerinstance.inputs.VolumeMountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A container instance.
 * 
 */
public final class ContainerArgs extends ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The commands to execute within the container instance in exec form.
     * 
     */
    @Import(name="command")
    private @Nullable Output<List<String>> command;

    /**
     * @return The commands to execute within the container instance in exec form.
     * 
     */
    public Optional<Output<List<String>>> command() {
        return Optional.ofNullable(this.command);
    }

    /**
     * The environment variables to set in the container instance.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;

    /**
     * @return The environment variables to set in the container instance.
     * 
     */
    public Optional<Output<List<EnvironmentVariableArgs>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The name of the image used to create the container instance.
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return The name of the image used to create the container instance.
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    /**
     * The liveness probe.
     * 
     */
    @Import(name="livenessProbe")
    private @Nullable Output<ContainerProbeArgs> livenessProbe;

    /**
     * @return The liveness probe.
     * 
     */
    public Optional<Output<ContainerProbeArgs>> livenessProbe() {
        return Optional.ofNullable(this.livenessProbe);
    }

    /**
     * The user-provided name of the container instance.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The user-provided name of the container instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The exposed ports on the container instance.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<ContainerPortArgs>> ports;

    /**
     * @return The exposed ports on the container instance.
     * 
     */
    public Optional<Output<List<ContainerPortArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * The readiness probe.
     * 
     */
    @Import(name="readinessProbe")
    private @Nullable Output<ContainerProbeArgs> readinessProbe;

    /**
     * @return The readiness probe.
     * 
     */
    public Optional<Output<ContainerProbeArgs>> readinessProbe() {
        return Optional.ofNullable(this.readinessProbe);
    }

    /**
     * The resource requirements of the container instance.
     * 
     */
    @Import(name="resources", required=true)
    private Output<ResourceRequirementsArgs> resources;

    /**
     * @return The resource requirements of the container instance.
     * 
     */
    public Output<ResourceRequirementsArgs> resources() {
        return this.resources;
    }

    /**
     * The volume mounts available to the container instance.
     * 
     */
    @Import(name="volumeMounts")
    private @Nullable Output<List<VolumeMountArgs>> volumeMounts;

    /**
     * @return The volume mounts available to the container instance.
     * 
     */
    public Optional<Output<List<VolumeMountArgs>>> volumeMounts() {
        return Optional.ofNullable(this.volumeMounts);
    }

    private ContainerArgs() {}

    private ContainerArgs(ContainerArgs $) {
        this.command = $.command;
        this.environmentVariables = $.environmentVariables;
        this.image = $.image;
        this.livenessProbe = $.livenessProbe;
        this.name = $.name;
        this.ports = $.ports;
        this.readinessProbe = $.readinessProbe;
        this.resources = $.resources;
        this.volumeMounts = $.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerArgs $;

        public Builder() {
            $ = new ContainerArgs();
        }

        public Builder(ContainerArgs defaults) {
            $ = new ContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param command The commands to execute within the container instance in exec form.
         * 
         * @return builder
         * 
         */
        public Builder command(@Nullable Output<List<String>> command) {
            $.command = command;
            return this;
        }

        /**
         * @param command The commands to execute within the container instance in exec form.
         * 
         * @return builder
         * 
         */
        public Builder command(List<String> command) {
            return command(Output.of(command));
        }

        /**
         * @param command The commands to execute within the container instance in exec form.
         * 
         * @return builder
         * 
         */
        public Builder command(String... command) {
            return command(List.of(command));
        }

        /**
         * @param environmentVariables The environment variables to set in the container instance.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<List<EnvironmentVariableArgs>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables The environment variables to set in the container instance.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(List<EnvironmentVariableArgs> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param environmentVariables The environment variables to set in the container instance.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(EnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }

        /**
         * @param image The name of the image used to create the container instance.
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The name of the image used to create the container instance.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param livenessProbe The liveness probe.
         * 
         * @return builder
         * 
         */
        public Builder livenessProbe(@Nullable Output<ContainerProbeArgs> livenessProbe) {
            $.livenessProbe = livenessProbe;
            return this;
        }

        /**
         * @param livenessProbe The liveness probe.
         * 
         * @return builder
         * 
         */
        public Builder livenessProbe(ContainerProbeArgs livenessProbe) {
            return livenessProbe(Output.of(livenessProbe));
        }

        /**
         * @param name The user-provided name of the container instance.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The user-provided name of the container instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ports The exposed ports on the container instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<ContainerPortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports The exposed ports on the container instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<ContainerPortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports The exposed ports on the container instance.
         * 
         * @return builder
         * 
         */
        public Builder ports(ContainerPortArgs... ports) {
            return ports(List.of(ports));
        }

        /**
         * @param readinessProbe The readiness probe.
         * 
         * @return builder
         * 
         */
        public Builder readinessProbe(@Nullable Output<ContainerProbeArgs> readinessProbe) {
            $.readinessProbe = readinessProbe;
            return this;
        }

        /**
         * @param readinessProbe The readiness probe.
         * 
         * @return builder
         * 
         */
        public Builder readinessProbe(ContainerProbeArgs readinessProbe) {
            return readinessProbe(Output.of(readinessProbe));
        }

        /**
         * @param resources The resource requirements of the container instance.
         * 
         * @return builder
         * 
         */
        public Builder resources(Output<ResourceRequirementsArgs> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources The resource requirements of the container instance.
         * 
         * @return builder
         * 
         */
        public Builder resources(ResourceRequirementsArgs resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param volumeMounts The volume mounts available to the container instance.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(@Nullable Output<List<VolumeMountArgs>> volumeMounts) {
            $.volumeMounts = volumeMounts;
            return this;
        }

        /**
         * @param volumeMounts The volume mounts available to the container instance.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(List<VolumeMountArgs> volumeMounts) {
            return volumeMounts(Output.of(volumeMounts));
        }

        /**
         * @param volumeMounts The volume mounts available to the container instance.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(VolumeMountArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }

        public ContainerArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            return $;
        }
    }

}
