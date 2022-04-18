// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apps_v1beta1.outputs.StatefulSetSpec;
import com.pulumi.kubernetes.apps_v1beta1.outputs.StatefulSetStatus;
import com.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulSet {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    /**
     * Spec defines the desired identities of pods in this set.
     * 
     */
    private final @Nullable StatefulSetSpec spec;
    /**
     * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
     */
    private final @Nullable StatefulSetStatus status;

    @CustomType.Constructor
    private StatefulSet(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @CustomType.Parameter("spec") @Nullable StatefulSetSpec spec,
        @CustomType.Parameter("status") @Nullable StatefulSetStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
    */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Spec defines the desired identities of pods in this set.
     * 
    */
    public Optional<StatefulSetSpec> spec() {
        return Optional.ofNullable(this.spec);
    }
    /**
     * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
    */
    public Optional<StatefulSetStatus> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable StatefulSetSpec spec;
        private @Nullable StatefulSetStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder spec(@Nullable StatefulSetSpec spec) {
            this.spec = spec;
            return this;
        }
        public Builder status(@Nullable StatefulSetStatus status) {
            this.status = status;
            return this;
        }        public StatefulSet build() {
            return new StatefulSet(apiVersion, kind, metadata, spec, status);
        }
    }
}
