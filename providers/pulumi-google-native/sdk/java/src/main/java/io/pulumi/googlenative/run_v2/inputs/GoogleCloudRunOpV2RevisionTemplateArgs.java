// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.run_v2.enums.GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2ContainerArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2RevisionScalingArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VolumeArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VpcAccessArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RevisionTemplate describes the data a revision should have when created from a template.
 * 
 */
public final class GoogleCloudRunOpV2RevisionTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2RevisionTemplateArgs Empty = new GoogleCloudRunOpV2RevisionTemplateArgs();

    /**
     * KRM-style annotations for the resource.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Enables Confidential Cloud Run in Revisions created using this template.
     * 
     */
    @Import(name="confidential")
      private final @Nullable Output<Boolean> confidential;

    public Output<Boolean> confidential() {
        return this.confidential == null ? Codegen.empty() : this.confidential;
    }

    /**
     * Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    @Import(name="containerConcurrency")
      private final @Nullable Output<Integer> containerConcurrency;

    public Output<Integer> containerConcurrency() {
        return this.containerConcurrency == null ? Codegen.empty() : this.containerConcurrency;
    }

    /**
     * Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    @Import(name="containers")
      private final @Nullable Output<List<GoogleCloudRunOpV2ContainerArgs>> containers;

    public Output<List<GoogleCloudRunOpV2ContainerArgs>> containers() {
        return this.containers == null ? Codegen.empty() : this.containers;
    }

    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    @Import(name="encryptionKey")
      private final @Nullable Output<String> encryptionKey;

    public Output<String> encryptionKey() {
        return this.encryptionKey == null ? Codegen.empty() : this.encryptionKey;
    }

    /**
     * The sandbox environment to host this Revision.
     * 
     */
    @Import(name="executionEnvironment")
      private final @Nullable Output<GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment> executionEnvironment;

    public Output<GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment> executionEnvironment() {
        return this.executionEnvironment == null ? Codegen.empty() : this.executionEnvironment;
    }

    /**
     * KRM-style labels for the resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<String> revision;

    public Output<String> revision() {
        return this.revision == null ? Codegen.empty() : this.revision;
    }

    /**
     * Scaling settings for this Revision.
     * 
     */
    @Import(name="scaling")
      private final @Nullable Output<GoogleCloudRunOpV2RevisionScalingArgs> scaling;

    public Output<GoogleCloudRunOpV2RevisionScalingArgs> scaling() {
        return this.scaling == null ? Codegen.empty() : this.scaling;
    }

    /**
     * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Max allowed time for an instance to respond to a request.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * A list of Volumes to make available to containers.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<GoogleCloudRunOpV2VolumeArgs>> volumes;

    public Output<List<GoogleCloudRunOpV2VolumeArgs>> volumes() {
        return this.volumes == null ? Codegen.empty() : this.volumes;
    }

    /**
     * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    @Import(name="vpcAccess")
      private final @Nullable Output<GoogleCloudRunOpV2VpcAccessArgs> vpcAccess;

    public Output<GoogleCloudRunOpV2VpcAccessArgs> vpcAccess() {
        return this.vpcAccess == null ? Codegen.empty() : this.vpcAccess;
    }

    public GoogleCloudRunOpV2RevisionTemplateArgs(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<Boolean> confidential,
        @Nullable Output<Integer> containerConcurrency,
        @Nullable Output<List<GoogleCloudRunOpV2ContainerArgs>> containers,
        @Nullable Output<String> encryptionKey,
        @Nullable Output<GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment> executionEnvironment,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> revision,
        @Nullable Output<GoogleCloudRunOpV2RevisionScalingArgs> scaling,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<String> timeout,
        @Nullable Output<List<GoogleCloudRunOpV2VolumeArgs>> volumes,
        @Nullable Output<GoogleCloudRunOpV2VpcAccessArgs> vpcAccess) {
        this.annotations = annotations;
        this.confidential = confidential;
        this.containerConcurrency = containerConcurrency;
        this.containers = containers;
        this.encryptionKey = encryptionKey;
        this.executionEnvironment = executionEnvironment;
        this.labels = labels;
        this.revision = revision;
        this.scaling = scaling;
        this.serviceAccount = serviceAccount;
        this.timeout = timeout;
        this.volumes = volumes;
        this.vpcAccess = vpcAccess;
    }

    private GoogleCloudRunOpV2RevisionTemplateArgs() {
        this.annotations = Codegen.empty();
        this.confidential = Codegen.empty();
        this.containerConcurrency = Codegen.empty();
        this.containers = Codegen.empty();
        this.encryptionKey = Codegen.empty();
        this.executionEnvironment = Codegen.empty();
        this.labels = Codegen.empty();
        this.revision = Codegen.empty();
        this.scaling = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.timeout = Codegen.empty();
        this.volumes = Codegen.empty();
        this.vpcAccess = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2RevisionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<Boolean> confidential;
        private @Nullable Output<Integer> containerConcurrency;
        private @Nullable Output<List<GoogleCloudRunOpV2ContainerArgs>> containers;
        private @Nullable Output<String> encryptionKey;
        private @Nullable Output<GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment> executionEnvironment;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> revision;
        private @Nullable Output<GoogleCloudRunOpV2RevisionScalingArgs> scaling;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<String> timeout;
        private @Nullable Output<List<GoogleCloudRunOpV2VolumeArgs>> volumes;
        private @Nullable Output<GoogleCloudRunOpV2VpcAccessArgs> vpcAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2RevisionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.confidential = defaults.confidential;
    	      this.containerConcurrency = defaults.containerConcurrency;
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.labels = defaults.labels;
    	      this.revision = defaults.revision;
    	      this.scaling = defaults.scaling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccess = defaults.vpcAccess;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder confidential(@Nullable Output<Boolean> confidential) {
            this.confidential = confidential;
            return this;
        }
        public Builder confidential(@Nullable Boolean confidential) {
            this.confidential = Codegen.ofNullable(confidential);
            return this;
        }
        public Builder containerConcurrency(@Nullable Output<Integer> containerConcurrency) {
            this.containerConcurrency = containerConcurrency;
            return this;
        }
        public Builder containerConcurrency(@Nullable Integer containerConcurrency) {
            this.containerConcurrency = Codegen.ofNullable(containerConcurrency);
            return this;
        }
        public Builder containers(@Nullable Output<List<GoogleCloudRunOpV2ContainerArgs>> containers) {
            this.containers = containers;
            return this;
        }
        public Builder containers(@Nullable List<GoogleCloudRunOpV2ContainerArgs> containers) {
            this.containers = Codegen.ofNullable(containers);
            return this;
        }
        public Builder containers(GoogleCloudRunOpV2ContainerArgs... containers) {
            return containers(List.of(containers));
        }
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Codegen.ofNullable(encryptionKey);
            return this;
        }
        public Builder executionEnvironment(@Nullable Output<GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment> executionEnvironment) {
            this.executionEnvironment = executionEnvironment;
            return this;
        }
        public Builder executionEnvironment(@Nullable GoogleCloudRunOpV2RevisionTemplateExecutionEnvironment executionEnvironment) {
            this.executionEnvironment = Codegen.ofNullable(executionEnvironment);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder revision(@Nullable Output<String> revision) {
            this.revision = revision;
            return this;
        }
        public Builder revision(@Nullable String revision) {
            this.revision = Codegen.ofNullable(revision);
            return this;
        }
        public Builder scaling(@Nullable Output<GoogleCloudRunOpV2RevisionScalingArgs> scaling) {
            this.scaling = scaling;
            return this;
        }
        public Builder scaling(@Nullable GoogleCloudRunOpV2RevisionScalingArgs scaling) {
            this.scaling = Codegen.ofNullable(scaling);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder volumes(@Nullable Output<List<GoogleCloudRunOpV2VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(@Nullable List<GoogleCloudRunOpV2VolumeArgs> volumes) {
            this.volumes = Codegen.ofNullable(volumes);
            return this;
        }
        public Builder volumes(GoogleCloudRunOpV2VolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }
        public Builder vpcAccess(@Nullable Output<GoogleCloudRunOpV2VpcAccessArgs> vpcAccess) {
            this.vpcAccess = vpcAccess;
            return this;
        }
        public Builder vpcAccess(@Nullable GoogleCloudRunOpV2VpcAccessArgs vpcAccess) {
            this.vpcAccess = Codegen.ofNullable(vpcAccess);
            return this;
        }        public GoogleCloudRunOpV2RevisionTemplateArgs build() {
            return new GoogleCloudRunOpV2RevisionTemplateArgs(annotations, confidential, containerConcurrency, containers, encryptionKey, executionEnvironment, labels, revision, scaling, serviceAccount, timeout, volumes, vpcAccess);
        }
    }
}
