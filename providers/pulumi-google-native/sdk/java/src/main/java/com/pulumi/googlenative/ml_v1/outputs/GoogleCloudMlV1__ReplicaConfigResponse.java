// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AcceleratorConfigResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__DiskConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__ReplicaConfigResponse {
    /**
     * Represents the type and number of accelerators used by the replica. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu)
     * 
     */
    private final GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;
    /**
     * Arguments to the entrypoint command. The following rules apply for container_command and container_args: - If you do not supply command or args: The defaults defined in the Docker image are used. - If you supply a command but no args: The default EntryPoint and the default Cmd defined in the Docker image are ignored. Your command is run without any arguments. - If you supply only args: The default Entrypoint defined in the Docker image is run with the args that you supplied. - If you supply a command and args: The default Entrypoint and the default Cmd defined in the Docker image are ignored. Your command is run with your args. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
     */
    private final List<String> containerArgs;
    /**
     * The command with which the replica's custom container is run. If provided, it will override default ENTRYPOINT of the docker image. If not provided, the docker image's ENTRYPOINT is used. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
     */
    private final List<String> containerCommand;
    /**
     * Represents the configuration of disk options.
     * 
     */
    private final GoogleCloudMlV1__DiskConfigResponse diskConfig;
    /**
     * The Docker image to run on the replica. This image must be in Container Registry. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    private final String imageUri;
    /**
     * The AI Platform runtime version that includes a TensorFlow version matching the one used in the custom container. This field is required if the replica is a TPU worker that uses a custom container. Otherwise, do not specify this field. This must be a [runtime version that currently supports training with TPUs](/ml-engine/docs/tensorflow/runtime-version-list#tpu-support). Note that the version of TensorFlow included in a runtime version may differ from the numbering of the runtime version itself, because it may have a different [patch version](https://www.tensorflow.org/guide/version_compat#semantic_versioning_20). In this field, you must specify the runtime version (TensorFlow minor version). For example, if your custom container runs TensorFlow `1.x.y`, specify `1.x`.
     * 
     */
    private final String tpuTfVersion;

    @CustomType.Constructor
    private GoogleCloudMlV1__ReplicaConfigResponse(
        @CustomType.Parameter("acceleratorConfig") GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig,
        @CustomType.Parameter("containerArgs") List<String> containerArgs,
        @CustomType.Parameter("containerCommand") List<String> containerCommand,
        @CustomType.Parameter("diskConfig") GoogleCloudMlV1__DiskConfigResponse diskConfig,
        @CustomType.Parameter("imageUri") String imageUri,
        @CustomType.Parameter("tpuTfVersion") String tpuTfVersion) {
        this.acceleratorConfig = acceleratorConfig;
        this.containerArgs = containerArgs;
        this.containerCommand = containerCommand;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.tpuTfVersion = tpuTfVersion;
    }

    /**
     * Represents the type and number of accelerators used by the replica. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu)
     * 
    */
    public GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * Arguments to the entrypoint command. The following rules apply for container_command and container_args: - If you do not supply command or args: The defaults defined in the Docker image are used. - If you supply a command but no args: The default EntryPoint and the default Cmd defined in the Docker image are ignored. Your command is run without any arguments. - If you supply only args: The default Entrypoint defined in the Docker image is run with the args that you supplied. - If you supply a command and args: The default Entrypoint and the default Cmd defined in the Docker image are ignored. Your command is run with your args. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
    */
    public List<String> containerArgs() {
        return this.containerArgs;
    }
    /**
     * The command with which the replica's custom container is run. If provided, it will override default ENTRYPOINT of the docker image. If not provided, the docker image's ENTRYPOINT is used. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
    */
    public List<String> containerCommand() {
        return this.containerCommand;
    }
    /**
     * Represents the configuration of disk options.
     * 
    */
    public GoogleCloudMlV1__DiskConfigResponse diskConfig() {
        return this.diskConfig;
    }
    /**
     * The Docker image to run on the replica. This image must be in Container Registry. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
    */
    public String imageUri() {
        return this.imageUri;
    }
    /**
     * The AI Platform runtime version that includes a TensorFlow version matching the one used in the custom container. This field is required if the replica is a TPU worker that uses a custom container. Otherwise, do not specify this field. This must be a [runtime version that currently supports training with TPUs](/ml-engine/docs/tensorflow/runtime-version-list#tpu-support). Note that the version of TensorFlow included in a runtime version may differ from the numbering of the runtime version itself, because it may have a different [patch version](https://www.tensorflow.org/guide/version_compat#semantic_versioning_20). In this field, you must specify the runtime version (TensorFlow minor version). For example, if your custom container runs TensorFlow `1.x.y`, specify `1.x`.
     * 
    */
    public String tpuTfVersion() {
        return this.tpuTfVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ReplicaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;
        private List<String> containerArgs;
        private List<String> containerCommand;
        private GoogleCloudMlV1__DiskConfigResponse diskConfig;
        private String imageUri;
        private String tpuTfVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ReplicaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerArgs = defaults.containerArgs;
    	      this.containerCommand = defaults.containerCommand;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.tpuTfVersion = defaults.tpuTfVersion;
        }

        public Builder acceleratorConfig(GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }
        public Builder containerArgs(List<String> containerArgs) {
            this.containerArgs = Objects.requireNonNull(containerArgs);
            return this;
        }
        public Builder containerArgs(String... containerArgs) {
            return containerArgs(List.of(containerArgs));
        }
        public Builder containerCommand(List<String> containerCommand) {
            this.containerCommand = Objects.requireNonNull(containerCommand);
            return this;
        }
        public Builder containerCommand(String... containerCommand) {
            return containerCommand(List.of(containerCommand));
        }
        public Builder diskConfig(GoogleCloudMlV1__DiskConfigResponse diskConfig) {
            this.diskConfig = Objects.requireNonNull(diskConfig);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder tpuTfVersion(String tpuTfVersion) {
            this.tpuTfVersion = Objects.requireNonNull(tpuTfVersion);
            return this;
        }        public GoogleCloudMlV1__ReplicaConfigResponse build() {
            return new GoogleCloudMlV1__ReplicaConfigResponse(acceleratorConfig, containerArgs, containerCommand, diskConfig, imageUri, tpuTfVersion);
        }
    }
}
