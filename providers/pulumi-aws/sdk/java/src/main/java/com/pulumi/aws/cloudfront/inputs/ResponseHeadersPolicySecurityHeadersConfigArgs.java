// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigArgs();

    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    @Import(name="contentSecurityPolicy")
    private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy;

    /**
     * @return The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    public Optional<Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs>> contentSecurityPolicy() {
        return Optional.ofNullable(this.contentSecurityPolicy);
    }

    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
     */
    @Import(name="contentTypeOptions")
    private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions;

    /**
     * @return Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
     */
    public Optional<Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs>> contentTypeOptions() {
        return Optional.ofNullable(this.contentTypeOptions);
    }

    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    @Import(name="frameOptions")
    private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions;

    /**
     * @return Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    public Optional<Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs>> frameOptions() {
        return Optional.ofNullable(this.frameOptions);
    }

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @Import(name="referrerPolicy")
    private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy;

    /**
     * @return The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    public Optional<Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs>> referrerPolicy() {
        return Optional.ofNullable(this.referrerPolicy);
    }

    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    @Import(name="strictTransportSecurity")
    private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity;

    /**
     * @return Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    public Optional<Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs>> strictTransportSecurity() {
        return Optional.ofNullable(this.strictTransportSecurity);
    }

    /**
     * Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    @Import(name="xssProtection")
    private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection;

    /**
     * @return Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    public Optional<Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs>> xssProtection() {
        return Optional.ofNullable(this.xssProtection);
    }

    private ResponseHeadersPolicySecurityHeadersConfigArgs() {}

    private ResponseHeadersPolicySecurityHeadersConfigArgs(ResponseHeadersPolicySecurityHeadersConfigArgs $) {
        this.contentSecurityPolicy = $.contentSecurityPolicy;
        this.contentTypeOptions = $.contentTypeOptions;
        this.frameOptions = $.frameOptions;
        this.referrerPolicy = $.referrerPolicy;
        this.strictTransportSecurity = $.strictTransportSecurity;
        this.xssProtection = $.xssProtection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicySecurityHeadersConfigArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicySecurityHeadersConfigArgs();
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
            $ = new ResponseHeadersPolicySecurityHeadersConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder contentSecurityPolicy(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy) {
            $.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }

        /**
         * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder contentSecurityPolicy(ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs contentSecurityPolicy) {
            return contentSecurityPolicy(Output.of(contentSecurityPolicy));
        }

        /**
         * @param contentTypeOptions Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
         * 
         * @return builder
         * 
         */
        public Builder contentTypeOptions(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions) {
            $.contentTypeOptions = contentTypeOptions;
            return this;
        }

        /**
         * @param contentTypeOptions Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
         * 
         * @return builder
         * 
         */
        public Builder contentTypeOptions(ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs contentTypeOptions) {
            return contentTypeOptions(Output.of(contentTypeOptions));
        }

        /**
         * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
         * 
         * @return builder
         * 
         */
        public Builder frameOptions(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions) {
            $.frameOptions = frameOptions;
            return this;
        }

        /**
         * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
         * 
         * @return builder
         * 
         */
        public Builder frameOptions(ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs frameOptions) {
            return frameOptions(Output.of(frameOptions));
        }

        /**
         * @param referrerPolicy The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
         * 
         * @return builder
         * 
         */
        public Builder referrerPolicy(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy) {
            $.referrerPolicy = referrerPolicy;
            return this;
        }

        /**
         * @param referrerPolicy The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
         * 
         * @return builder
         * 
         */
        public Builder referrerPolicy(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs referrerPolicy) {
            return referrerPolicy(Output.of(referrerPolicy));
        }

        /**
         * @param strictTransportSecurity Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
         * 
         * @return builder
         * 
         */
        public Builder strictTransportSecurity(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity) {
            $.strictTransportSecurity = strictTransportSecurity;
            return this;
        }

        /**
         * @param strictTransportSecurity Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
         * 
         * @return builder
         * 
         */
        public Builder strictTransportSecurity(ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs strictTransportSecurity) {
            return strictTransportSecurity(Output.of(strictTransportSecurity));
        }

        /**
         * @param xssProtection Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
         * 
         * @return builder
         * 
         */
        public Builder xssProtection(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection) {
            $.xssProtection = xssProtection;
            return this;
        }

        /**
         * @param xssProtection Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
         * 
         * @return builder
         * 
         */
        public Builder xssProtection(ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs xssProtection) {
            return xssProtection(Output.of(xssProtection));
        }

        public ResponseHeadersPolicySecurityHeadersConfigArgs build() {
            return $;
        }
    }

}
