// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerAccessLogs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerAccessLogs Empty = new GetLoadBalancerAccessLogs();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="prefix", required=true)
      private final String prefix;

    public String prefix() {
        return this.prefix;
    }

    public GetLoadBalancerAccessLogs(
        String bucket,
        Boolean enabled,
        String prefix) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
    }

    private GetLoadBalancerAccessLogs() {
        this.bucket = null;
        this.enabled = null;
        this.prefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private Boolean enabled;
        private String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }        public GetLoadBalancerAccessLogs build() {
            return new GetLoadBalancerAccessLogs(bucket, enabled, prefix);
        }
    }
}
