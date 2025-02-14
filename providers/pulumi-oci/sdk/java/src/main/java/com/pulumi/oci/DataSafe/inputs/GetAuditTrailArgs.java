// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuditTrailArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuditTrailArgs Empty = new GetAuditTrailArgs();

    /**
     * The OCID of the audit trail.
     * 
     */
    @Import(name="auditTrailId", required=true)
    private String auditTrailId;

    /**
     * @return The OCID of the audit trail.
     * 
     */
    public String auditTrailId() {
        return this.auditTrailId;
    }

    private GetAuditTrailArgs() {}

    private GetAuditTrailArgs(GetAuditTrailArgs $) {
        this.auditTrailId = $.auditTrailId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuditTrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuditTrailArgs $;

        public Builder() {
            $ = new GetAuditTrailArgs();
        }

        public Builder(GetAuditTrailArgs defaults) {
            $ = new GetAuditTrailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditTrailId The OCID of the audit trail.
         * 
         * @return builder
         * 
         */
        public Builder auditTrailId(String auditTrailId) {
            $.auditTrailId = auditTrailId;
            return this;
        }

        public GetAuditTrailArgs build() {
            $.auditTrailId = Objects.requireNonNull($.auditTrailId, "expected parameter 'auditTrailId' to be non-null");
            return $;
        }
    }

}
