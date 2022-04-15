// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccountPropertiesResponseManagedResources {
    /**
     * Gets the managed event hub namespace resource identifier.
     * 
     */
    private final String eventHubNamespace;
    /**
     * Gets the managed resource group resource identifier. This resource group will host resource dependencies for the account.
     * 
     */
    private final String resourceGroup;
    /**
     * Gets the managed storage account resource identifier.
     * 
     */
    private final String storageAccount;

    @CustomType.Constructor
    private AccountPropertiesResponseManagedResources(
        @CustomType.Parameter("eventHubNamespace") String eventHubNamespace,
        @CustomType.Parameter("resourceGroup") String resourceGroup,
        @CustomType.Parameter("storageAccount") String storageAccount) {
        this.eventHubNamespace = eventHubNamespace;
        this.resourceGroup = resourceGroup;
        this.storageAccount = storageAccount;
    }

    /**
     * Gets the managed event hub namespace resource identifier.
     * 
    */
    public String eventHubNamespace() {
        return this.eventHubNamespace;
    }
    /**
     * Gets the managed resource group resource identifier. This resource group will host resource dependencies for the account.
     * 
    */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Gets the managed storage account resource identifier.
     * 
    */
    public String storageAccount() {
        return this.storageAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountPropertiesResponseManagedResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventHubNamespace;
        private String resourceGroup;
        private String storageAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountPropertiesResponseManagedResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubNamespace = defaults.eventHubNamespace;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccount = defaults.storageAccount;
        }

        public Builder eventHubNamespace(String eventHubNamespace) {
            this.eventHubNamespace = Objects.requireNonNull(eventHubNamespace);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public Builder storageAccount(String storageAccount) {
            this.storageAccount = Objects.requireNonNull(storageAccount);
            return this;
        }        public AccountPropertiesResponseManagedResources build() {
            return new AccountPropertiesResponseManagedResources(eventHubNamespace, resourceGroup, storageAccount);
        }
    }
}
