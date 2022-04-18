// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The JIT scheduling policies.
 * 
 */
public final class JitSchedulingPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final JitSchedulingPolicyResponse Empty = new JitSchedulingPolicyResponse();

    @Import(name="duration", required=true)
      private final String duration;

    public String duration() {
        return this.duration;
    }

    /**
     * The start time of the request.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * The type of JIT schedule.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public JitSchedulingPolicyResponse(
        String duration,
        String startTime,
        String type) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JitSchedulingPolicyResponse() {
        this.duration = null;
        this.startTime = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitSchedulingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JitSchedulingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public JitSchedulingPolicyResponse build() {
            return new JitSchedulingPolicyResponse(duration, startTime, type);
        }
    }
}
