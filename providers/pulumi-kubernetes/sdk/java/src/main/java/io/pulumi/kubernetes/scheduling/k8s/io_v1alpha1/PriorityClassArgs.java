// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.scheduling.k8s.io_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PriorityClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final PriorityClassArgs Empty = new PriorityClassArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="globalDefault")
    private final @Nullable Input<Boolean> globalDefault;

    public Input<Boolean> getGlobalDefault() {
        return this.globalDefault == null ? Input.empty() : this.globalDefault;
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

    @InputImport(name="preemptionPolicy")
    private final @Nullable Input<String> preemptionPolicy;

    public Input<String> getPreemptionPolicy() {
        return this.preemptionPolicy == null ? Input.empty() : this.preemptionPolicy;
    }

    @InputImport(name="value", required=true)
    private final Input<Integer> value;

    public Input<Integer> getValue() {
        return this.value;
    }

    public PriorityClassArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> globalDefault,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<String> preemptionPolicy,
        Input<Integer> value) {
        this.apiVersion = apiVersion;
        this.description = description;
        this.globalDefault = globalDefault;
        this.kind = kind;
        this.metadata = metadata;
        this.preemptionPolicy = preemptionPolicy;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private PriorityClassArgs() {
        this.apiVersion = Input.empty();
        this.description = Input.empty();
        this.globalDefault = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.preemptionPolicy = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> globalDefault;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<String> preemptionPolicy;
        private Input<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.description = defaults.description;
    	      this.globalDefault = defaults.globalDefault;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.preemptionPolicy = defaults.preemptionPolicy;
    	      this.value = defaults.value;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGlobalDefault(@Nullable Input<Boolean> globalDefault) {
            this.globalDefault = globalDefault;
            return this;
        }

        public Builder setGlobalDefault(@Nullable Boolean globalDefault) {
            this.globalDefault = Input.ofNullable(globalDefault);
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

        public Builder setPreemptionPolicy(@Nullable Input<String> preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }

        public Builder setPreemptionPolicy(@Nullable String preemptionPolicy) {
            this.preemptionPolicy = Input.ofNullable(preemptionPolicy);
            return this;
        }

        public Builder setValue(Input<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Integer value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public PriorityClassArgs build() {
            return new PriorityClassArgs(apiVersion, description, globalDefault, kind, metadata, preemptionPolicy, value);
        }
    }
}
