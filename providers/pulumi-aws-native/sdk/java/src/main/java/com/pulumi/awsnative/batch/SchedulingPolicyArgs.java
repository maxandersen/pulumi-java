// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch;

import com.pulumi.awsnative.batch.inputs.SchedulingPolicyFairsharePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchedulingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyArgs Empty = new SchedulingPolicyArgs();

    @Import(name="fairsharePolicy")
    private @Nullable Output<SchedulingPolicyFairsharePolicyArgs> fairsharePolicy;

    public Optional<Output<SchedulingPolicyFairsharePolicyArgs>> fairsharePolicy() {
        return Optional.ofNullable(this.fairsharePolicy);
    }

    /**
     * Name of Scheduling Policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A key-value pair to associate with a resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Object> tags;

    public Optional<Output<Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SchedulingPolicyArgs() {}

    private SchedulingPolicyArgs(SchedulingPolicyArgs $) {
        this.fairsharePolicy = $.fairsharePolicy;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingPolicyArgs $;

        public Builder() {
            $ = new SchedulingPolicyArgs();
        }

        public Builder(SchedulingPolicyArgs defaults) {
            $ = new SchedulingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder fairsharePolicy(@Nullable Output<SchedulingPolicyFairsharePolicyArgs> fairsharePolicy) {
            $.fairsharePolicy = fairsharePolicy;
            return this;
        }

        public Builder fairsharePolicy(SchedulingPolicyFairsharePolicyArgs fairsharePolicy) {
            return fairsharePolicy(Output.of(fairsharePolicy));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<Object> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Object tags) {
            return tags(Output.of(tags));
        }

        public SchedulingPolicyArgs build() {
            return $;
        }
    }

}
