// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudiot_v1.inputs.PublicKeyCertificateArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A server-stored registry credential used to validate device credentials.
 * 
 */
public final class RegistryCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryCredentialArgs Empty = new RegistryCredentialArgs();

    /**
     * A public key certificate used to verify the device credentials.
     * 
     */
    @Import(name="publicKeyCertificate")
      private final @Nullable Output<PublicKeyCertificateArgs> publicKeyCertificate;

    public Output<PublicKeyCertificateArgs> publicKeyCertificate() {
        return this.publicKeyCertificate == null ? Codegen.empty() : this.publicKeyCertificate;
    }

    public RegistryCredentialArgs(@Nullable Output<PublicKeyCertificateArgs> publicKeyCertificate) {
        this.publicKeyCertificate = publicKeyCertificate;
    }

    private RegistryCredentialArgs() {
        this.publicKeyCertificate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PublicKeyCertificateArgs> publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder publicKeyCertificate(@Nullable Output<PublicKeyCertificateArgs> publicKeyCertificate) {
            this.publicKeyCertificate = publicKeyCertificate;
            return this;
        }
        public Builder publicKeyCertificate(@Nullable PublicKeyCertificateArgs publicKeyCertificate) {
            this.publicKeyCertificate = Codegen.ofNullable(publicKeyCertificate);
            return this;
        }        public RegistryCredentialArgs build() {
            return new RegistryCredentialArgs(publicKeyCertificate);
        }
    }
}
