// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Email.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDkimArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDkimArgs Empty = new GetDkimArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this DKIM.
     * 
     */
    @Import(name="dkimId", required=true)
    private String dkimId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this DKIM.
     * 
     */
    public String dkimId() {
        return this.dkimId;
    }

    private GetDkimArgs() {}

    private GetDkimArgs(GetDkimArgs $) {
        this.dkimId = $.dkimId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDkimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDkimArgs $;

        public Builder() {
            $ = new GetDkimArgs();
        }

        public Builder(GetDkimArgs defaults) {
            $ = new GetDkimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dkimId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this DKIM.
         * 
         * @return builder
         * 
         */
        public Builder dkimId(String dkimId) {
            $.dkimId = dkimId;
            return this;
        }

        public GetDkimArgs build() {
            $.dkimId = Objects.requireNonNull($.dkimId, "expected parameter 'dkimId' to be non-null");
            return $;
        }
    }

}
