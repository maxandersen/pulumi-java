// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.KeyVaultKeyReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationAccountCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountCertificateArgs Empty = new IntegrationAccountCertificateArgs();

    /**
     * The integration account certificate name.
     * 
     */
    @Import(name="certificateName")
      private final @Nullable Output<String> certificateName;

    public Output<String> certificateName() {
        return this.certificateName == null ? Codegen.empty() : this.certificateName;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
      private final Output<String> integrationAccountName;

    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key details in the key vault.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<KeyVaultKeyReferenceArgs> key;

    public Output<KeyVaultKeyReferenceArgs> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Object> metadata;

    public Output<Object> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The public certificate.
     * 
     */
    @Import(name="publicCertificate")
      private final @Nullable Output<String> publicCertificate;

    public Output<String> publicCertificate() {
        return this.publicCertificate == null ? Codegen.empty() : this.publicCertificate;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public IntegrationAccountCertificateArgs(
        @Nullable Output<String> certificateName,
        Output<String> integrationAccountName,
        @Nullable Output<KeyVaultKeyReferenceArgs> key,
        @Nullable Output<String> location,
        @Nullable Output<Object> metadata,
        @Nullable Output<String> publicCertificate,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.certificateName = certificateName;
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.key = key;
        this.location = location;
        this.metadata = metadata;
        this.publicCertificate = publicCertificate;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private IntegrationAccountCertificateArgs() {
        this.certificateName = Codegen.empty();
        this.integrationAccountName = Codegen.empty();
        this.key = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.publicCertificate = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateName;
        private Output<String> integrationAccountName;
        private @Nullable Output<KeyVaultKeyReferenceArgs> key;
        private @Nullable Output<String> location;
        private @Nullable Output<Object> metadata;
        private @Nullable Output<String> publicCertificate;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.key = defaults.key;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.publicCertificate = defaults.publicCertificate;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder certificateName(@Nullable Output<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = Codegen.ofNullable(certificateName);
            return this;
        }
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }
        public Builder integrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Output.of(Objects.requireNonNull(integrationAccountName));
            return this;
        }
        public Builder key(@Nullable Output<KeyVaultKeyReferenceArgs> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable KeyVaultKeyReferenceArgs key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metadata(@Nullable Output<Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder publicCertificate(@Nullable Output<String> publicCertificate) {
            this.publicCertificate = publicCertificate;
            return this;
        }
        public Builder publicCertificate(@Nullable String publicCertificate) {
            this.publicCertificate = Codegen.ofNullable(publicCertificate);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public IntegrationAccountCertificateArgs build() {
            return new IntegrationAccountCertificateArgs(certificateName, integrationAccountName, key, location, metadata, publicCertificate, resourceGroupName, tags);
        }
    }
}
