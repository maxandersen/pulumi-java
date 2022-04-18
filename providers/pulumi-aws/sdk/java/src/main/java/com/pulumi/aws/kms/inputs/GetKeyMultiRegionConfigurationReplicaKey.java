// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyMultiRegionConfigurationReplicaKey extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyMultiRegionConfigurationReplicaKey Empty = new GetKeyMultiRegionConfigurationReplicaKey();

    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    public GetKeyMultiRegionConfigurationReplicaKey(
        String arn,
        String region) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetKeyMultiRegionConfigurationReplicaKey() {
        this.arn = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyMultiRegionConfigurationReplicaKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyMultiRegionConfigurationReplicaKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.region = defaults.region;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetKeyMultiRegionConfigurationReplicaKey build() {
            return new GetKeyMultiRegionConfigurationReplicaKey(arn, region);
        }
    }
}
