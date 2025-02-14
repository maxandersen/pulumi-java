// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunV2ContainerPortArgs;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunV2EnvVarArgs;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunV2ResourceRequirementsArgs;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunV2VolumeMountArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A single application container. This specifies both the container to run, the command to run in the container and the arguments to supply to it. Note that additional arguments may be supplied by the system to the container at runtime.
 * 
 */
public final class GoogleCloudRunV2ContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunV2ContainerArgs Empty = new GoogleCloudRunV2ContainerArgs();

    /**
     * Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="command")
    private @Nullable Output<List<String>> command;

    /**
     * @return Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public Optional<Output<List<String>>> command() {
        return Optional.ofNullable(this.command);
    }

    /**
     * List of environment variables to set in the container.
     * 
     */
    @Import(name="env")
    private @Nullable Output<List<GoogleCloudRunV2EnvVarArgs>> env;

    /**
     * @return List of environment variables to set in the container.
     * 
     */
    public Optional<Output<List<GoogleCloudRunV2EnvVarArgs>>> env() {
        return Optional.ofNullable(this.env);
    }

    /**
     * URL of the Container image in Google Container Registry or Docker More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return URL of the Container image in Google Container Registry or Docker More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    /**
     * Name of the container specified as a DNS_LABEL.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the container specified as a DNS_LABEL.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<GoogleCloudRunV2ContainerPortArgs>> ports;

    /**
     * @return List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    public Optional<Output<List<GoogleCloudRunV2ContainerPortArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    @Import(name="resources")
    private @Nullable Output<GoogleCloudRunV2ResourceRequirementsArgs> resources;

    /**
     * @return Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    public Optional<Output<GoogleCloudRunV2ResourceRequirementsArgs>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * Volume to mount into the container&#39;s filesystem.
     * 
     */
    @Import(name="volumeMounts")
    private @Nullable Output<List<GoogleCloudRunV2VolumeMountArgs>> volumeMounts;

    /**
     * @return Volume to mount into the container&#39;s filesystem.
     * 
     */
    public Optional<Output<List<GoogleCloudRunV2VolumeMountArgs>>> volumeMounts() {
        return Optional.ofNullable(this.volumeMounts);
    }

    private GoogleCloudRunV2ContainerArgs() {}

    private GoogleCloudRunV2ContainerArgs(GoogleCloudRunV2ContainerArgs $) {
        this.args = $.args;
        this.command = $.command;
        this.env = $.env;
        this.image = $.image;
        this.name = $.name;
        this.ports = $.ports;
        this.resources = $.resources;
        this.volumeMounts = $.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunV2ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunV2ContainerArgs $;

        public Builder() {
            $ = new GoogleCloudRunV2ContainerArgs();
        }

        public Builder(GoogleCloudRunV2ContainerArgs defaults) {
            $ = new GoogleCloudRunV2ContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param command Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder command(@Nullable Output<List<String>> command) {
            $.command = command;
            return this;
        }

        /**
         * @param command Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder command(List<String> command) {
            return command(Output.of(command));
        }

        /**
         * @param command Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder command(String... command) {
            return command(List.of(command));
        }

        /**
         * @param env List of environment variables to set in the container.
         * 
         * @return builder
         * 
         */
        public Builder env(@Nullable Output<List<GoogleCloudRunV2EnvVarArgs>> env) {
            $.env = env;
            return this;
        }

        /**
         * @param env List of environment variables to set in the container.
         * 
         * @return builder
         * 
         */
        public Builder env(List<GoogleCloudRunV2EnvVarArgs> env) {
            return env(Output.of(env));
        }

        /**
         * @param env List of environment variables to set in the container.
         * 
         * @return builder
         * 
         */
        public Builder env(GoogleCloudRunV2EnvVarArgs... env) {
            return env(List.of(env));
        }

        /**
         * @param image URL of the Container image in Google Container Registry or Docker More info: https://kubernetes.io/docs/concepts/containers/images
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image URL of the Container image in Google Container Registry or Docker More info: https://kubernetes.io/docs/concepts/containers/images
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param name Name of the container specified as a DNS_LABEL.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the container specified as a DNS_LABEL.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ports List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<GoogleCloudRunV2ContainerPortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<GoogleCloudRunV2ContainerPortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
         * 
         * @return builder
         * 
         */
        public Builder ports(GoogleCloudRunV2ContainerPortArgs... ports) {
            return ports(List.of(ports));
        }

        /**
         * @param resources Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<GoogleCloudRunV2ResourceRequirementsArgs> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
         * 
         * @return builder
         * 
         */
        public Builder resources(GoogleCloudRunV2ResourceRequirementsArgs resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param volumeMounts Volume to mount into the container&#39;s filesystem.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(@Nullable Output<List<GoogleCloudRunV2VolumeMountArgs>> volumeMounts) {
            $.volumeMounts = volumeMounts;
            return this;
        }

        /**
         * @param volumeMounts Volume to mount into the container&#39;s filesystem.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(List<GoogleCloudRunV2VolumeMountArgs> volumeMounts) {
            return volumeMounts(Output.of(volumeMounts));
        }

        /**
         * @param volumeMounts Volume to mount into the container&#39;s filesystem.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(GoogleCloudRunV2VolumeMountArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }

        public GoogleCloudRunV2ContainerArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            return $;
        }
    }

}
