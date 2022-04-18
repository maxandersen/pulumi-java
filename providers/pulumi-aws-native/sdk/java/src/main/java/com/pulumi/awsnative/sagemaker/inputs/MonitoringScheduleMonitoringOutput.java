// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleS3Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The output object for a monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringOutput extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleMonitoringOutput Empty = new MonitoringScheduleMonitoringOutput();

    @Import(name="s3Output", required=true)
      private final MonitoringScheduleS3Output s3Output;

    public MonitoringScheduleS3Output s3Output() {
        return this.s3Output;
    }

    public MonitoringScheduleMonitoringOutput(MonitoringScheduleS3Output s3Output) {
        this.s3Output = Objects.requireNonNull(s3Output, "expected parameter 's3Output' to be non-null");
    }

    private MonitoringScheduleMonitoringOutput() {
        this.s3Output = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleS3Output s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder s3Output(MonitoringScheduleS3Output s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }        public MonitoringScheduleMonitoringOutput build() {
            return new MonitoringScheduleMonitoringOutput(s3Output);
        }
    }
}
