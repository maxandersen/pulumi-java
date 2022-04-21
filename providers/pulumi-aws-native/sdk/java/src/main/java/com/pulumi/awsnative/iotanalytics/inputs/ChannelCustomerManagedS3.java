// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelCustomerManagedS3 extends com.pulumi.resources.InvokeArgs {

    public static final ChannelCustomerManagedS3 Empty = new ChannelCustomerManagedS3();

    @Import(name="bucket", required=true)
    private String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="keyPrefix")
    private @Nullable String keyPrefix;

    public Optional<String> keyPrefix() {
        return Optional.ofNullable(this.keyPrefix);
    }

    @Import(name="roleArn", required=true)
    private String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    private ChannelCustomerManagedS3() {}

    private ChannelCustomerManagedS3(ChannelCustomerManagedS3 $) {
        this.bucket = $.bucket;
        this.keyPrefix = $.keyPrefix;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelCustomerManagedS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelCustomerManagedS3 $;

        public Builder() {
            $ = new ChannelCustomerManagedS3();
        }

        public Builder(ChannelCustomerManagedS3 defaults) {
            $ = new ChannelCustomerManagedS3(Objects.requireNonNull(defaults));
        }

        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder keyPrefix(@Nullable String keyPrefix) {
            $.keyPrefix = keyPrefix;
            return this;
        }

        public Builder roleArn(String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public ChannelCustomerManagedS3 build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
