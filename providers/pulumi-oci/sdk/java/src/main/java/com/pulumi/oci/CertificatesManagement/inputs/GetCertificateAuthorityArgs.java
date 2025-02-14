// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateAuthorityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityArgs Empty = new GetCertificateAuthorityArgs();

    /**
     * The OCID of the certificate authority (CA).
     * 
     */
    @Import(name="certificateAuthorityId", required=true)
    private String certificateAuthorityId;

    /**
     * @return The OCID of the certificate authority (CA).
     * 
     */
    public String certificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    private GetCertificateAuthorityArgs() {}

    private GetCertificateAuthorityArgs(GetCertificateAuthorityArgs $) {
        this.certificateAuthorityId = $.certificateAuthorityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateAuthorityArgs $;

        public Builder() {
            $ = new GetCertificateAuthorityArgs();
        }

        public Builder(GetCertificateAuthorityArgs defaults) {
            $ = new GetCertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateAuthorityId The OCID of the certificate authority (CA).
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            $.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        public GetCertificateAuthorityArgs build() {
            $.certificateAuthorityId = Objects.requireNonNull($.certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
            return $;
        }
    }

}
