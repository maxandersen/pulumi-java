// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionS3Output;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DataQualityJobDefinitionMonitoringOutput {
    private final DataQualityJobDefinitionS3Output s3Output;

    @CustomType.Constructor
    private DataQualityJobDefinitionMonitoringOutput(@CustomType.Parameter("s3Output") DataQualityJobDefinitionS3Output s3Output) {
        this.s3Output = s3Output;
    }

    public DataQualityJobDefinitionS3Output s3Output() {
        return this.s3Output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionMonitoringOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionS3Output s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionMonitoringOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder s3Output(DataQualityJobDefinitionS3Output s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }        public DataQualityJobDefinitionMonitoringOutput build() {
            return new DataQualityJobDefinitionMonitoringOutput(s3Output);
        }
    }
}
