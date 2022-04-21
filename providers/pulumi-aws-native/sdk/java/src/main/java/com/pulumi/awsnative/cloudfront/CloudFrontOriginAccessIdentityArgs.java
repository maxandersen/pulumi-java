// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront;

import com.pulumi.awsnative.cloudfront.inputs.CloudFrontOriginAccessIdentityConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class CloudFrontOriginAccessIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudFrontOriginAccessIdentityArgs Empty = new CloudFrontOriginAccessIdentityArgs();

    @Import(name="cloudFrontOriginAccessIdentityConfig", required=true)
    private Output<CloudFrontOriginAccessIdentityConfigArgs> cloudFrontOriginAccessIdentityConfig;

    public Output<CloudFrontOriginAccessIdentityConfigArgs> cloudFrontOriginAccessIdentityConfig() {
        return this.cloudFrontOriginAccessIdentityConfig;
    }

    private CloudFrontOriginAccessIdentityArgs() {}

    private CloudFrontOriginAccessIdentityArgs(CloudFrontOriginAccessIdentityArgs $) {
        this.cloudFrontOriginAccessIdentityConfig = $.cloudFrontOriginAccessIdentityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudFrontOriginAccessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudFrontOriginAccessIdentityArgs $;

        public Builder() {
            $ = new CloudFrontOriginAccessIdentityArgs();
        }

        public Builder(CloudFrontOriginAccessIdentityArgs defaults) {
            $ = new CloudFrontOriginAccessIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudFrontOriginAccessIdentityConfig(Output<CloudFrontOriginAccessIdentityConfigArgs> cloudFrontOriginAccessIdentityConfig) {
            $.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
            return this;
        }

        public Builder cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigArgs cloudFrontOriginAccessIdentityConfig) {
            return cloudFrontOriginAccessIdentityConfig(Output.of(cloudFrontOriginAccessIdentityConfig));
        }

        public CloudFrontOriginAccessIdentityArgs build() {
            $.cloudFrontOriginAccessIdentityConfig = Objects.requireNonNull($.cloudFrontOriginAccessIdentityConfig, "expected parameter 'cloudFrontOriginAccessIdentityConfig' to be non-null");
            return $;
        }
    }

}
