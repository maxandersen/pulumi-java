// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerAccessLogs {
    private final String bucket;
    private final String bucketPrefix;
    private final Boolean enabled;
    private final Integer interval;

    @CustomType.Constructor
    private GetLoadBalancerAccessLogs(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("bucketPrefix") String bucketPrefix,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("interval") Integer interval) {
        this.bucket = bucket;
        this.bucketPrefix = bucketPrefix;
        this.enabled = enabled;
        this.interval = interval;
    }

    public String bucket() {
        return this.bucket;
    }
    public String bucketPrefix() {
        return this.bucketPrefix;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public Integer interval() {
        return this.interval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String bucketPrefix;
        private Boolean enabled;
        private Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }        public GetLoadBalancerAccessLogs build() {
            return new GetLoadBalancerAccessLogs(bucket, bucketPrefix, enabled, interval);
        }
    }
}
