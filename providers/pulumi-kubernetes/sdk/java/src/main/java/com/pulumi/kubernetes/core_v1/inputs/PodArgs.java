// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.PodSpecArgs;
import com.pulumi.kubernetes.core_v1.inputs.PodStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pod is a collection of containers that can run on a host. This resource is created by clients and scheduled onto hosts.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The Pod is scheduled ("PodScheduled"" '.status.condition' is true).
 * 2. The Pod is initialized ("Initialized" '.status.condition' is true).
 * 3. The Pod is ready ("Ready" '.status.condition' is true) and the '.status.phase' is
 *    set to "Running".
 *    Or (for Jobs): The Pod succeeded ('.status.phase' set to "Succeeded").
 * 
 * If the Pod has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the 'customTimeouts' option on the resource.
 * 
 */
public final class PodArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodArgs Empty = new PodArgs();

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
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Specification of the desired behavior of the pod. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<PodSpecArgs> spec;

    public Output<PodSpecArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    /**
     * Most recently observed status of the pod. This data may not be up to date. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="status")
      private final @Nullable Output<PodStatusArgs> status;

    public Output<PodStatusArgs> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public PodArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<PodSpecArgs> spec,
        @Nullable Output<PodStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private PodArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<PodSpecArgs> spec;
        private @Nullable Output<PodStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PodArgs defaults) {
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
        public Builder spec(@Nullable Output<PodSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable PodSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }
        public Builder status(@Nullable Output<PodStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable PodStatusArgs status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public PodArgs build() {
            return new PodArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
