// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigHeadersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OriginRequestPolicyHeadersConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyHeadersConfigArgs Empty = new OriginRequestPolicyHeadersConfigArgs();

    @Import(name="headerBehavior")
    private @Nullable Output<String> headerBehavior;

    public Optional<Output<String>> headerBehavior() {
        return Optional.ofNullable(this.headerBehavior);
    }

    @Import(name="headers")
    private @Nullable Output<OriginRequestPolicyHeadersConfigHeadersArgs> headers;

    public Optional<Output<OriginRequestPolicyHeadersConfigHeadersArgs>> headers() {
        return Optional.ofNullable(this.headers);
    }

    private OriginRequestPolicyHeadersConfigArgs() {}

    private OriginRequestPolicyHeadersConfigArgs(OriginRequestPolicyHeadersConfigArgs $) {
        this.headerBehavior = $.headerBehavior;
        this.headers = $.headers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginRequestPolicyHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginRequestPolicyHeadersConfigArgs $;

        public Builder() {
            $ = new OriginRequestPolicyHeadersConfigArgs();
        }

        public Builder(OriginRequestPolicyHeadersConfigArgs defaults) {
            $ = new OriginRequestPolicyHeadersConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerBehavior(@Nullable Output<String> headerBehavior) {
            $.headerBehavior = headerBehavior;
            return this;
        }

        public Builder headerBehavior(String headerBehavior) {
            return headerBehavior(Output.of(headerBehavior));
        }

        public Builder headers(@Nullable Output<OriginRequestPolicyHeadersConfigHeadersArgs> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(OriginRequestPolicyHeadersConfigHeadersArgs headers) {
            return headers(Output.of(headers));
        }

        public OriginRequestPolicyHeadersConfigArgs build() {
            return $;
        }
    }

}
