// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GCPolicyMaxAgeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GCPolicyMaxAgeArgs Empty = new GCPolicyMaxAgeArgs();

    /**
     * Number of days before applying GC policy.
     * 
     * @deprecated
     * Deprecated in favor of duration
     * 
     */
    @Deprecated /* Deprecated in favor of duration */
    @Import(name="days")
      private final @Nullable Output<Integer> days;

    @Deprecated /* Deprecated in favor of duration */
    public Output<Integer> days() {
        return this.days == null ? Codegen.empty() : this.days;
    }

    /**
     * Duration before applying GC policy (ex. &#34;8h&#34;). This is required when `days` isn&#39;t set
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> duration() {
        return this.duration == null ? Codegen.empty() : this.duration;
    }

    public GCPolicyMaxAgeArgs(
        @Nullable Output<Integer> days,
        @Nullable Output<String> duration) {
        this.days = days;
        this.duration = duration;
    }

    private GCPolicyMaxAgeArgs() {
        this.days = Codegen.empty();
        this.duration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GCPolicyMaxAgeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> days;
        private @Nullable Output<String> duration;

        public Builder() {
    	      // Empty
        }

        public Builder(GCPolicyMaxAgeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.duration = defaults.duration;
        }

        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }
        public Builder days(@Nullable Integer days) {
            this.days = Codegen.ofNullable(days);
            return this;
        }
        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = Codegen.ofNullable(duration);
            return this;
        }        public GCPolicyMaxAgeArgs build() {
            return new GCPolicyMaxAgeArgs(days, duration);
        }
    }
}
