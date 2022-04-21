// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbilling_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBillingAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBillingAccountArgs Empty = new GetBillingAccountArgs();

    @Import(name="billingAccountId", required=true)
    private String billingAccountId;

    public String billingAccountId() {
        return this.billingAccountId;
    }

    private GetBillingAccountArgs() {}

    private GetBillingAccountArgs(GetBillingAccountArgs $) {
        this.billingAccountId = $.billingAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBillingAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBillingAccountArgs $;

        public Builder() {
            $ = new GetBillingAccountArgs();
        }

        public Builder(GetBillingAccountArgs defaults) {
            $ = new GetBillingAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder billingAccountId(String billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        public GetBillingAccountArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            return $;
        }
    }

}
