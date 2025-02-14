// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventLogConfigurationResponse {
    private final @Nullable String filter;
    private final String logName;

    @CustomType.Constructor
    private EventLogConfigurationResponse(
        @CustomType.Parameter("filter") @Nullable String filter,
        @CustomType.Parameter("logName") String logName) {
        this.filter = filter;
        this.logName = logName;
    }

    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    public String logName() {
        return this.logName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventLogConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filter;
        private String logName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventLogConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.logName = defaults.logName;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder logName(String logName) {
            this.logName = Objects.requireNonNull(logName);
            return this;
        }        public EventLogConfigurationResponse build() {
            return new EventLogConfigurationResponse(filter, logName);
        }
    }
}
