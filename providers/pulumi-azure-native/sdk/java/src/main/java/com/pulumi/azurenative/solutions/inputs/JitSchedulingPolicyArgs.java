// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The JIT scheduling policies.
 * 
 */
public final class JitSchedulingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final JitSchedulingPolicyArgs Empty = new JitSchedulingPolicyArgs();

    @Import(name="duration", required=true)
    private Output<String> duration;

    public Output<String> duration() {
        return this.duration;
    }

    /**
     * The start time of the request.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<String> startTime;

    /**
     * @return The start time of the request.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }

    private JitSchedulingPolicyArgs() {}

    private JitSchedulingPolicyArgs(JitSchedulingPolicyArgs $) {
        this.duration = $.duration;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JitSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JitSchedulingPolicyArgs $;

        public Builder() {
            $ = new JitSchedulingPolicyArgs();
        }

        public Builder(JitSchedulingPolicyArgs defaults) {
            $ = new JitSchedulingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param startTime The start time of the request.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time of the request.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public JitSchedulingPolicyArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
