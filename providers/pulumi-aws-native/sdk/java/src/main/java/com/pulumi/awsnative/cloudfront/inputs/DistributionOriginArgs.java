// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionCustomOriginConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.DistributionOriginCustomHeaderArgs;
import com.pulumi.awsnative.cloudfront.inputs.DistributionOriginShieldArgs;
import com.pulumi.awsnative.cloudfront.inputs.DistributionS3OriginConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOriginArgs Empty = new DistributionOriginArgs();

    @Import(name="connectionAttempts")
    private @Nullable Output<Integer> connectionAttempts;

    public Optional<Output<Integer>> connectionAttempts() {
        return Optional.ofNullable(this.connectionAttempts);
    }

    @Import(name="connectionTimeout")
    private @Nullable Output<Integer> connectionTimeout;

    public Optional<Output<Integer>> connectionTimeout() {
        return Optional.ofNullable(this.connectionTimeout);
    }

    @Import(name="customOriginConfig")
    private @Nullable Output<DistributionCustomOriginConfigArgs> customOriginConfig;

    public Optional<Output<DistributionCustomOriginConfigArgs>> customOriginConfig() {
        return Optional.ofNullable(this.customOriginConfig);
    }

    @Import(name="domainName", required=true)
    private Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName;
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="originCustomHeaders")
    private @Nullable Output<List<DistributionOriginCustomHeaderArgs>> originCustomHeaders;

    public Optional<Output<List<DistributionOriginCustomHeaderArgs>>> originCustomHeaders() {
        return Optional.ofNullable(this.originCustomHeaders);
    }

    @Import(name="originPath")
    private @Nullable Output<String> originPath;

    public Optional<Output<String>> originPath() {
        return Optional.ofNullable(this.originPath);
    }

    @Import(name="originShield")
    private @Nullable Output<DistributionOriginShieldArgs> originShield;

    public Optional<Output<DistributionOriginShieldArgs>> originShield() {
        return Optional.ofNullable(this.originShield);
    }

    @Import(name="s3OriginConfig")
    private @Nullable Output<DistributionS3OriginConfigArgs> s3OriginConfig;

    public Optional<Output<DistributionS3OriginConfigArgs>> s3OriginConfig() {
        return Optional.ofNullable(this.s3OriginConfig);
    }

    private DistributionOriginArgs() {}

    private DistributionOriginArgs(DistributionOriginArgs $) {
        this.connectionAttempts = $.connectionAttempts;
        this.connectionTimeout = $.connectionTimeout;
        this.customOriginConfig = $.customOriginConfig;
        this.domainName = $.domainName;
        this.id = $.id;
        this.originCustomHeaders = $.originCustomHeaders;
        this.originPath = $.originPath;
        this.originShield = $.originShield;
        this.s3OriginConfig = $.s3OriginConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginArgs $;

        public Builder() {
            $ = new DistributionOriginArgs();
        }

        public Builder(DistributionOriginArgs defaults) {
            $ = new DistributionOriginArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionAttempts(@Nullable Output<Integer> connectionAttempts) {
            $.connectionAttempts = connectionAttempts;
            return this;
        }

        public Builder connectionAttempts(Integer connectionAttempts) {
            return connectionAttempts(Output.of(connectionAttempts));
        }

        public Builder connectionTimeout(@Nullable Output<Integer> connectionTimeout) {
            $.connectionTimeout = connectionTimeout;
            return this;
        }

        public Builder connectionTimeout(Integer connectionTimeout) {
            return connectionTimeout(Output.of(connectionTimeout));
        }

        public Builder customOriginConfig(@Nullable Output<DistributionCustomOriginConfigArgs> customOriginConfig) {
            $.customOriginConfig = customOriginConfig;
            return this;
        }

        public Builder customOriginConfig(DistributionCustomOriginConfigArgs customOriginConfig) {
            return customOriginConfig(Output.of(customOriginConfig));
        }

        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder originCustomHeaders(@Nullable Output<List<DistributionOriginCustomHeaderArgs>> originCustomHeaders) {
            $.originCustomHeaders = originCustomHeaders;
            return this;
        }

        public Builder originCustomHeaders(List<DistributionOriginCustomHeaderArgs> originCustomHeaders) {
            return originCustomHeaders(Output.of(originCustomHeaders));
        }

        public Builder originCustomHeaders(DistributionOriginCustomHeaderArgs... originCustomHeaders) {
            return originCustomHeaders(List.of(originCustomHeaders));
        }

        public Builder originPath(@Nullable Output<String> originPath) {
            $.originPath = originPath;
            return this;
        }

        public Builder originPath(String originPath) {
            return originPath(Output.of(originPath));
        }

        public Builder originShield(@Nullable Output<DistributionOriginShieldArgs> originShield) {
            $.originShield = originShield;
            return this;
        }

        public Builder originShield(DistributionOriginShieldArgs originShield) {
            return originShield(Output.of(originShield));
        }

        public Builder s3OriginConfig(@Nullable Output<DistributionS3OriginConfigArgs> s3OriginConfig) {
            $.s3OriginConfig = s3OriginConfig;
            return this;
        }

        public Builder s3OriginConfig(DistributionS3OriginConfigArgs s3OriginConfig) {
            return s3OriginConfig(Output.of(s3OriginConfig));
        }

        public DistributionOriginArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
