// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotS3BucketLogDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The location of audio log files collected when conversation logging is enabled for a bot.
 * 
 */
public final class BotAudioLogDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAudioLogDestinationArgs Empty = new BotAudioLogDestinationArgs();

    @Import(name="s3Bucket", required=true)
    private Output<BotS3BucketLogDestinationArgs> s3Bucket;

    public Output<BotS3BucketLogDestinationArgs> s3Bucket() {
        return this.s3Bucket;
    }

    private BotAudioLogDestinationArgs() {}

    private BotAudioLogDestinationArgs(BotAudioLogDestinationArgs $) {
        this.s3Bucket = $.s3Bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAudioLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAudioLogDestinationArgs $;

        public Builder() {
            $ = new BotAudioLogDestinationArgs();
        }

        public Builder(BotAudioLogDestinationArgs defaults) {
            $ = new BotAudioLogDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder s3Bucket(Output<BotS3BucketLogDestinationArgs> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        public Builder s3Bucket(BotS3BucketLogDestinationArgs s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        public BotAudioLogDestinationArgs build() {
            $.s3Bucket = Objects.requireNonNull($.s3Bucket, "expected parameter 's3Bucket' to be non-null");
            return $;
        }
    }

}
