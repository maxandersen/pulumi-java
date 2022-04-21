// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionCustomOriginConfig extends com.pulumi.resources.InvokeArgs {

    public static final DistributionCustomOriginConfig Empty = new DistributionCustomOriginConfig();

    @Import(name="hTTPPort")
    private @Nullable Integer hTTPPort;

    public Optional<Integer> hTTPPort() {
        return Optional.ofNullable(this.hTTPPort);
    }

    @Import(name="hTTPSPort")
    private @Nullable Integer hTTPSPort;

    public Optional<Integer> hTTPSPort() {
        return Optional.ofNullable(this.hTTPSPort);
    }

    @Import(name="originKeepaliveTimeout")
    private @Nullable Integer originKeepaliveTimeout;

    public Optional<Integer> originKeepaliveTimeout() {
        return Optional.ofNullable(this.originKeepaliveTimeout);
    }

    @Import(name="originProtocolPolicy", required=true)
    private String originProtocolPolicy;

    public String originProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    @Import(name="originReadTimeout")
    private @Nullable Integer originReadTimeout;

    public Optional<Integer> originReadTimeout() {
        return Optional.ofNullable(this.originReadTimeout);
    }

    @Import(name="originSSLProtocols")
    private @Nullable List<String> originSSLProtocols;

    public Optional<List<String>> originSSLProtocols() {
        return Optional.ofNullable(this.originSSLProtocols);
    }

    private DistributionCustomOriginConfig() {}

    private DistributionCustomOriginConfig(DistributionCustomOriginConfig $) {
        this.hTTPPort = $.hTTPPort;
        this.hTTPSPort = $.hTTPSPort;
        this.originKeepaliveTimeout = $.originKeepaliveTimeout;
        this.originProtocolPolicy = $.originProtocolPolicy;
        this.originReadTimeout = $.originReadTimeout;
        this.originSSLProtocols = $.originSSLProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionCustomOriginConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionCustomOriginConfig $;

        public Builder() {
            $ = new DistributionCustomOriginConfig();
        }

        public Builder(DistributionCustomOriginConfig defaults) {
            $ = new DistributionCustomOriginConfig(Objects.requireNonNull(defaults));
        }

        public Builder hTTPPort(@Nullable Integer hTTPPort) {
            $.hTTPPort = hTTPPort;
            return this;
        }

        public Builder hTTPSPort(@Nullable Integer hTTPSPort) {
            $.hTTPSPort = hTTPSPort;
            return this;
        }

        public Builder originKeepaliveTimeout(@Nullable Integer originKeepaliveTimeout) {
            $.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }

        public Builder originProtocolPolicy(String originProtocolPolicy) {
            $.originProtocolPolicy = originProtocolPolicy;
            return this;
        }

        public Builder originReadTimeout(@Nullable Integer originReadTimeout) {
            $.originReadTimeout = originReadTimeout;
            return this;
        }

        public Builder originSSLProtocols(@Nullable List<String> originSSLProtocols) {
            $.originSSLProtocols = originSSLProtocols;
            return this;
        }

        public Builder originSSLProtocols(String... originSSLProtocols) {
            return originSSLProtocols(List.of(originSSLProtocols));
        }

        public DistributionCustomOriginConfig build() {
            $.originProtocolPolicy = Objects.requireNonNull($.originProtocolPolicy, "expected parameter 'originProtocolPolicy' to be non-null");
            return $;
        }
    }

}
