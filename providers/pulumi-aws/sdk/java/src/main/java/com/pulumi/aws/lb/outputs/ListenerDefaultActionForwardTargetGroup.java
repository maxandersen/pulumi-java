// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerDefaultActionForwardTargetGroup {
    /**
     * ARN of the target group.
     * 
     */
    private final String arn;
    /**
     * Weight. The range is 0 to 999.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private ListenerDefaultActionForwardTargetGroup(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.arn = arn;
        this.weight = weight;
    }

    /**
     * ARN of the target group.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * Weight. The range is 0 to 999.
     * 
    */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardTargetGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardTargetGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.weight = defaults.weight;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public ListenerDefaultActionForwardTargetGroup build() {
            return new ListenerDefaultActionForwardTargetGroup(arn, weight);
        }
    }
}
