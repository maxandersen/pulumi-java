// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A list of PEM formatted certificates.
 * 
 */
public final class MediaGraphPemCertificateListArgs extends com.pulumi.resources.ResourceArgs {

    public static final MediaGraphPemCertificateListArgs Empty = new MediaGraphPemCertificateListArgs();

    /**
     * PEM formatted public certificates, one per entry.
     * 
     */
    @Import(name="certificates", required=true)
    private Output<List<String>> certificates;

    /**
     * @return PEM formatted public certificates, one per entry.
     * 
     */
    public Output<List<String>> certificates() {
        return this.certificates;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.MediaGraphPemCertificateList&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.MediaGraphPemCertificateList&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private MediaGraphPemCertificateListArgs() {}

    private MediaGraphPemCertificateListArgs(MediaGraphPemCertificateListArgs $) {
        this.certificates = $.certificates;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MediaGraphPemCertificateListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MediaGraphPemCertificateListArgs $;

        public Builder() {
            $ = new MediaGraphPemCertificateListArgs();
        }

        public Builder(MediaGraphPemCertificateListArgs defaults) {
            $ = new MediaGraphPemCertificateListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificates PEM formatted public certificates, one per entry.
         * 
         * @return builder
         * 
         */
        public Builder certificates(Output<List<String>> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates PEM formatted public certificates, one per entry.
         * 
         * @return builder
         * 
         */
        public Builder certificates(List<String> certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param certificates PEM formatted public certificates, one per entry.
         * 
         * @return builder
         * 
         */
        public Builder certificates(String... certificates) {
            return certificates(List.of(certificates));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.MediaGraphPemCertificateList&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.MediaGraphPemCertificateList&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public MediaGraphPemCertificateListArgs build() {
            $.certificates = Objects.requireNonNull($.certificates, "expected parameter 'certificates' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
