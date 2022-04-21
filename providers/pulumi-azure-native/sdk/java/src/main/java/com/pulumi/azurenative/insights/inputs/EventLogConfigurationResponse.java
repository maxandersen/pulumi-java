// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventLogConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventLogConfigurationResponse Empty = new EventLogConfigurationResponse();

    @Import(name="filter")
    private @Nullable String filter;

    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    @Import(name="logName", required=true)
    private String logName;

    public String logName() {
        return this.logName;
    }

    private EventLogConfigurationResponse() {}

    private EventLogConfigurationResponse(EventLogConfigurationResponse $) {
        this.filter = $.filter;
        this.logName = $.logName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventLogConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventLogConfigurationResponse $;

        public Builder() {
            $ = new EventLogConfigurationResponse();
        }

        public Builder(EventLogConfigurationResponse defaults) {
            $ = new EventLogConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        public Builder logName(String logName) {
            $.logName = logName;
            return this;
        }

        public EventLogConfigurationResponse build() {
            $.logName = Objects.requireNonNull($.logName, "expected parameter 'logName' to be non-null");
            return $;
        }
    }

}
