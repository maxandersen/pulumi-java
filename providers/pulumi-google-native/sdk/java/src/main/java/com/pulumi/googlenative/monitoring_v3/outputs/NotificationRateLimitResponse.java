// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationRateLimitResponse {
    /**
     * @return Not more than one notification per period.
     * 
     */
    private final String period;

    @CustomType.Constructor
    private NotificationRateLimitResponse(@CustomType.Parameter("period") String period) {
        this.period = period;
    }

    /**
     * @return Not more than one notification per period.
     * 
     */
    public String period() {
        return this.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRateLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String period;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRateLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.period = defaults.period;
        }

        public Builder period(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }        public NotificationRateLimitResponse build() {
            return new NotificationRateLimitResponse(period);
        }
    }
}
