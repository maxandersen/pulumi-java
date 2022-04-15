// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.inputs.KeyVaultContractCreatePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamedValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamedValueArgs Empty = new NamedValueArgs();

    /**
     * Unique name of NamedValue. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * KeyVault location details of the namedValue.
     * 
     */
    @Import(name="keyVault")
      private final @Nullable Output<KeyVaultContractCreatePropertiesArgs> keyVault;

    public Output<KeyVaultContractCreatePropertiesArgs> keyVault() {
        return this.keyVault == null ? Codegen.empty() : this.keyVault;
    }

    /**
     * Identifier of the NamedValue.
     * 
     */
    @Import(name="namedValueId")
      private final @Nullable Output<String> namedValueId;

    public Output<String> namedValueId() {
        return this.namedValueId == null ? Codegen.empty() : this.namedValueId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<Boolean> secret;

    public Output<Boolean> secret() {
        return this.secret == null ? Codegen.empty() : this.secret;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Optional tags that when provided can be used to filter the NamedValue list.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Value of the NamedValue. Can contain policy expressions. It may not be empty or consist only of whitespace. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public NamedValueArgs(
        Output<String> displayName,
        @Nullable Output<KeyVaultContractCreatePropertiesArgs> keyVault,
        @Nullable Output<String> namedValueId,
        Output<String> resourceGroupName,
        @Nullable Output<Boolean> secret,
        Output<String> serviceName,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> value) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.keyVault = keyVault;
        this.namedValueId = namedValueId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secret = secret;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tags = tags;
        this.value = value;
    }

    private NamedValueArgs() {
        this.displayName = Codegen.empty();
        this.keyVault = Codegen.empty();
        this.namedValueId = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.secret = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.tags = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> displayName;
        private @Nullable Output<KeyVaultContractCreatePropertiesArgs> keyVault;
        private @Nullable Output<String> namedValueId;
        private Output<String> resourceGroupName;
        private @Nullable Output<Boolean> secret;
        private Output<String> serviceName;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.keyVault = defaults.keyVault;
    	      this.namedValueId = defaults.namedValueId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secret = defaults.secret;
    	      this.serviceName = defaults.serviceName;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder keyVault(@Nullable Output<KeyVaultContractCreatePropertiesArgs> keyVault) {
            this.keyVault = keyVault;
            return this;
        }
        public Builder keyVault(@Nullable KeyVaultContractCreatePropertiesArgs keyVault) {
            this.keyVault = Codegen.ofNullable(keyVault);
            return this;
        }
        public Builder namedValueId(@Nullable Output<String> namedValueId) {
            this.namedValueId = namedValueId;
            return this;
        }
        public Builder namedValueId(@Nullable String namedValueId) {
            this.namedValueId = Codegen.ofNullable(namedValueId);
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
        public Builder secret(@Nullable Output<Boolean> secret) {
            this.secret = secret;
            return this;
        }
        public Builder secret(@Nullable Boolean secret) {
            this.secret = Codegen.ofNullable(secret);
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public NamedValueArgs build() {
            return new NamedValueArgs(displayName, keyVault, namedValueId, resourceGroupName, secret, serviceName, tags, value);
        }
    }
}
