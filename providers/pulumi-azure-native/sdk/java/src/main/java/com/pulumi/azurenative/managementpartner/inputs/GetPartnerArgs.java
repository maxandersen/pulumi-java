// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managementpartner.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPartnerArgs extends InvokeArgs {

    public static final GetPartnerArgs Empty = new GetPartnerArgs();

    /**
     * Id of the Partner
     * 
     */
    @Import(name="partnerId", required=true)
    private String partnerId;

    /**
     * @return Id of the Partner
     * 
     */
    public String partnerId() {
        return this.partnerId;
    }

    private GetPartnerArgs() {}

    private GetPartnerArgs(GetPartnerArgs $) {
        this.partnerId = $.partnerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPartnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPartnerArgs $;

        public Builder() {
            $ = new GetPartnerArgs();
        }

        public Builder(GetPartnerArgs defaults) {
            $ = new GetPartnerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partnerId Id of the Partner
         * 
         * @return builder
         * 
         */
        public Builder partnerId(String partnerId) {
            $.partnerId = partnerId;
            return this;
        }

        public GetPartnerArgs build() {
            $.partnerId = Objects.requireNonNull($.partnerId, "expected parameter 'partnerId' to be non-null");
            return $;
        }
    }

}
