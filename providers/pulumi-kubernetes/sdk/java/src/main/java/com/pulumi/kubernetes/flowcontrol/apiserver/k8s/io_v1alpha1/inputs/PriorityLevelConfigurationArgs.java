// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.PriorityLevelConfigurationSpecArgs;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.PriorityLevelConfigurationStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfiguration represents the configuration of a priority level.
 * 
 */
public final class PriorityLevelConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationArgs Empty = new PriorityLevelConfigurationArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * `metadata` is the standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * `spec` is the specification of the desired behavior of a &#34;request-priority&#34;. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<PriorityLevelConfigurationSpecArgs> spec;

    public Output<PriorityLevelConfigurationSpecArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    /**
     * `status` is the current status of a &#34;request-priority&#34;. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="status")
      private final @Nullable Output<PriorityLevelConfigurationStatusArgs> status;

    public Output<PriorityLevelConfigurationStatusArgs> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public PriorityLevelConfigurationArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<PriorityLevelConfigurationSpecArgs> spec,
        @Nullable Output<PriorityLevelConfigurationStatusArgs> status) {
        this.apiVersion = Codegen.stringProp("apiVersion").output().arg(apiVersion).getNullable();
        this.kind = Codegen.stringProp("kind").output().arg(kind).getNullable();
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private PriorityLevelConfigurationArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<PriorityLevelConfigurationSpecArgs> spec;
        private @Nullable Output<PriorityLevelConfigurationStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder spec(@Nullable Output<PriorityLevelConfigurationSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable PriorityLevelConfigurationSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }
        public Builder status(@Nullable Output<PriorityLevelConfigurationStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable PriorityLevelConfigurationStatusArgs status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public PriorityLevelConfigurationArgs build() {
            return new PriorityLevelConfigurationArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
