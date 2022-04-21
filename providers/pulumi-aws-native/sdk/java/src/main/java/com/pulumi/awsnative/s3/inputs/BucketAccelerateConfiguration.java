// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketAccelerateConfigurationAccelerationStatus;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class BucketAccelerateConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final BucketAccelerateConfiguration Empty = new BucketAccelerateConfiguration();

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     * 
     */
    @Import(name="accelerationStatus", required=true)
    private BucketAccelerateConfigurationAccelerationStatus accelerationStatus;

    public BucketAccelerateConfigurationAccelerationStatus accelerationStatus() {
        return this.accelerationStatus;
    }

    private BucketAccelerateConfiguration() {}

    private BucketAccelerateConfiguration(BucketAccelerateConfiguration $) {
        this.accelerationStatus = $.accelerationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAccelerateConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccelerateConfiguration $;

        public Builder() {
            $ = new BucketAccelerateConfiguration();
        }

        public Builder(BucketAccelerateConfiguration defaults) {
            $ = new BucketAccelerateConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder accelerationStatus(BucketAccelerateConfigurationAccelerationStatus accelerationStatus) {
            $.accelerationStatus = accelerationStatus;
            return this;
        }

        public BucketAccelerateConfiguration build() {
            $.accelerationStatus = Objects.requireNonNull($.accelerationStatus, "expected parameter 'accelerationStatus' to be non-null");
            return $;
        }
    }

}
