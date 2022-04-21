// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionLegacyS3OriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionLegacyS3OriginArgs Empty = new DistributionLegacyS3OriginArgs();

    @Import(name="dNSName", required=true)
    private Output<String> dNSName;

    public Output<String> dNSName() {
        return this.dNSName;
    }

    @Import(name="originAccessIdentity")
    private @Nullable Output<String> originAccessIdentity;

    public Optional<Output<String>> originAccessIdentity() {
        return Optional.ofNullable(this.originAccessIdentity);
    }

    private DistributionLegacyS3OriginArgs() {}

    private DistributionLegacyS3OriginArgs(DistributionLegacyS3OriginArgs $) {
        this.dNSName = $.dNSName;
        this.originAccessIdentity = $.originAccessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionLegacyS3OriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionLegacyS3OriginArgs $;

        public Builder() {
            $ = new DistributionLegacyS3OriginArgs();
        }

        public Builder(DistributionLegacyS3OriginArgs defaults) {
            $ = new DistributionLegacyS3OriginArgs(Objects.requireNonNull(defaults));
        }

        public Builder dNSName(Output<String> dNSName) {
            $.dNSName = dNSName;
            return this;
        }

        public Builder dNSName(String dNSName) {
            return dNSName(Output.of(dNSName));
        }

        public Builder originAccessIdentity(@Nullable Output<String> originAccessIdentity) {
            $.originAccessIdentity = originAccessIdentity;
            return this;
        }

        public Builder originAccessIdentity(String originAccessIdentity) {
            return originAccessIdentity(Output.of(originAccessIdentity));
        }

        public DistributionLegacyS3OriginArgs build() {
            $.dNSName = Objects.requireNonNull($.dNSName, "expected parameter 'dNSName' to be non-null");
            return $;
        }
    }

}
