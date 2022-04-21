// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream.inputs;

import com.pulumi.awsnative.timestream.enums.ScheduledQueryEncryptionOption;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details on S3 location for error reports that result from running a query.
 * 
 */
public final class ScheduledQueryS3ConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryS3ConfigurationArgs Empty = new ScheduledQueryS3ConfigurationArgs();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="encryptionOption")
    private @Nullable Output<ScheduledQueryEncryptionOption> encryptionOption;

    public Optional<Output<ScheduledQueryEncryptionOption>> encryptionOption() {
        return Optional.ofNullable(this.encryptionOption);
    }

    @Import(name="objectKeyPrefix")
    private @Nullable Output<String> objectKeyPrefix;

    public Optional<Output<String>> objectKeyPrefix() {
        return Optional.ofNullable(this.objectKeyPrefix);
    }

    private ScheduledQueryS3ConfigurationArgs() {}

    private ScheduledQueryS3ConfigurationArgs(ScheduledQueryS3ConfigurationArgs $) {
        this.bucketName = $.bucketName;
        this.encryptionOption = $.encryptionOption;
        this.objectKeyPrefix = $.objectKeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledQueryS3ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryS3ConfigurationArgs $;

        public Builder() {
            $ = new ScheduledQueryS3ConfigurationArgs();
        }

        public Builder(ScheduledQueryS3ConfigurationArgs defaults) {
            $ = new ScheduledQueryS3ConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder encryptionOption(@Nullable Output<ScheduledQueryEncryptionOption> encryptionOption) {
            $.encryptionOption = encryptionOption;
            return this;
        }

        public Builder encryptionOption(ScheduledQueryEncryptionOption encryptionOption) {
            return encryptionOption(Output.of(encryptionOption));
        }

        public Builder objectKeyPrefix(@Nullable Output<String> objectKeyPrefix) {
            $.objectKeyPrefix = objectKeyPrefix;
            return this;
        }

        public Builder objectKeyPrefix(String objectKeyPrefix) {
            return objectKeyPrefix(Output.of(objectKeyPrefix));
        }

        public ScheduledQueryS3ConfigurationArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
