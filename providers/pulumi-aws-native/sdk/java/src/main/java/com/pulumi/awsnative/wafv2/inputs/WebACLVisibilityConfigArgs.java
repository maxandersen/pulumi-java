// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Visibility Metric of the WebACL.
 * 
 */
public final class WebACLVisibilityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLVisibilityConfigArgs Empty = new WebACLVisibilityConfigArgs();

    @Import(name="cloudWatchMetricsEnabled", required=true)
    private Output<Boolean> cloudWatchMetricsEnabled;

    public Output<Boolean> cloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    @Import(name="sampledRequestsEnabled", required=true)
    private Output<Boolean> sampledRequestsEnabled;

    public Output<Boolean> sampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    private WebACLVisibilityConfigArgs() {}

    private WebACLVisibilityConfigArgs(WebACLVisibilityConfigArgs $) {
        this.cloudWatchMetricsEnabled = $.cloudWatchMetricsEnabled;
        this.metricName = $.metricName;
        this.sampledRequestsEnabled = $.sampledRequestsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLVisibilityConfigArgs $;

        public Builder() {
            $ = new WebACLVisibilityConfigArgs();
        }

        public Builder(WebACLVisibilityConfigArgs defaults) {
            $ = new WebACLVisibilityConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudWatchMetricsEnabled(Output<Boolean> cloudWatchMetricsEnabled) {
            $.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            return this;
        }

        public Builder cloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
            return cloudWatchMetricsEnabled(Output.of(cloudWatchMetricsEnabled));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder sampledRequestsEnabled(Output<Boolean> sampledRequestsEnabled) {
            $.sampledRequestsEnabled = sampledRequestsEnabled;
            return this;
        }

        public Builder sampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            return sampledRequestsEnabled(Output.of(sampledRequestsEnabled));
        }

        public WebACLVisibilityConfigArgs build() {
            $.cloudWatchMetricsEnabled = Objects.requireNonNull($.cloudWatchMetricsEnabled, "expected parameter 'cloudWatchMetricsEnabled' to be non-null");
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.sampledRequestsEnabled = Objects.requireNonNull($.sampledRequestsEnabled, "expected parameter 'sampledRequestsEnabled' to be non-null");
            return $;
        }
    }

}
