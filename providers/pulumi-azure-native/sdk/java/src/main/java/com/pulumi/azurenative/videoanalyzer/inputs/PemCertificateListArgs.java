// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A list of PEM formatted certificates.
 * 
 */
public final class PemCertificateListArgs extends ResourceArgs {

    public static final PemCertificateListArgs Empty = new PemCertificateListArgs();

    /**
     * PEM formatted public certificates. One certificate per entry.
     * 
     */
    @Import(name="certificates", required=true)
    private Output<List<String>> certificates;

    /**
     * @return PEM formatted public certificates. One certificate per entry.
     * 
     */
    public Output<List<String>> certificates() {
        return this.certificates;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.PemCertificateList&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.PemCertificateList&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private PemCertificateListArgs() {}

    private PemCertificateListArgs(PemCertificateListArgs $) {
        this.certificates = $.certificates;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PemCertificateListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PemCertificateListArgs $;

        public Builder() {
            $ = new PemCertificateListArgs();
        }

        public Builder(PemCertificateListArgs defaults) {
            $ = new PemCertificateListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificates PEM formatted public certificates. One certificate per entry.
         * 
         * @return builder
         * 
         */
        public Builder certificates(Output<List<String>> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates PEM formatted public certificates. One certificate per entry.
         * 
         * @return builder
         * 
         */
        public Builder certificates(List<String> certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param certificates PEM formatted public certificates. One certificate per entry.
         * 
         * @return builder
         * 
         */
        public Builder certificates(String... certificates) {
            return certificates(List.of(certificates));
        }

        /**
         * @param type The discriminator for derived types.
         * Expected value is &#39;#Microsoft.VideoAnalyzer.PemCertificateList&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The discriminator for derived types.
         * Expected value is &#39;#Microsoft.VideoAnalyzer.PemCertificateList&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PemCertificateListArgs build() {
            $.certificates = Objects.requireNonNull($.certificates, "expected parameter 'certificates' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
