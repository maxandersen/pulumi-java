// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomMetricArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomMetricArgs Empty = new GetCustomMetricArgs();

    /**
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn&#39;t begin with aws: . Cannot be updated once defined.
     * 
     */
    @Import(name="metricName", required=true)
    private String metricName;

    public String metricName() {
        return this.metricName;
    }

    private GetCustomMetricArgs() {}

    private GetCustomMetricArgs(GetCustomMetricArgs $) {
        this.metricName = $.metricName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomMetricArgs $;

        public Builder() {
            $ = new GetCustomMetricArgs();
        }

        public Builder(GetCustomMetricArgs defaults) {
            $ = new GetCustomMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder metricName(String metricName) {
            $.metricName = metricName;
            return this;
        }

        public GetCustomMetricArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            return $;
        }
    }

}
