// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * CNAME of the certificate to be issued via free certificate
     * 
     */
    @Import(name="canonicalName")
      private final @Nullable Output<String> canonicalName;

    public Output<String> canonicalName() {
        return this.canonicalName == null ? Codegen.empty() : this.canonicalName;
    }

    /**
     * Method of domain validation for free cert
     * 
     */
    @Import(name="domainValidationMethod")
      private final @Nullable Output<String> domainValidationMethod;

    public Output<String> domainValidationMethod() {
        return this.domainValidationMethod == null ? Codegen.empty() : this.domainValidationMethod;
    }

    /**
     * Host names the certificate applies to.
     * 
     */
    @Import(name="hostNames")
      private final @Nullable Output<List<String>> hostNames;

    public Output<List<String>> hostNames() {
        return this.hostNames == null ? Codegen.empty() : this.hostNames;
    }

    /**
     * Key Vault Csm resource Id.
     * 
     */
    @Import(name="keyVaultId")
      private final @Nullable Output<String> keyVaultId;

    public Output<String> keyVaultId() {
        return this.keyVaultId == null ? Codegen.empty() : this.keyVaultId;
    }

    /**
     * Key Vault secret name.
     * 
     */
    @Import(name="keyVaultSecretName")
      private final @Nullable Output<String> keyVaultSecretName;

    public Output<String> keyVaultSecretName() {
        return this.keyVaultSecretName == null ? Codegen.empty() : this.keyVaultSecretName;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the certificate.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Certificate password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Pfx blob.
     * 
     */
    @Import(name="pfxBlob")
      private final @Nullable Output<String> pfxBlob;

    public Output<String> pfxBlob() {
        return this.pfxBlob == null ? Codegen.empty() : this.pfxBlob;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    @Import(name="serverFarmId")
      private final @Nullable Output<String> serverFarmId;

    public Output<String> serverFarmId() {
        return this.serverFarmId == null ? Codegen.empty() : this.serverFarmId;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public CertificateArgs(
        @Nullable Output<String> canonicalName,
        @Nullable Output<String> domainValidationMethod,
        @Nullable Output<List<String>> hostNames,
        @Nullable Output<String> keyVaultId,
        @Nullable Output<String> keyVaultSecretName,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> password,
        @Nullable Output<String> pfxBlob,
        Output<String> resourceGroupName,
        @Nullable Output<String> serverFarmId,
        @Nullable Output<Map<String,String>> tags) {
        this.canonicalName = canonicalName;
        this.domainValidationMethod = domainValidationMethod;
        this.hostNames = hostNames;
        this.keyVaultId = keyVaultId;
        this.keyVaultSecretName = keyVaultSecretName;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.password = password;
        this.pfxBlob = pfxBlob;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverFarmId = serverFarmId;
        this.tags = tags;
    }

    private CertificateArgs() {
        this.canonicalName = Codegen.empty();
        this.domainValidationMethod = Codegen.empty();
        this.hostNames = Codegen.empty();
        this.keyVaultId = Codegen.empty();
        this.keyVaultSecretName = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.password = Codegen.empty();
        this.pfxBlob = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverFarmId = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> canonicalName;
        private @Nullable Output<String> domainValidationMethod;
        private @Nullable Output<List<String>> hostNames;
        private @Nullable Output<String> keyVaultId;
        private @Nullable Output<String> keyVaultSecretName;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> password;
        private @Nullable Output<String> pfxBlob;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serverFarmId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalName = defaults.canonicalName;
    	      this.domainValidationMethod = defaults.domainValidationMethod;
    	      this.hostNames = defaults.hostNames;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultSecretName = defaults.keyVaultSecretName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.pfxBlob = defaults.pfxBlob;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverFarmId = defaults.serverFarmId;
    	      this.tags = defaults.tags;
        }

        public Builder canonicalName(@Nullable Output<String> canonicalName) {
            this.canonicalName = canonicalName;
            return this;
        }
        public Builder canonicalName(@Nullable String canonicalName) {
            this.canonicalName = Codegen.ofNullable(canonicalName);
            return this;
        }
        public Builder domainValidationMethod(@Nullable Output<String> domainValidationMethod) {
            this.domainValidationMethod = domainValidationMethod;
            return this;
        }
        public Builder domainValidationMethod(@Nullable String domainValidationMethod) {
            this.domainValidationMethod = Codegen.ofNullable(domainValidationMethod);
            return this;
        }
        public Builder hostNames(@Nullable Output<List<String>> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public Builder hostNames(@Nullable List<String> hostNames) {
            this.hostNames = Codegen.ofNullable(hostNames);
            return this;
        }
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Codegen.ofNullable(keyVaultId);
            return this;
        }
        public Builder keyVaultSecretName(@Nullable Output<String> keyVaultSecretName) {
            this.keyVaultSecretName = keyVaultSecretName;
            return this;
        }
        public Builder keyVaultSecretName(@Nullable String keyVaultSecretName) {
            this.keyVaultSecretName = Codegen.ofNullable(keyVaultSecretName);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder pfxBlob(@Nullable Output<String> pfxBlob) {
            this.pfxBlob = pfxBlob;
            return this;
        }
        public Builder pfxBlob(@Nullable String pfxBlob) {
            this.pfxBlob = Codegen.ofNullable(pfxBlob);
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
        public Builder serverFarmId(@Nullable Output<String> serverFarmId) {
            this.serverFarmId = serverFarmId;
            return this;
        }
        public Builder serverFarmId(@Nullable String serverFarmId) {
            this.serverFarmId = Codegen.ofNullable(serverFarmId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(canonicalName, domainValidationMethod, hostNames, keyVaultId, keyVaultSecretName, kind, location, name, password, pfxBlob, resourceGroupName, serverFarmId, tags);
        }
    }
}
