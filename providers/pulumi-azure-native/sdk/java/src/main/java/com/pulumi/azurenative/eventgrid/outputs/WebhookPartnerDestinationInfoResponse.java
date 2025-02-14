// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.azurenative.eventgrid.outputs.AzureADPartnerClientAuthenticationResponse;
import com.pulumi.azurenative.eventgrid.outputs.ResourceMoveChangeHistoryResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookPartnerDestinationInfoResponse {
    /**
     * @return Azure subscription ID of the subscriber. The partner destination associated with the channel will be
     * created under this Azure subscription.
     * 
     */
    private final @Nullable String azureSubscriptionId;
    /**
     * @return Partner client authentication
     * 
     */
    private final @Nullable AzureADPartnerClientAuthenticationResponse clientAuthentication;
    /**
     * @return The base URL that represents the endpoint of the partner destination.
     * 
     */
    private final @Nullable String endpointBaseUrl;
    /**
     * @return Additional context of the partner destination endpoint.
     * 
     */
    private final @Nullable String endpointServiceContext;
    /**
     * @return Type of the endpoint for the partner destination
     * Expected value is &#39;WebHook&#39;.
     * 
     */
    private final String endpointType;
    /**
     * @return The URL that represents the endpoint of the partner destination.
     * 
     */
    private final @Nullable String endpointUrl;
    /**
     * @return Name of the partner destination associated with the channel.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Azure Resource Group of the subscriber. The partner destination associated with the channel will be
     * created under this resource group.
     * 
     */
    private final @Nullable String resourceGroupName;
    /**
     * @return Change history of the resource move.
     * 
     */
    private final @Nullable List<ResourceMoveChangeHistoryResponse> resourceMoveChangeHistory;

    @CustomType.Constructor
    private WebhookPartnerDestinationInfoResponse(
        @CustomType.Parameter("azureSubscriptionId") @Nullable String azureSubscriptionId,
        @CustomType.Parameter("clientAuthentication") @Nullable AzureADPartnerClientAuthenticationResponse clientAuthentication,
        @CustomType.Parameter("endpointBaseUrl") @Nullable String endpointBaseUrl,
        @CustomType.Parameter("endpointServiceContext") @Nullable String endpointServiceContext,
        @CustomType.Parameter("endpointType") String endpointType,
        @CustomType.Parameter("endpointUrl") @Nullable String endpointUrl,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("resourceMoveChangeHistory") @Nullable List<ResourceMoveChangeHistoryResponse> resourceMoveChangeHistory) {
        this.azureSubscriptionId = azureSubscriptionId;
        this.clientAuthentication = clientAuthentication;
        this.endpointBaseUrl = endpointBaseUrl;
        this.endpointServiceContext = endpointServiceContext;
        this.endpointType = endpointType;
        this.endpointUrl = endpointUrl;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.resourceMoveChangeHistory = resourceMoveChangeHistory;
    }

    /**
     * @return Azure subscription ID of the subscriber. The partner destination associated with the channel will be
     * created under this Azure subscription.
     * 
     */
    public Optional<String> azureSubscriptionId() {
        return Optional.ofNullable(this.azureSubscriptionId);
    }
    /**
     * @return Partner client authentication
     * 
     */
    public Optional<AzureADPartnerClientAuthenticationResponse> clientAuthentication() {
        return Optional.ofNullable(this.clientAuthentication);
    }
    /**
     * @return The base URL that represents the endpoint of the partner destination.
     * 
     */
    public Optional<String> endpointBaseUrl() {
        return Optional.ofNullable(this.endpointBaseUrl);
    }
    /**
     * @return Additional context of the partner destination endpoint.
     * 
     */
    public Optional<String> endpointServiceContext() {
        return Optional.ofNullable(this.endpointServiceContext);
    }
    /**
     * @return Type of the endpoint for the partner destination
     * Expected value is &#39;WebHook&#39;.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return The URL that represents the endpoint of the partner destination.
     * 
     */
    public Optional<String> endpointUrl() {
        return Optional.ofNullable(this.endpointUrl);
    }
    /**
     * @return Name of the partner destination associated with the channel.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Azure Resource Group of the subscriber. The partner destination associated with the channel will be
     * created under this resource group.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return Change history of the resource move.
     * 
     */
    public List<ResourceMoveChangeHistoryResponse> resourceMoveChangeHistory() {
        return this.resourceMoveChangeHistory == null ? List.of() : this.resourceMoveChangeHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookPartnerDestinationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureSubscriptionId;
        private @Nullable AzureADPartnerClientAuthenticationResponse clientAuthentication;
        private @Nullable String endpointBaseUrl;
        private @Nullable String endpointServiceContext;
        private String endpointType;
        private @Nullable String endpointUrl;
        private @Nullable String name;
        private @Nullable String resourceGroupName;
        private @Nullable List<ResourceMoveChangeHistoryResponse> resourceMoveChangeHistory;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookPartnerDestinationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureSubscriptionId = defaults.azureSubscriptionId;
    	      this.clientAuthentication = defaults.clientAuthentication;
    	      this.endpointBaseUrl = defaults.endpointBaseUrl;
    	      this.endpointServiceContext = defaults.endpointServiceContext;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointUrl = defaults.endpointUrl;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceMoveChangeHistory = defaults.resourceMoveChangeHistory;
        }

        public Builder azureSubscriptionId(@Nullable String azureSubscriptionId) {
            this.azureSubscriptionId = azureSubscriptionId;
            return this;
        }
        public Builder clientAuthentication(@Nullable AzureADPartnerClientAuthenticationResponse clientAuthentication) {
            this.clientAuthentication = clientAuthentication;
            return this;
        }
        public Builder endpointBaseUrl(@Nullable String endpointBaseUrl) {
            this.endpointBaseUrl = endpointBaseUrl;
            return this;
        }
        public Builder endpointServiceContext(@Nullable String endpointServiceContext) {
            this.endpointServiceContext = endpointServiceContext;
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder endpointUrl(@Nullable String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder resourceMoveChangeHistory(@Nullable List<ResourceMoveChangeHistoryResponse> resourceMoveChangeHistory) {
            this.resourceMoveChangeHistory = resourceMoveChangeHistory;
            return this;
        }
        public Builder resourceMoveChangeHistory(ResourceMoveChangeHistoryResponse... resourceMoveChangeHistory) {
            return resourceMoveChangeHistory(List.of(resourceMoveChangeHistory));
        }        public WebhookPartnerDestinationInfoResponse build() {
            return new WebhookPartnerDestinationInfoResponse(azureSubscriptionId, clientAuthentication, endpointBaseUrl, endpointServiceContext, endpointType, endpointUrl, name, resourceGroupName, resourceMoveChangeHistory);
        }
    }
}
