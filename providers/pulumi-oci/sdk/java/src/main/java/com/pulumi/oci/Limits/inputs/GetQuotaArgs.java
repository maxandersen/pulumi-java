// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Limits.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQuotaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQuotaArgs Empty = new GetQuotaArgs();

    /**
     * The OCID of the quota.
     * 
     */
    @Import(name="quotaId", required=true)
    private String quotaId;

    /**
     * @return The OCID of the quota.
     * 
     */
    public String quotaId() {
        return this.quotaId;
    }

    private GetQuotaArgs() {}

    private GetQuotaArgs(GetQuotaArgs $) {
        this.quotaId = $.quotaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQuotaArgs $;

        public Builder() {
            $ = new GetQuotaArgs();
        }

        public Builder(GetQuotaArgs defaults) {
            $ = new GetQuotaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param quotaId The OCID of the quota.
         * 
         * @return builder
         * 
         */
        public Builder quotaId(String quotaId) {
            $.quotaId = quotaId;
            return this;
        }

        public GetQuotaArgs build() {
            $.quotaId = Objects.requireNonNull($.quotaId, "expected parameter 'quotaId' to be non-null");
            return $;
        }
    }

}
