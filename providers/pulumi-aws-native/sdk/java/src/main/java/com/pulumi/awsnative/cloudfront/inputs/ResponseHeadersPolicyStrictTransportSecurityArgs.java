// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyStrictTransportSecurityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyStrictTransportSecurityArgs Empty = new ResponseHeadersPolicyStrictTransportSecurityArgs();

    @Import(name="accessControlMaxAgeSec", required=true)
    private Output<Integer> accessControlMaxAgeSec;

    public Output<Integer> accessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }

    @Import(name="includeSubdomains")
    private @Nullable Output<Boolean> includeSubdomains;

    public Optional<Output<Boolean>> includeSubdomains() {
        return Optional.ofNullable(this.includeSubdomains);
    }

    @Import(name="override", required=true)
    private Output<Boolean> override;

    public Output<Boolean> override() {
        return this.override;
    }

    @Import(name="preload")
    private @Nullable Output<Boolean> preload;

    public Optional<Output<Boolean>> preload() {
        return Optional.ofNullable(this.preload);
    }

    private ResponseHeadersPolicyStrictTransportSecurityArgs() {}

    private ResponseHeadersPolicyStrictTransportSecurityArgs(ResponseHeadersPolicyStrictTransportSecurityArgs $) {
        this.accessControlMaxAgeSec = $.accessControlMaxAgeSec;
        this.includeSubdomains = $.includeSubdomains;
        this.override = $.override;
        this.preload = $.preload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyStrictTransportSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyStrictTransportSecurityArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyStrictTransportSecurityArgs();
        }

        public Builder(ResponseHeadersPolicyStrictTransportSecurityArgs defaults) {
            $ = new ResponseHeadersPolicyStrictTransportSecurityArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessControlMaxAgeSec(Output<Integer> accessControlMaxAgeSec) {
            $.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }

        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            return accessControlMaxAgeSec(Output.of(accessControlMaxAgeSec));
        }

        public Builder includeSubdomains(@Nullable Output<Boolean> includeSubdomains) {
            $.includeSubdomains = includeSubdomains;
            return this;
        }

        public Builder includeSubdomains(Boolean includeSubdomains) {
            return includeSubdomains(Output.of(includeSubdomains));
        }

        public Builder override(Output<Boolean> override) {
            $.override = override;
            return this;
        }

        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        public Builder preload(@Nullable Output<Boolean> preload) {
            $.preload = preload;
            return this;
        }

        public Builder preload(Boolean preload) {
            return preload(Output.of(preload));
        }

        public ResponseHeadersPolicyStrictTransportSecurityArgs build() {
            $.accessControlMaxAgeSec = Objects.requireNonNull($.accessControlMaxAgeSec, "expected parameter 'accessControlMaxAgeSec' to be non-null");
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            return $;
        }
    }

}
