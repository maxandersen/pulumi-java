// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntityInsightItemResponseQueryTimeInterval {
    /**
     * Insight query end time
     * 
     */
    private final @Nullable String endTime;
    /**
     * Insight query start time
     * 
     */
    private final @Nullable String startTime;

    @CustomType.Constructor
    private EntityInsightItemResponseQueryTimeInterval(
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("startTime") @Nullable String startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * Insight query end time
     * 
    */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Insight query start time
     * 
    */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityInsightItemResponseQueryTimeInterval defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityInsightItemResponseQueryTimeInterval defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public EntityInsightItemResponseQueryTimeInterval build() {
            return new EntityInsightItemResponseQueryTimeInterval(endTime, startTime);
        }
    }
}
