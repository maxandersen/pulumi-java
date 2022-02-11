// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.DeploymentSpecArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.DeploymentStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="spec")
    private final @Nullable Input<DeploymentSpecArgs> spec;

    public Input<DeploymentSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    @InputImport(name="status")
    private final @Nullable Input<DeploymentStatusArgs> status;

    public Input<DeploymentStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public DeploymentArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<DeploymentSpecArgs> spec,
        @Nullable Input<DeploymentStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private DeploymentArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<DeploymentSpecArgs> spec;
        private @Nullable Input<DeploymentStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setSpec(@Nullable Input<DeploymentSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable DeploymentSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder setStatus(@Nullable Input<DeploymentStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable DeploymentStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public DeploymentArgs build() {
            return new DeploymentArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
