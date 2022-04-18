// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.cloudrun.inputs.ServiceStatusConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceStatusArgs Empty = new ServiceStatusArgs();

    @Import(name="conditions")
      private final @Nullable Output<List<ServiceStatusConditionArgs>> conditions;

    public Output<List<ServiceStatusConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    @Import(name="latestCreatedRevisionName")
      private final @Nullable Output<String> latestCreatedRevisionName;

    public Output<String> latestCreatedRevisionName() {
        return this.latestCreatedRevisionName == null ? Codegen.empty() : this.latestCreatedRevisionName;
    }

    @Import(name="latestReadyRevisionName")
      private final @Nullable Output<String> latestReadyRevisionName;

    public Output<String> latestReadyRevisionName() {
        return this.latestReadyRevisionName == null ? Codegen.empty() : this.latestReadyRevisionName;
    }

    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> observedGeneration() {
        return this.observedGeneration == null ? Codegen.empty() : this.observedGeneration;
    }

    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public ServiceStatusArgs(
        @Nullable Output<List<ServiceStatusConditionArgs>> conditions,
        @Nullable Output<String> latestCreatedRevisionName,
        @Nullable Output<String> latestReadyRevisionName,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<String> url) {
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.url = url;
    }

    private ServiceStatusArgs() {
        this.conditions = Codegen.empty();
        this.latestCreatedRevisionName = Codegen.empty();
        this.latestReadyRevisionName = Codegen.empty();
        this.observedGeneration = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceStatusConditionArgs>> conditions;
        private @Nullable Output<String> latestCreatedRevisionName;
        private @Nullable Output<String> latestReadyRevisionName;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.url = defaults.url;
        }

        public Builder conditions(@Nullable Output<List<ServiceStatusConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<ServiceStatusConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(ServiceStatusConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder latestCreatedRevisionName(@Nullable Output<String> latestCreatedRevisionName) {
            this.latestCreatedRevisionName = latestCreatedRevisionName;
            return this;
        }
        public Builder latestCreatedRevisionName(@Nullable String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Codegen.ofNullable(latestCreatedRevisionName);
            return this;
        }
        public Builder latestReadyRevisionName(@Nullable Output<String> latestReadyRevisionName) {
            this.latestReadyRevisionName = latestReadyRevisionName;
            return this;
        }
        public Builder latestReadyRevisionName(@Nullable String latestReadyRevisionName) {
            this.latestReadyRevisionName = Codegen.ofNullable(latestReadyRevisionName);
            return this;
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Codegen.ofNullable(observedGeneration);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public ServiceStatusArgs build() {
            return new ServiceStatusArgs(conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, url);
        }
    }
}
