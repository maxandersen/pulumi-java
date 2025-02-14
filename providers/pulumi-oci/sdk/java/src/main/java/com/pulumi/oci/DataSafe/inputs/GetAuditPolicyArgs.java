// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuditPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuditPolicyArgs Empty = new GetAuditPolicyArgs();

    /**
     * Unique audit policy identifier.
     * 
     */
    @Import(name="auditPolicyId", required=true)
    private String auditPolicyId;

    /**
     * @return Unique audit policy identifier.
     * 
     */
    public String auditPolicyId() {
        return this.auditPolicyId;
    }

    private GetAuditPolicyArgs() {}

    private GetAuditPolicyArgs(GetAuditPolicyArgs $) {
        this.auditPolicyId = $.auditPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuditPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuditPolicyArgs $;

        public Builder() {
            $ = new GetAuditPolicyArgs();
        }

        public Builder(GetAuditPolicyArgs defaults) {
            $ = new GetAuditPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditPolicyId Unique audit policy identifier.
         * 
         * @return builder
         * 
         */
        public Builder auditPolicyId(String auditPolicyId) {
            $.auditPolicyId = auditPolicyId;
            return this;
        }

        public GetAuditPolicyArgs build() {
            $.auditPolicyId = Objects.requireNonNull($.auditPolicyId, "expected parameter 'auditPolicyId' to be non-null");
            return $;
        }
    }

}
