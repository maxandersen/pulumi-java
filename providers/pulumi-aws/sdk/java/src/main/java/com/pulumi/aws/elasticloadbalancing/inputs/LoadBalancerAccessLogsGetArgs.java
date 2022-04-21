// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerAccessLogsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAccessLogsGetArgs Empty = new LoadBalancerAccessLogsGetArgs();

    /**
     * The S3 bucket name to store the logs in.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    /**
     * Boolean to enable / disable `access_logs`. Default is `true`
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The publishing interval in minutes. Default: 60 minutes.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    private LoadBalancerAccessLogsGetArgs() {}

    private LoadBalancerAccessLogsGetArgs(LoadBalancerAccessLogsGetArgs $) {
        this.bucket = $.bucket;
        this.bucketPrefix = $.bucketPrefix;
        this.enabled = $.enabled;
        this.interval = $.interval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerAccessLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerAccessLogsGetArgs $;

        public Builder() {
            $ = new LoadBalancerAccessLogsGetArgs();
        }

        public Builder(LoadBalancerAccessLogsGetArgs defaults) {
            $ = new LoadBalancerAccessLogsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public LoadBalancerAccessLogsGetArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
