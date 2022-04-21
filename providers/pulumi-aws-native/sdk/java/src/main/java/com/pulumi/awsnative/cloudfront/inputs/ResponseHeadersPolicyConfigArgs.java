// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyConfigArgs Empty = new ResponseHeadersPolicyConfigArgs();

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="corsConfig")
    private @Nullable Output<ResponseHeadersPolicyCorsConfigArgs> corsConfig;

    public Optional<Output<ResponseHeadersPolicyCorsConfigArgs>> corsConfig() {
        return Optional.ofNullable(this.corsConfig);
    }

    @Import(name="customHeadersConfig")
    private @Nullable Output<ResponseHeadersPolicyCustomHeadersConfigArgs> customHeadersConfig;

    public Optional<Output<ResponseHeadersPolicyCustomHeadersConfigArgs>> customHeadersConfig() {
        return Optional.ofNullable(this.customHeadersConfig);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="securityHeadersConfig")
    private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigArgs> securityHeadersConfig;

    public Optional<Output<ResponseHeadersPolicySecurityHeadersConfigArgs>> securityHeadersConfig() {
        return Optional.ofNullable(this.securityHeadersConfig);
    }

    private ResponseHeadersPolicyConfigArgs() {}

    private ResponseHeadersPolicyConfigArgs(ResponseHeadersPolicyConfigArgs $) {
        this.comment = $.comment;
        this.corsConfig = $.corsConfig;
        this.customHeadersConfig = $.customHeadersConfig;
        this.name = $.name;
        this.securityHeadersConfig = $.securityHeadersConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyConfigArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyConfigArgs();
        }

        public Builder(ResponseHeadersPolicyConfigArgs defaults) {
            $ = new ResponseHeadersPolicyConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder corsConfig(@Nullable Output<ResponseHeadersPolicyCorsConfigArgs> corsConfig) {
            $.corsConfig = corsConfig;
            return this;
        }

        public Builder corsConfig(ResponseHeadersPolicyCorsConfigArgs corsConfig) {
            return corsConfig(Output.of(corsConfig));
        }

        public Builder customHeadersConfig(@Nullable Output<ResponseHeadersPolicyCustomHeadersConfigArgs> customHeadersConfig) {
            $.customHeadersConfig = customHeadersConfig;
            return this;
        }

        public Builder customHeadersConfig(ResponseHeadersPolicyCustomHeadersConfigArgs customHeadersConfig) {
            return customHeadersConfig(Output.of(customHeadersConfig));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder securityHeadersConfig(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigArgs> securityHeadersConfig) {
            $.securityHeadersConfig = securityHeadersConfig;
            return this;
        }

        public Builder securityHeadersConfig(ResponseHeadersPolicySecurityHeadersConfigArgs securityHeadersConfig) {
            return securityHeadersConfig(Output.of(securityHeadersConfig));
        }

        public ResponseHeadersPolicyConfigArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
