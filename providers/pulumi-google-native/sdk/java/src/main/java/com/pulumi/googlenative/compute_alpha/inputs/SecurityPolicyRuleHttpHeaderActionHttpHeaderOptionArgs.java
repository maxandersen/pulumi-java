// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs Empty = new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs();

    /**
     * The name of the header to set.
     * 
     */
    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    /**
     * The value to set the named header to.
     * 
     */
    @Import(name="headerValue")
    private @Nullable Output<String> headerValue;

    public Optional<Output<String>> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs() {}

    private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs();
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs defaults) {
            $ = new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder headerValue(@Nullable Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        public SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionArgs build() {
            return $;
        }
    }

}
