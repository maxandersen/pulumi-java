// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.extensions_v1beta1.inputs.NetworkPolicySpecArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a set of Pods
 * 
 */
public final class NetworkPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyArgs Empty = new NetworkPolicyArgs();

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
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Specification of the desired behavior for this NetworkPolicy.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<NetworkPolicySpecArgs> spec;

    public Output<NetworkPolicySpecArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    public NetworkPolicyArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<NetworkPolicySpecArgs> spec) {
        this.apiVersion = Codegen.stringProp("apiVersion").output().arg(apiVersion).getNullable();
        this.kind = Codegen.stringProp("kind").output().arg(kind).getNullable();
        this.metadata = metadata;
        this.spec = spec;
    }

    private NetworkPolicyArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<NetworkPolicySpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
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
        public Builder spec(@Nullable Output<NetworkPolicySpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable NetworkPolicySpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }        public NetworkPolicyArgs build() {
            return new NetworkPolicyArgs(apiVersion, kind, metadata, spec);
        }
    }
}
