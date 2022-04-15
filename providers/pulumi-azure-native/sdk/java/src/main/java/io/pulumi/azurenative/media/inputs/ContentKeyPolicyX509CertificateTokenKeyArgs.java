// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a certificate for token validation.
 * 
 */
public final class ContentKeyPolicyX509CertificateTokenKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyX509CertificateTokenKeyArgs Empty = new ContentKeyPolicyX509CertificateTokenKeyArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET)
     * 
     */
    @Import(name="rawBody", required=true)
      private final Output<String> rawBody;

    public Output<String> rawBody() {
        return this.rawBody;
    }

    public ContentKeyPolicyX509CertificateTokenKeyArgs(
        Output<String> odataType,
        Output<String> rawBody) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.rawBody = Objects.requireNonNull(rawBody, "expected parameter 'rawBody' to be non-null");
    }

    private ContentKeyPolicyX509CertificateTokenKeyArgs() {
        this.odataType = Codegen.empty();
        this.rawBody = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyX509CertificateTokenKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private Output<String> rawBody;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyX509CertificateTokenKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.rawBody = defaults.rawBody;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder rawBody(Output<String> rawBody) {
            this.rawBody = Objects.requireNonNull(rawBody);
            return this;
        }
        public Builder rawBody(String rawBody) {
            this.rawBody = Output.of(Objects.requireNonNull(rawBody));
            return this;
        }        public ContentKeyPolicyX509CertificateTokenKeyArgs build() {
            return new ContentKeyPolicyX509CertificateTokenKeyArgs(odataType, rawBody);
        }
    }
}
