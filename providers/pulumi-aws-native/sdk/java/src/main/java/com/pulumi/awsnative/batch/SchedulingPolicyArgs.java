// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch;

import com.pulumi.awsnative.batch.inputs.SchedulingPolicyFairsharePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchedulingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyArgs Empty = new SchedulingPolicyArgs();

    @Import(name="fairsharePolicy")
      private final @Nullable Output<SchedulingPolicyFairsharePolicyArgs> fairsharePolicy;

    public Output<SchedulingPolicyFairsharePolicyArgs> fairsharePolicy() {
        return this.fairsharePolicy == null ? Codegen.empty() : this.fairsharePolicy;
    }

    /**
     * Name of Scheduling Policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A key-value pair to associate with a resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SchedulingPolicyArgs(
        @Nullable Output<SchedulingPolicyFairsharePolicyArgs> fairsharePolicy,
        @Nullable Output<String> name,
        @Nullable Output<Object> tags) {
        this.fairsharePolicy = fairsharePolicy;
        this.name = name;
        this.tags = tags;
    }

    private SchedulingPolicyArgs() {
        this.fairsharePolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SchedulingPolicyFairsharePolicyArgs> fairsharePolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fairsharePolicy = defaults.fairsharePolicy;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder fairsharePolicy(@Nullable Output<SchedulingPolicyFairsharePolicyArgs> fairsharePolicy) {
            this.fairsharePolicy = fairsharePolicy;
            return this;
        }
        public Builder fairsharePolicy(@Nullable SchedulingPolicyFairsharePolicyArgs fairsharePolicy) {
            this.fairsharePolicy = Codegen.ofNullable(fairsharePolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public SchedulingPolicyArgs build() {
            return new SchedulingPolicyArgs(fairsharePolicy, name, tags);
        }
    }
}
