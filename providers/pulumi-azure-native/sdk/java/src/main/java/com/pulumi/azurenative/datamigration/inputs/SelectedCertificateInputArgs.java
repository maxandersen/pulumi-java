// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Info for certificate to be exported for TDE enabled databases.
 * 
 */
public final class SelectedCertificateInputArgs extends ResourceArgs {

    public static final SelectedCertificateInputArgs Empty = new SelectedCertificateInputArgs();

    /**
     * Name of certificate to be exported.
     * 
     */
    @Import(name="certificateName", required=true)
    private Output<String> certificateName;

    /**
     * @return Name of certificate to be exported.
     * 
     */
    public Output<String> certificateName() {
        return this.certificateName;
    }

    /**
     * Password to use for encrypting the exported certificate.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password to use for encrypting the exported certificate.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    private SelectedCertificateInputArgs() {}

    private SelectedCertificateInputArgs(SelectedCertificateInputArgs $) {
        this.certificateName = $.certificateName;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SelectedCertificateInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SelectedCertificateInputArgs $;

        public Builder() {
            $ = new SelectedCertificateInputArgs();
        }

        public Builder(SelectedCertificateInputArgs defaults) {
            $ = new SelectedCertificateInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName Name of certificate to be exported.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName Name of certificate to be exported.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param password Password to use for encrypting the exported certificate.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password to use for encrypting the exported certificate.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public SelectedCertificateInputArgs build() {
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            return $;
        }
    }

}
