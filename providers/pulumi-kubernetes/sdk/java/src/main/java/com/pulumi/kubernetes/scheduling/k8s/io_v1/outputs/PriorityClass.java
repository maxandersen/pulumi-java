// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.scheduling.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PriorityClass {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
     */
    private final @Nullable String description;
    /**
     * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
     */
    private final @Nullable Boolean globalDefault;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * 
     */
    private final @Nullable String preemptionPolicy;
    /**
     * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * 
     */
    private final Integer value;

    @CustomType.Constructor
    private PriorityClass(
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("globalDefault") @Nullable Boolean globalDefault,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @CustomType.Parameter("preemptionPolicy") @Nullable String preemptionPolicy,
        @CustomType.Parameter("value") Integer value) {
        this.apiVersion = apiVersion;
        this.description = description;
        this.globalDefault = globalDefault;
        this.kind = kind;
        this.metadata = metadata;
        this.preemptionPolicy = preemptionPolicy;
        this.value = value;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
    */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
    */
    public Optional<Boolean> globalDefault() {
        return Optional.ofNullable(this.globalDefault);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
    */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * 
    */
    public Optional<String> preemptionPolicy() {
        return Optional.ofNullable(this.preemptionPolicy);
    }
    /**
     * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * 
    */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityClass defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String description;
        private @Nullable Boolean globalDefault;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable String preemptionPolicy;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.description = defaults.description;
    	      this.globalDefault = defaults.globalDefault;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.preemptionPolicy = defaults.preemptionPolicy;
    	      this.value = defaults.value;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder globalDefault(@Nullable Boolean globalDefault) {
            this.globalDefault = globalDefault;
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
        public Builder preemptionPolicy(@Nullable String preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public PriorityClass build() {
            return new PriorityClass(apiVersion, description, globalDefault, kind, metadata, preemptionPolicy, value);
        }
    }
}
