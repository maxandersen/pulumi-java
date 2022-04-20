// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A list of PEM formatted certificates.
 * 
 */
public final class PemCertificateListResponse extends com.pulumi.resources.InvokeArgs {

    public static final PemCertificateListResponse Empty = new PemCertificateListResponse();

    /**
     * PEM formatted public certificates. One certificate per entry.
     * 
     */
    @Import(name="certificates", required=true)
      private final List<String> certificates;

    public List<String> certificates() {
        return this.certificates;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.PemCertificateList&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public PemCertificateListResponse(
        List<String> certificates,
        String type) {
        this.certificates = Objects.requireNonNull(certificates, "expected parameter 'certificates' to be non-null");
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private PemCertificateListResponse() {
        this.certificates = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PemCertificateListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PemCertificateListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.type = defaults.type;
        }

        public Builder certificates(List<String> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(String... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PemCertificateListResponse build() {
            return new PemCertificateListResponse(certificates, type);
        }
    }
}
