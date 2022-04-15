// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.azurenative.datalakestore.enums.EncryptionState;
import io.pulumi.azurenative.datalakestore.enums.FirewallAllowAzureIpsState;
import io.pulumi.azurenative.datalakestore.enums.FirewallState;
import io.pulumi.azurenative.datalakestore.enums.TierType;
import io.pulumi.azurenative.datalakestore.enums.TrustedIdProviderState;
import io.pulumi.azurenative.datalakestore.inputs.CreateFirewallRuleWithAccountParametersArgs;
import io.pulumi.azurenative.datalakestore.inputs.CreateTrustedIdProviderWithAccountParametersArgs;
import io.pulumi.azurenative.datalakestore.inputs.CreateVirtualNetworkRuleWithAccountParametersArgs;
import io.pulumi.azurenative.datalakestore.inputs.EncryptionConfigArgs;
import io.pulumi.azurenative.datalakestore.inputs.EncryptionIdentityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * The default owner group for all new folders and files created in the Data Lake Store account.
     * 
     */
    @Import(name="defaultGroup")
      private final @Nullable Output<String> defaultGroup;

    public Output<String> defaultGroup() {
        return this.defaultGroup == null ? Codegen.empty() : this.defaultGroup;
    }

    /**
     * The Key Vault encryption configuration.
     * 
     */
    @Import(name="encryptionConfig")
      private final @Nullable Output<EncryptionConfigArgs> encryptionConfig;

    public Output<EncryptionConfigArgs> encryptionConfig() {
        return this.encryptionConfig == null ? Codegen.empty() : this.encryptionConfig;
    }

    /**
     * The current state of encryption for this Data Lake Store account.
     * 
     */
    @Import(name="encryptionState")
      private final @Nullable Output<EncryptionState> encryptionState;

    public Output<EncryptionState> encryptionState() {
        return this.encryptionState == null ? Codegen.empty() : this.encryptionState;
    }

    /**
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    @Import(name="firewallAllowAzureIps")
      private final @Nullable Output<FirewallAllowAzureIpsState> firewallAllowAzureIps;

    public Output<FirewallAllowAzureIpsState> firewallAllowAzureIps() {
        return this.firewallAllowAzureIps == null ? Codegen.empty() : this.firewallAllowAzureIps;
    }

    /**
     * The list of firewall rules associated with this Data Lake Store account.
     * 
     */
    @Import(name="firewallRules")
      private final @Nullable Output<List<CreateFirewallRuleWithAccountParametersArgs>> firewallRules;

    public Output<List<CreateFirewallRuleWithAccountParametersArgs>> firewallRules() {
        return this.firewallRules == null ? Codegen.empty() : this.firewallRules;
    }

    /**
     * The current state of the IP address firewall for this Data Lake Store account.
     * 
     */
    @Import(name="firewallState")
      private final @Nullable Output<FirewallState> firewallState;

    public Output<FirewallState> firewallState() {
        return this.firewallState == null ? Codegen.empty() : this.firewallState;
    }

    /**
     * The Key Vault encryption identity, if any.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<EncryptionIdentityArgs> identity;

    public Output<EncryptionIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
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
     * The commitment tier to use for next month.
     * 
     */
    @Import(name="newTier")
      private final @Nullable Output<TierType> newTier;

    public Output<TierType> newTier() {
        return this.newTier == null ? Codegen.empty() : this.newTier;
    }

    /**
     * The name of the Azure resource group.
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

    /**
     * The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
     */
    @Import(name="trustedIdProviderState")
      private final @Nullable Output<TrustedIdProviderState> trustedIdProviderState;

    public Output<TrustedIdProviderState> trustedIdProviderState() {
        return this.trustedIdProviderState == null ? Codegen.empty() : this.trustedIdProviderState;
    }

    /**
     * The list of trusted identity providers associated with this Data Lake Store account.
     * 
     */
    @Import(name="trustedIdProviders")
      private final @Nullable Output<List<CreateTrustedIdProviderWithAccountParametersArgs>> trustedIdProviders;

    public Output<List<CreateTrustedIdProviderWithAccountParametersArgs>> trustedIdProviders() {
        return this.trustedIdProviders == null ? Codegen.empty() : this.trustedIdProviders;
    }

    /**
     * The list of virtual network rules associated with this Data Lake Store account.
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable Output<List<CreateVirtualNetworkRuleWithAccountParametersArgs>> virtualNetworkRules;

    public Output<List<CreateVirtualNetworkRuleWithAccountParametersArgs>> virtualNetworkRules() {
        return this.virtualNetworkRules == null ? Codegen.empty() : this.virtualNetworkRules;
    }

    public AccountArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<String> defaultGroup,
        @Nullable Output<EncryptionConfigArgs> encryptionConfig,
        @Nullable Output<EncryptionState> encryptionState,
        @Nullable Output<FirewallAllowAzureIpsState> firewallAllowAzureIps,
        @Nullable Output<List<CreateFirewallRuleWithAccountParametersArgs>> firewallRules,
        @Nullable Output<FirewallState> firewallState,
        @Nullable Output<EncryptionIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<TierType> newTier,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<TrustedIdProviderState> trustedIdProviderState,
        @Nullable Output<List<CreateTrustedIdProviderWithAccountParametersArgs>> trustedIdProviders,
        @Nullable Output<List<CreateVirtualNetworkRuleWithAccountParametersArgs>> virtualNetworkRules) {
        this.accountName = accountName;
        this.defaultGroup = defaultGroup;
        this.encryptionConfig = encryptionConfig;
        this.encryptionState = encryptionState;
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        this.firewallRules = firewallRules;
        this.firewallState = firewallState;
        this.identity = identity;
        this.location = location;
        this.newTier = newTier;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.trustedIdProviderState = trustedIdProviderState;
        this.trustedIdProviders = trustedIdProviders;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private AccountArgs() {
        this.accountName = Codegen.empty();
        this.defaultGroup = Codegen.empty();
        this.encryptionConfig = Codegen.empty();
        this.encryptionState = Codegen.empty();
        this.firewallAllowAzureIps = Codegen.empty();
        this.firewallRules = Codegen.empty();
        this.firewallState = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.newTier = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.trustedIdProviderState = Codegen.empty();
        this.trustedIdProviders = Codegen.empty();
        this.virtualNetworkRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<String> defaultGroup;
        private @Nullable Output<EncryptionConfigArgs> encryptionConfig;
        private @Nullable Output<EncryptionState> encryptionState;
        private @Nullable Output<FirewallAllowAzureIpsState> firewallAllowAzureIps;
        private @Nullable Output<List<CreateFirewallRuleWithAccountParametersArgs>> firewallRules;
        private @Nullable Output<FirewallState> firewallState;
        private @Nullable Output<EncryptionIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<TierType> newTier;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<TrustedIdProviderState> trustedIdProviderState;
        private @Nullable Output<List<CreateTrustedIdProviderWithAccountParametersArgs>> trustedIdProviders;
        private @Nullable Output<List<CreateVirtualNetworkRuleWithAccountParametersArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.defaultGroup = defaults.defaultGroup;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.encryptionState = defaults.encryptionState;
    	      this.firewallAllowAzureIps = defaults.firewallAllowAzureIps;
    	      this.firewallRules = defaults.firewallRules;
    	      this.firewallState = defaults.firewallState;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.newTier = defaults.newTier;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.trustedIdProviderState = defaults.trustedIdProviderState;
    	      this.trustedIdProviders = defaults.trustedIdProviders;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder defaultGroup(@Nullable Output<String> defaultGroup) {
            this.defaultGroup = defaultGroup;
            return this;
        }
        public Builder defaultGroup(@Nullable String defaultGroup) {
            this.defaultGroup = Codegen.ofNullable(defaultGroup);
            return this;
        }
        public Builder encryptionConfig(@Nullable Output<EncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable EncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Codegen.ofNullable(encryptionConfig);
            return this;
        }
        public Builder encryptionState(@Nullable Output<EncryptionState> encryptionState) {
            this.encryptionState = encryptionState;
            return this;
        }
        public Builder encryptionState(@Nullable EncryptionState encryptionState) {
            this.encryptionState = Codegen.ofNullable(encryptionState);
            return this;
        }
        public Builder firewallAllowAzureIps(@Nullable Output<FirewallAllowAzureIpsState> firewallAllowAzureIps) {
            this.firewallAllowAzureIps = firewallAllowAzureIps;
            return this;
        }
        public Builder firewallAllowAzureIps(@Nullable FirewallAllowAzureIpsState firewallAllowAzureIps) {
            this.firewallAllowAzureIps = Codegen.ofNullable(firewallAllowAzureIps);
            return this;
        }
        public Builder firewallRules(@Nullable Output<List<CreateFirewallRuleWithAccountParametersArgs>> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }
        public Builder firewallRules(@Nullable List<CreateFirewallRuleWithAccountParametersArgs> firewallRules) {
            this.firewallRules = Codegen.ofNullable(firewallRules);
            return this;
        }
        public Builder firewallRules(CreateFirewallRuleWithAccountParametersArgs... firewallRules) {
            return firewallRules(List.of(firewallRules));
        }
        public Builder firewallState(@Nullable Output<FirewallState> firewallState) {
            this.firewallState = firewallState;
            return this;
        }
        public Builder firewallState(@Nullable FirewallState firewallState) {
            this.firewallState = Codegen.ofNullable(firewallState);
            return this;
        }
        public Builder identity(@Nullable Output<EncryptionIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable EncryptionIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
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
        public Builder newTier(@Nullable Output<TierType> newTier) {
            this.newTier = newTier;
            return this;
        }
        public Builder newTier(@Nullable TierType newTier) {
            this.newTier = Codegen.ofNullable(newTier);
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
        }
        public Builder trustedIdProviderState(@Nullable Output<TrustedIdProviderState> trustedIdProviderState) {
            this.trustedIdProviderState = trustedIdProviderState;
            return this;
        }
        public Builder trustedIdProviderState(@Nullable TrustedIdProviderState trustedIdProviderState) {
            this.trustedIdProviderState = Codegen.ofNullable(trustedIdProviderState);
            return this;
        }
        public Builder trustedIdProviders(@Nullable Output<List<CreateTrustedIdProviderWithAccountParametersArgs>> trustedIdProviders) {
            this.trustedIdProviders = trustedIdProviders;
            return this;
        }
        public Builder trustedIdProviders(@Nullable List<CreateTrustedIdProviderWithAccountParametersArgs> trustedIdProviders) {
            this.trustedIdProviders = Codegen.ofNullable(trustedIdProviders);
            return this;
        }
        public Builder trustedIdProviders(CreateTrustedIdProviderWithAccountParametersArgs... trustedIdProviders) {
            return trustedIdProviders(List.of(trustedIdProviders));
        }
        public Builder virtualNetworkRules(@Nullable Output<List<CreateVirtualNetworkRuleWithAccountParametersArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(@Nullable List<CreateVirtualNetworkRuleWithAccountParametersArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Codegen.ofNullable(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(CreateVirtualNetworkRuleWithAccountParametersArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public AccountArgs build() {
            return new AccountArgs(accountName, defaultGroup, encryptionConfig, encryptionState, firewallAllowAzureIps, firewallRules, firewallState, identity, location, newTier, resourceGroupName, tags, trustedIdProviderState, trustedIdProviders, virtualNetworkRules);
        }
    }
}
