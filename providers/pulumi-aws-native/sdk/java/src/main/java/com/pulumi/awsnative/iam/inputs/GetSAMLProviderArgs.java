// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSAMLProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSAMLProviderArgs Empty = new GetSAMLProviderArgs();

    /**
     * Amazon Resource Name (ARN) of the SAML provider
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Amazon Resource Name (ARN) of the SAML provider
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetSAMLProviderArgs() {}

    private GetSAMLProviderArgs(GetSAMLProviderArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSAMLProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSAMLProviderArgs $;

        public Builder() {
            $ = new GetSAMLProviderArgs();
        }

        public Builder(GetSAMLProviderArgs defaults) {
            $ = new GetSAMLProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the SAML provider
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetSAMLProviderArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
